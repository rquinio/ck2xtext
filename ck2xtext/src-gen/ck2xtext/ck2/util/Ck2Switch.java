/**
 * generated by Xtext 2.9.1
 */
package ck2xtext.ck2.util;

import ck2xtext.ck2.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ck2xtext.ck2.Ck2Package
 * @generated
 */
public class Ck2Switch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static Ck2Package modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ck2Switch()
  {
    if (modelPackage == null)
    {
      modelPackage = Ck2Package.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case Ck2Package.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Ck2Package.LIST:
      {
        List list = (List)theEObject;
        T result = caseList(list);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Ck2Package.PROPERTY:
      {
        Property property = (Property)theEObject;
        T result = caseProperty(property);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Ck2Package.CLAUSE:
      {
        Clause clause = (Clause)theEObject;
        T result = caseClause(clause);
        if (result == null) result = caseProperty(clause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Ck2Package.STRING_PROPERTY:
      {
        StringProperty stringProperty = (StringProperty)theEObject;
        T result = caseStringProperty(stringProperty);
        if (result == null) result = caseProperty(stringProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Ck2Package.ID_PROPERTY:
      {
        IdProperty idProperty = (IdProperty)theEObject;
        T result = caseIdProperty(idProperty);
        if (result == null) result = caseProperty(idProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Ck2Package.COMMAND_PROPERTY:
      {
        CommandProperty commandProperty = (CommandProperty)theEObject;
        T result = caseCommandProperty(commandProperty);
        if (result == null) result = caseProperty(commandProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Ck2Package.BOOL_PROPERTY:
      {
        BoolProperty boolProperty = (BoolProperty)theEObject;
        T result = caseBoolProperty(boolProperty);
        if (result == null) result = caseProperty(boolProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Ck2Package.DATE_PROPERTY:
      {
        DateProperty dateProperty = (DateProperty)theEObject;
        T result = caseDateProperty(dateProperty);
        if (result == null) result = caseProperty(dateProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Ck2Package.INTEGER_PROPERTY:
      {
        IntegerProperty integerProperty = (IntegerProperty)theEObject;
        T result = caseIntegerProperty(integerProperty);
        if (result == null) result = caseProperty(integerProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Ck2Package.DOUBLE_PROPERTY:
      {
        DoubleProperty doubleProperty = (DoubleProperty)theEObject;
        T result = caseDoubleProperty(doubleProperty);
        if (result == null) result = caseProperty(doubleProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Ck2Package.HEXADECIMAL_PROPERTY:
      {
        HexadecimalProperty hexadecimalProperty = (HexadecimalProperty)theEObject;
        T result = caseHexadecimalProperty(hexadecimalProperty);
        if (result == null) result = caseProperty(hexadecimalProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Ck2Package.LIST_PROPERTY:
      {
        ListProperty listProperty = (ListProperty)theEObject;
        T result = caseListProperty(listProperty);
        if (result == null) result = caseProperty(listProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Ck2Package.ID_CLAUSE_PROPERTY:
      {
        IdClauseProperty idClauseProperty = (IdClauseProperty)theEObject;
        T result = caseIdClauseProperty(idClauseProperty);
        if (result == null) result = caseClause(idClauseProperty);
        if (result == null) result = caseProperty(idClauseProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Ck2Package.INT_CLAUSE_PROPERTY:
      {
        IntClauseProperty intClauseProperty = (IntClauseProperty)theEObject;
        T result = caseIntClauseProperty(intClauseProperty);
        if (result == null) result = caseClause(intClauseProperty);
        if (result == null) result = caseProperty(intClauseProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Ck2Package.DATE_CLAUSE_PROPERTY:
      {
        DateClauseProperty dateClauseProperty = (DateClauseProperty)theEObject;
        T result = caseDateClauseProperty(dateClauseProperty);
        if (result == null) result = caseClause(dateClauseProperty);
        if (result == null) result = caseProperty(dateClauseProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Ck2Package.PROBABILITY_PROPERTY:
      {
        ProbabilityProperty probabilityProperty = (ProbabilityProperty)theEObject;
        T result = caseProbabilityProperty(probabilityProperty);
        if (result == null) result = caseProperty(probabilityProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseList(List object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProperty(Property object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClause(Clause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringProperty(StringProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Id Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Id Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIdProperty(IdProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Command Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Command Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCommandProperty(CommandProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bool Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bool Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBoolProperty(BoolProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Date Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Date Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDateProperty(DateProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Integer Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Integer Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntegerProperty(IntegerProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Double Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Double Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDoubleProperty(DoubleProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Hexadecimal Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Hexadecimal Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHexadecimalProperty(HexadecimalProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>List Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>List Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseListProperty(ListProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Id Clause Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Id Clause Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIdClauseProperty(IdClauseProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Int Clause Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Int Clause Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntClauseProperty(IntClauseProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Date Clause Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Date Clause Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDateClauseProperty(DateClauseProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Probability Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Probability Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProbabilityProperty(ProbabilityProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //Ck2Switch
