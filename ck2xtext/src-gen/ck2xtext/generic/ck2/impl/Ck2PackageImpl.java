/**
 * generated by Xtext 2.15.0
 */
package ck2xtext.generic.ck2.impl;

import ck2xtext.generic.ck2.BoolClauseProperty;
import ck2xtext.generic.ck2.BoolProperty;
import ck2xtext.generic.ck2.Ck2Factory;
import ck2xtext.generic.ck2.Ck2Package;
import ck2xtext.generic.ck2.Clause;
import ck2xtext.generic.ck2.CommandProperty;
import ck2xtext.generic.ck2.DateClauseProperty;
import ck2xtext.generic.ck2.DateProperty;
import ck2xtext.generic.ck2.DoubleProperty;
import ck2xtext.generic.ck2.HexadecimalProperty;
import ck2xtext.generic.ck2.IdClauseProperty;
import ck2xtext.generic.ck2.IdProperty;
import ck2xtext.generic.ck2.IntClauseProperty;
import ck2xtext.generic.ck2.IntegerProperty;
import ck2xtext.generic.ck2.List;
import ck2xtext.generic.ck2.ListProperty;
import ck2xtext.generic.ck2.Model;
import ck2xtext.generic.ck2.ProbabilityProperty;
import ck2xtext.generic.ck2.Property;
import ck2xtext.generic.ck2.StringProperty;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Ck2PackageImpl extends EPackageImpl implements Ck2Package
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass listEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass clauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass idPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass commandPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass boolPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass datePropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass integerPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass doublePropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hexadecimalPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass listPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass idClausePropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass intClausePropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dateClausePropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass probabilityPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass boolClausePropertyEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see ck2xtext.generic.ck2.Ck2Package#eNS_URI
   * @see #init()
   * @generated
   */
  private Ck2PackageImpl()
  {
    super(eNS_URI, Ck2Factory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link Ck2Package#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static Ck2Package init()
  {
    if (isInited) return (Ck2Package)EPackage.Registry.INSTANCE.getEPackage(Ck2Package.eNS_URI);

    // Obtain or create and register package
    Object registeredCk2Package = EPackage.Registry.INSTANCE.get(eNS_URI);
    Ck2PackageImpl theCk2Package = registeredCk2Package instanceof Ck2PackageImpl ? (Ck2PackageImpl)registeredCk2Package : new Ck2PackageImpl();

    isInited = true;

    // Create package meta-data objects
    theCk2Package.createPackageContents();

    // Initialize created meta-data
    theCk2Package.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theCk2Package.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(Ck2Package.eNS_URI, theCk2Package);
    return theCk2Package;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Properties()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getList()
  {
    return listEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getList_Elems()
  {
    return (EAttribute)listEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProperty()
  {
    return propertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClause()
  {
    return clauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClause_Value()
  {
    return (EAttribute)clauseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClause_Properties()
  {
    return (EReference)clauseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringProperty()
  {
    return stringPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringProperty_Key()
  {
    return (EAttribute)stringPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringProperty_Value()
  {
    return (EAttribute)stringPropertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIdProperty()
  {
    return idPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIdProperty_Key()
  {
    return (EAttribute)idPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIdProperty_Value()
  {
    return (EAttribute)idPropertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCommandProperty()
  {
    return commandPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCommandProperty_Key()
  {
    return (EAttribute)commandPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCommandProperty_Value()
  {
    return (EAttribute)commandPropertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBoolProperty()
  {
    return boolPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBoolProperty_Key()
  {
    return (EAttribute)boolPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBoolProperty_Value()
  {
    return (EAttribute)boolPropertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDateProperty()
  {
    return datePropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDateProperty_Key()
  {
    return (EAttribute)datePropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDateProperty_Value()
  {
    return (EAttribute)datePropertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntegerProperty()
  {
    return integerPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntegerProperty_Key()
  {
    return (EAttribute)integerPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntegerProperty_Value()
  {
    return (EAttribute)integerPropertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDoubleProperty()
  {
    return doublePropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDoubleProperty_Key()
  {
    return (EAttribute)doublePropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDoubleProperty_Value()
  {
    return (EAttribute)doublePropertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHexadecimalProperty()
  {
    return hexadecimalPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHexadecimalProperty_Key()
  {
    return (EAttribute)hexadecimalPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHexadecimalProperty_Value()
  {
    return (EAttribute)hexadecimalPropertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getListProperty()
  {
    return listPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getListProperty_Key()
  {
    return (EAttribute)listPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getListProperty_Value()
  {
    return (EReference)listPropertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIdClauseProperty()
  {
    return idClausePropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIdClauseProperty_Name()
  {
    return (EAttribute)idClausePropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntClauseProperty()
  {
    return intClausePropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntClauseProperty_Name()
  {
    return (EAttribute)intClausePropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDateClauseProperty()
  {
    return dateClausePropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDateClauseProperty_Name()
  {
    return (EAttribute)dateClausePropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProbabilityProperty()
  {
    return probabilityPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProbabilityProperty_Key()
  {
    return (EAttribute)probabilityPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProbabilityProperty_Value()
  {
    return (EAttribute)probabilityPropertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBoolClauseProperty()
  {
    return boolClausePropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBoolClauseProperty_Name()
  {
    return (EAttribute)boolClausePropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBoolClauseProperty_Value()
  {
    return (EAttribute)boolClausePropertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBoolClauseProperty_Properties()
  {
    return (EReference)boolClausePropertyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ck2Factory getCk2Factory()
  {
    return (Ck2Factory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__PROPERTIES);

    listEClass = createEClass(LIST);
    createEAttribute(listEClass, LIST__ELEMS);

    propertyEClass = createEClass(PROPERTY);

    clauseEClass = createEClass(CLAUSE);
    createEAttribute(clauseEClass, CLAUSE__VALUE);
    createEReference(clauseEClass, CLAUSE__PROPERTIES);

    stringPropertyEClass = createEClass(STRING_PROPERTY);
    createEAttribute(stringPropertyEClass, STRING_PROPERTY__KEY);
    createEAttribute(stringPropertyEClass, STRING_PROPERTY__VALUE);

    idPropertyEClass = createEClass(ID_PROPERTY);
    createEAttribute(idPropertyEClass, ID_PROPERTY__KEY);
    createEAttribute(idPropertyEClass, ID_PROPERTY__VALUE);

    commandPropertyEClass = createEClass(COMMAND_PROPERTY);
    createEAttribute(commandPropertyEClass, COMMAND_PROPERTY__KEY);
    createEAttribute(commandPropertyEClass, COMMAND_PROPERTY__VALUE);

    boolPropertyEClass = createEClass(BOOL_PROPERTY);
    createEAttribute(boolPropertyEClass, BOOL_PROPERTY__KEY);
    createEAttribute(boolPropertyEClass, BOOL_PROPERTY__VALUE);

    datePropertyEClass = createEClass(DATE_PROPERTY);
    createEAttribute(datePropertyEClass, DATE_PROPERTY__KEY);
    createEAttribute(datePropertyEClass, DATE_PROPERTY__VALUE);

    integerPropertyEClass = createEClass(INTEGER_PROPERTY);
    createEAttribute(integerPropertyEClass, INTEGER_PROPERTY__KEY);
    createEAttribute(integerPropertyEClass, INTEGER_PROPERTY__VALUE);

    doublePropertyEClass = createEClass(DOUBLE_PROPERTY);
    createEAttribute(doublePropertyEClass, DOUBLE_PROPERTY__KEY);
    createEAttribute(doublePropertyEClass, DOUBLE_PROPERTY__VALUE);

    hexadecimalPropertyEClass = createEClass(HEXADECIMAL_PROPERTY);
    createEAttribute(hexadecimalPropertyEClass, HEXADECIMAL_PROPERTY__KEY);
    createEAttribute(hexadecimalPropertyEClass, HEXADECIMAL_PROPERTY__VALUE);

    listPropertyEClass = createEClass(LIST_PROPERTY);
    createEAttribute(listPropertyEClass, LIST_PROPERTY__KEY);
    createEReference(listPropertyEClass, LIST_PROPERTY__VALUE);

    idClausePropertyEClass = createEClass(ID_CLAUSE_PROPERTY);
    createEAttribute(idClausePropertyEClass, ID_CLAUSE_PROPERTY__NAME);

    intClausePropertyEClass = createEClass(INT_CLAUSE_PROPERTY);
    createEAttribute(intClausePropertyEClass, INT_CLAUSE_PROPERTY__NAME);

    dateClausePropertyEClass = createEClass(DATE_CLAUSE_PROPERTY);
    createEAttribute(dateClausePropertyEClass, DATE_CLAUSE_PROPERTY__NAME);

    probabilityPropertyEClass = createEClass(PROBABILITY_PROPERTY);
    createEAttribute(probabilityPropertyEClass, PROBABILITY_PROPERTY__KEY);
    createEAttribute(probabilityPropertyEClass, PROBABILITY_PROPERTY__VALUE);

    boolClausePropertyEClass = createEClass(BOOL_CLAUSE_PROPERTY);
    createEAttribute(boolClausePropertyEClass, BOOL_CLAUSE_PROPERTY__NAME);
    createEAttribute(boolClausePropertyEClass, BOOL_CLAUSE_PROPERTY__VALUE);
    createEReference(boolClausePropertyEClass, BOOL_CLAUSE_PROPERTY__PROPERTIES);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    clauseEClass.getESuperTypes().add(this.getProperty());
    stringPropertyEClass.getESuperTypes().add(this.getProperty());
    idPropertyEClass.getESuperTypes().add(this.getProperty());
    commandPropertyEClass.getESuperTypes().add(this.getProperty());
    boolPropertyEClass.getESuperTypes().add(this.getProperty());
    datePropertyEClass.getESuperTypes().add(this.getProperty());
    integerPropertyEClass.getESuperTypes().add(this.getProperty());
    doublePropertyEClass.getESuperTypes().add(this.getProperty());
    hexadecimalPropertyEClass.getESuperTypes().add(this.getProperty());
    listPropertyEClass.getESuperTypes().add(this.getProperty());
    idClausePropertyEClass.getESuperTypes().add(this.getClause());
    intClausePropertyEClass.getESuperTypes().add(this.getClause());
    dateClausePropertyEClass.getESuperTypes().add(this.getClause());
    probabilityPropertyEClass.getESuperTypes().add(this.getProperty());
    boolClausePropertyEClass.getESuperTypes().add(this.getProperty());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Properties(), this.getProperty(), null, "properties", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(listEClass, List.class, "List", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getList_Elems(), ecorePackage.getEString(), "elems", null, 0, -1, List.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(clauseEClass, Clause.class, "Clause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getClause_Value(), ecorePackage.getEString(), "value", null, 0, 1, Clause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClause_Properties(), this.getProperty(), null, "properties", null, 0, -1, Clause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stringPropertyEClass, StringProperty.class, "StringProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStringProperty_Key(), ecorePackage.getEString(), "key", null, 0, 1, StringProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStringProperty_Value(), ecorePackage.getEString(), "value", null, 0, 1, StringProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(idPropertyEClass, IdProperty.class, "IdProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIdProperty_Key(), ecorePackage.getEString(), "key", null, 0, 1, IdProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIdProperty_Value(), ecorePackage.getEString(), "value", null, 0, 1, IdProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(commandPropertyEClass, CommandProperty.class, "CommandProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCommandProperty_Key(), ecorePackage.getEString(), "key", null, 0, 1, CommandProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCommandProperty_Value(), ecorePackage.getEString(), "value", null, 0, 1, CommandProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(boolPropertyEClass, BoolProperty.class, "BoolProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBoolProperty_Key(), ecorePackage.getEString(), "key", null, 0, 1, BoolProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBoolProperty_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, BoolProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(datePropertyEClass, DateProperty.class, "DateProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDateProperty_Key(), ecorePackage.getEString(), "key", null, 0, 1, DateProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDateProperty_Value(), ecorePackage.getEDate(), "value", null, 0, 1, DateProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(integerPropertyEClass, IntegerProperty.class, "IntegerProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIntegerProperty_Key(), ecorePackage.getEString(), "key", null, 0, 1, IntegerProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIntegerProperty_Value(), ecorePackage.getEInt(), "value", null, 0, 1, IntegerProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(doublePropertyEClass, DoubleProperty.class, "DoubleProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDoubleProperty_Key(), ecorePackage.getEString(), "key", null, 0, 1, DoubleProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDoubleProperty_Value(), ecorePackage.getEDouble(), "value", null, 0, 1, DoubleProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(hexadecimalPropertyEClass, HexadecimalProperty.class, "HexadecimalProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHexadecimalProperty_Key(), ecorePackage.getEString(), "key", null, 0, 1, HexadecimalProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHexadecimalProperty_Value(), ecorePackage.getEInt(), "value", null, 0, 1, HexadecimalProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(listPropertyEClass, ListProperty.class, "ListProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getListProperty_Key(), ecorePackage.getEString(), "key", null, 0, 1, ListProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getListProperty_Value(), this.getList(), null, "value", null, 0, 1, ListProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(idClausePropertyEClass, IdClauseProperty.class, "IdClauseProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIdClauseProperty_Name(), ecorePackage.getEString(), "name", null, 0, 1, IdClauseProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(intClausePropertyEClass, IntClauseProperty.class, "IntClauseProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIntClauseProperty_Name(), ecorePackage.getEInt(), "name", null, 0, 1, IntClauseProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dateClausePropertyEClass, DateClauseProperty.class, "DateClauseProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDateClauseProperty_Name(), ecorePackage.getEDate(), "name", null, 0, 1, DateClauseProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(probabilityPropertyEClass, ProbabilityProperty.class, "ProbabilityProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProbabilityProperty_Key(), ecorePackage.getEInt(), "key", null, 0, 1, ProbabilityProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProbabilityProperty_Value(), ecorePackage.getEString(), "value", null, 0, 1, ProbabilityProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(boolClausePropertyEClass, BoolClauseProperty.class, "BoolClauseProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBoolClauseProperty_Name(), ecorePackage.getEBoolean(), "name", null, 0, 1, BoolClauseProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBoolClauseProperty_Value(), ecorePackage.getEString(), "value", null, 0, 1, BoolClauseProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBoolClauseProperty_Properties(), this.getProperty(), null, "properties", null, 0, -1, BoolClauseProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //Ck2PackageImpl
