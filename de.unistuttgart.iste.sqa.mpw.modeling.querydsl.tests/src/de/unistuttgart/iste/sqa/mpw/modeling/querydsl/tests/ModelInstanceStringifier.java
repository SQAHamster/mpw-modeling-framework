package de.unistuttgart.iste.sqa.mpw.modeling.querydsl.tests;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

public class ModelInstanceStringifier {
	private String indent = "";
	private StringBuilder sb = new StringBuilder();
	
	private ModelInstanceStringifier() {
	}
	
	public static String toString(EObject eObject) {
		return new ModelInstanceStringifier().stringify(eObject);
	}
	
	private String stringify(EObject eObject) {
		dump(eObject);
		return sb.toString().trim();
	}
	
	private void dump(EObject eObject) {
		var eClass = eObject.eClass();
		sb.append(eObject.eClass().getName());

		var nameFeature = eClass.getEStructuralFeature("name");
		if (nameFeature != null) {
			var name = eObject.eGet(nameFeature);
			if (name != null) {
				sb.append(" ").append(eObject.eGet(nameFeature));
			}
		}
		sb.append(":\n");
		increaseIndent();
		
		eClass.getEAllAttributes().stream()
		      .filter(a -> !a.getName().equals("name"))
		      .forEach(attribute -> {
			Object attributeValue = eObject.eGet(attribute);
			if (attributeValue != null) {
				sb.append(indent).append(attribute.getName()).append(": ").append(attributeValue).append("\n");
			}
		});
		
		for (var reference : eClass.getEAllReferences()) {
			var eReferencedObject = eObject.eGet(reference);
			if (eReferencedObject instanceof EObject) {
				sb.append(indent).append(reference.getName()).append(": ");
				dump((EObject)eReferencedObject);
			} else if (eReferencedObject instanceof EList<?>) {
				var references = (EList<?>)eReferencedObject;
				sb.append(indent).append(reference.getName()).append(": [\n");
				
				increaseIndent();
				for (var o : references) {
					sb.append(indent);
					dump((EObject)o);
				}
				decreaseIndent();
				sb.append(indent).append("]\n");
			}
		}
		
		decreaseIndent();
	}

	private void increaseIndent() {
		indent += "  ";
	}

	private void decreaseIndent() {
		indent = indent.substring(0, indent.length()-2);
	}
}
