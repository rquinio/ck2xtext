/**
 * generated by Xtext 2.13.0
 */
package ck2xtext.ck2.util;

import ck2xtext.ck2.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ck2xtext.ck2.Ck2Package
 * @generated
 */
public class Ck2AdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static Ck2Package modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ck2AdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = Ck2Package.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Ck2Switch<Adapter> modelSwitch =
    new Ck2Switch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseList(List object)
      {
        return createListAdapter();
      }
      @Override
      public Adapter caseProperty(Property object)
      {
        return createPropertyAdapter();
      }
      @Override
      public Adapter caseClause(Clause object)
      {
        return createClauseAdapter();
      }
      @Override
      public Adapter caseStringProperty(StringProperty object)
      {
        return createStringPropertyAdapter();
      }
      @Override
      public Adapter caseIdProperty(IdProperty object)
      {
        return createIdPropertyAdapter();
      }
      @Override
      public Adapter caseCommandProperty(CommandProperty object)
      {
        return createCommandPropertyAdapter();
      }
      @Override
      public Adapter caseBoolProperty(BoolProperty object)
      {
        return createBoolPropertyAdapter();
      }
      @Override
      public Adapter caseDateProperty(DateProperty object)
      {
        return createDatePropertyAdapter();
      }
      @Override
      public Adapter caseIntegerProperty(IntegerProperty object)
      {
        return createIntegerPropertyAdapter();
      }
      @Override
      public Adapter caseDoubleProperty(DoubleProperty object)
      {
        return createDoublePropertyAdapter();
      }
      @Override
      public Adapter caseHexadecimalProperty(HexadecimalProperty object)
      {
        return createHexadecimalPropertyAdapter();
      }
      @Override
      public Adapter caseListProperty(ListProperty object)
      {
        return createListPropertyAdapter();
      }
      @Override
      public Adapter caseIdClauseProperty(IdClauseProperty object)
      {
        return createIdClausePropertyAdapter();
      }
      @Override
      public Adapter caseIntClauseProperty(IntClauseProperty object)
      {
        return createIntClausePropertyAdapter();
      }
      @Override
      public Adapter caseDateClauseProperty(DateClauseProperty object)
      {
        return createDateClausePropertyAdapter();
      }
      @Override
      public Adapter caseProbabilityProperty(ProbabilityProperty object)
      {
        return createProbabilityPropertyAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link ck2xtext.ck2.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ck2xtext.ck2.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ck2xtext.ck2.List <em>List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ck2xtext.ck2.List
   * @generated
   */
  public Adapter createListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ck2xtext.ck2.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ck2xtext.ck2.Property
   * @generated
   */
  public Adapter createPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ck2xtext.ck2.Clause <em>Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ck2xtext.ck2.Clause
   * @generated
   */
  public Adapter createClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ck2xtext.ck2.StringProperty <em>String Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ck2xtext.ck2.StringProperty
   * @generated
   */
  public Adapter createStringPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ck2xtext.ck2.IdProperty <em>Id Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ck2xtext.ck2.IdProperty
   * @generated
   */
  public Adapter createIdPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ck2xtext.ck2.CommandProperty <em>Command Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ck2xtext.ck2.CommandProperty
   * @generated
   */
  public Adapter createCommandPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ck2xtext.ck2.BoolProperty <em>Bool Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ck2xtext.ck2.BoolProperty
   * @generated
   */
  public Adapter createBoolPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ck2xtext.ck2.DateProperty <em>Date Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ck2xtext.ck2.DateProperty
   * @generated
   */
  public Adapter createDatePropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ck2xtext.ck2.IntegerProperty <em>Integer Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ck2xtext.ck2.IntegerProperty
   * @generated
   */
  public Adapter createIntegerPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ck2xtext.ck2.DoubleProperty <em>Double Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ck2xtext.ck2.DoubleProperty
   * @generated
   */
  public Adapter createDoublePropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ck2xtext.ck2.HexadecimalProperty <em>Hexadecimal Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ck2xtext.ck2.HexadecimalProperty
   * @generated
   */
  public Adapter createHexadecimalPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ck2xtext.ck2.ListProperty <em>List Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ck2xtext.ck2.ListProperty
   * @generated
   */
  public Adapter createListPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ck2xtext.ck2.IdClauseProperty <em>Id Clause Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ck2xtext.ck2.IdClauseProperty
   * @generated
   */
  public Adapter createIdClausePropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ck2xtext.ck2.IntClauseProperty <em>Int Clause Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ck2xtext.ck2.IntClauseProperty
   * @generated
   */
  public Adapter createIntClausePropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ck2xtext.ck2.DateClauseProperty <em>Date Clause Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ck2xtext.ck2.DateClauseProperty
   * @generated
   */
  public Adapter createDateClausePropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ck2xtext.ck2.ProbabilityProperty <em>Probability Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ck2xtext.ck2.ProbabilityProperty
   * @generated
   */
  public Adapter createProbabilityPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //Ck2AdapterFactory
