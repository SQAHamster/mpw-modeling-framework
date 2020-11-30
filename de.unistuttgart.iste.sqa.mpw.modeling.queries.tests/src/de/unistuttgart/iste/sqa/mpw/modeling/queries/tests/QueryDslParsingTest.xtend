/*
 * generated by Xtext 2.23.0
 */
package de.unistuttgart.iste.sqa.mpw.modeling.queries.tests

import com.google.inject.Inject
import de.unistuttgart.iste.sqa.mpw.modeling.queries.querydsl.Model
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith

@ExtendWith(InjectionExtension)
@InjectWith(QueryDslInjectorProvider)
class QueryDslParsingTest {
	@Inject
	ParseHelper<Model> parseHelper
	
	@Test
	def void givenSimpleQuery_whenParse_thenSucceeds() {
		val result = parseHelper.parse('''
			context Hamster
			query myQuery: self;
		''')
		assertModel(result, '''
		    Model:
		      context: Context myQuery:
		        className: Hamster
		        kind: query
		      expressions: [
		        Expression:
		          statements: [
		            Statement:
		              target: self
		          ]
		      ]
		''')
	}
	
	@Test
	def void givenPreconditionUsingQuery_whenParse_thenSucceeds() {
		val result = parseHelper.parse('''
			context Hamster
			precondition myCommand: self.myQuery();
		''')
		assertModel(result, '''
		    Model:
		      context: Context myCommand:
		        className: Hamster
		        kind: precondition
		      expressions: [
		        Expression:
		          statements: [
		            Statement:
		              target: self
		            Statement:
		              target: myQuery
		          ]
		      ]
		''')
	}
    
    @Test
    def void givenQueryWithDocumentation_whenParse_thenDocumentationIsParsed() {
        val result = parseHelper.parse('''
            /** This query returns something useful. */
            context Hamster
            query myCommand: self;
        ''')
        assertModel(result, '''
            Model:
              documentation: /** This query returns something useful. */
              context: Context myCommand:
                className: Hamster
                kind: query
              expressions: [
                Expression:
                  statements: [
                    Statement:
                      target: self
                  ]
              ]
        ''')
    }
	
	private def assertModel(Model actualModel, String expected) {
		Assertions.assertNotNull(actualModel)
		val errors = actualModel.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: �errors.join(", ")�''')
		
		var actual = ModelInstanceStringifier.toString(actualModel);
		Assertions.assertEquals(expected.trim(), actual);
	}
	
}
