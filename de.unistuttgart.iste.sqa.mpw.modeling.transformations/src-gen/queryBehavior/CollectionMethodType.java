/**
 */
package queryBehavior;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Collection Method Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see queryBehavior.QueryPackage#getCollectionMethodType()
 * @model
 * @generated
 */
public enum CollectionMethodType implements Enumerator {
	/**
	 * The '<em><b>NOT EMPTY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_EMPTY_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_EMPTY(0, "NOT_EMPTY", "NOT_EMPTY"),

	/**
	 * The '<em><b>IS EMPTY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_EMPTY_VALUE
	 * @generated
	 * @ordered
	 */
	IS_EMPTY(1, "IS_EMPTY", "IS_EMPTY"),

	/**
	 * The '<em><b>SIZE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIZE_VALUE
	 * @generated
	 * @ordered
	 */
	SIZE(2, "SIZE", "SIZE"),

	/**
	 * The '<em><b>TYPE SELECT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TYPE_SELECT_VALUE
	 * @generated
	 * @ordered
	 */
	TYPE_SELECT(3, "TYPE_SELECT", "TYPE_SELECT"), /**
	 * The '<em><b>AT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AT_VALUE
	 * @generated
	 * @ordered
	 */
	AT(4, "AT", "AT");

	/**
	 * The '<em><b>NOT EMPTY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_EMPTY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOT_EMPTY_VALUE = 0;

	/**
	 * The '<em><b>IS EMPTY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_EMPTY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IS_EMPTY_VALUE = 1;

	/**
	 * The '<em><b>SIZE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIZE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SIZE_VALUE = 2;

	/**
	 * The '<em><b>TYPE SELECT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TYPE_SELECT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TYPE_SELECT_VALUE = 3;

	/**
	 * The '<em><b>AT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AT_VALUE = 4;

	/**
	 * An array of all the '<em><b>Collection Method Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CollectionMethodType[] VALUES_ARRAY =
		new CollectionMethodType[] {
			NOT_EMPTY,
			IS_EMPTY,
			SIZE,
			TYPE_SELECT,
			AT,
		};

	/**
	 * A public read-only list of all the '<em><b>Collection Method Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CollectionMethodType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Collection Method Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CollectionMethodType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CollectionMethodType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Collection Method Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CollectionMethodType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CollectionMethodType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Collection Method Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CollectionMethodType get(int value) {
		switch (value) {
			case NOT_EMPTY_VALUE: return NOT_EMPTY;
			case IS_EMPTY_VALUE: return IS_EMPTY;
			case SIZE_VALUE: return SIZE;
			case TYPE_SELECT_VALUE: return TYPE_SELECT;
			case AT_VALUE: return AT;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private CollectionMethodType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //CollectionMethodType
