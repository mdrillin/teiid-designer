/*
 * JBoss, Home of Professional Open Source.
 *
 * See the LEGAL.txt file distributed with this work for information regarding copyright ownership and licensing.
 *
 * See the AUTHORS.txt file distributed with this work for a full listing of individual contributors.
 */
package org.teiid.designer.metamodels.wsdl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Operation</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.teiid.designer.metamodels.wsdl.Operation#getParameterOrder <em>Parameter Order</em>}</li>
 * <li>{@link org.teiid.designer.metamodels.wsdl.Operation#getPortType <em>Port Type</em>}</li>
 * <li>{@link org.teiid.designer.metamodels.wsdl.Operation#getInput <em>Input</em>}</li>
 * <li>{@link org.teiid.designer.metamodels.wsdl.Operation#getOutput <em>Output</em>}</li>
 * <li>{@link org.teiid.designer.metamodels.wsdl.Operation#getFaults <em>Faults</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.teiid.designer.metamodels.wsdl.WsdlPackage#getOperation()
 * @model
 * @generated
 *
 * @since 8.0
 */
public interface Operation extends WsdlNameRequiredEntity, ExtensibleDocumented {

    /**
     * Returns the value of the '<em><b>Parameter Order</b></em>' attribute. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parameter Order</em>' attribute isn't clear, there really should be more of a description
     * here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Parameter Order</em>' attribute.
     * @see #setParameterOrder(String)
     * @see org.teiid.designer.metamodels.wsdl.WsdlPackage#getOperation_ParameterOrder()
     * @model
     * @generated
     */
    String getParameterOrder();

    /**
     * Sets the value of the '{@link org.teiid.designer.metamodels.wsdl.Operation#getParameterOrder <em>Parameter Order</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value the new value of the '<em>Parameter Order</em>' attribute.
     * @see #getParameterOrder()
     * @generated
     */
    void setParameterOrder( String value );

    /**
     * Returns the value of the '<em><b>Port Type</b></em>' container reference. It is bidirectional and its opposite is '
     * {@link org.teiid.designer.metamodels.wsdl.PortType#getOperations <em>Operations</em>}'. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Port Type</em>' container reference isn't clear, there really should be more of a description
     * here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Port Type</em>' container reference.
     * @see #setPortType(PortType)
     * @see org.teiid.designer.metamodels.wsdl.WsdlPackage#getOperation_PortType()
     * @see org.teiid.designer.metamodels.wsdl.PortType#getOperations
     * @model opposite="operations" required="true"
     * @generated
     */
    PortType getPortType();

    /**
     * Sets the value of the '{@link org.teiid.designer.metamodels.wsdl.Operation#getPortType <em>Port Type</em>}' container
     * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value the new value of the '<em>Port Type</em>' container reference.
     * @see #getPortType()
     * @generated
     */
    void setPortType( PortType value );

    /**
     * Returns the value of the '<em><b>Input</b></em>' containment reference. It is bidirectional and its opposite is '
     * {@link org.teiid.designer.metamodels.wsdl.Input#getOperation <em>Operation</em>}'. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Input</em>' containment reference isn't clear, there really should be more of a description
     * here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Input</em>' containment reference.
     * @see #setInput(Input)
     * @see org.teiid.designer.metamodels.wsdl.WsdlPackage#getOperation_Input()
     * @see org.teiid.designer.metamodels.wsdl.Input#getOperation
     * @model opposite="operation" containment="true"
     * @generated
     */
    Input getInput();

    /**
     * Sets the value of the '{@link org.teiid.designer.metamodels.wsdl.Operation#getInput <em>Input</em>}' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value the new value of the '<em>Input</em>' containment reference.
     * @see #getInput()
     * @generated
     */
    void setInput( Input value );

    /**
     * Returns the value of the '<em><b>Output</b></em>' containment reference. It is bidirectional and its opposite is '
     * {@link org.teiid.designer.metamodels.wsdl.Output#getOperation <em>Operation</em>}'. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Output</em>' containment reference isn't clear, there really should be more of a description
     * here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Output</em>' containment reference.
     * @see #setOutput(Output)
     * @see org.teiid.designer.metamodels.wsdl.WsdlPackage#getOperation_Output()
     * @see org.teiid.designer.metamodels.wsdl.Output#getOperation
     * @model opposite="operation" containment="true"
     * @generated
     */
    Output getOutput();

    /**
     * Sets the value of the '{@link org.teiid.designer.metamodels.wsdl.Operation#getOutput <em>Output</em>}' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value the new value of the '<em>Output</em>' containment reference.
     * @see #getOutput()
     * @generated
     */
    void setOutput( Output value );

    /**
     * Returns the value of the '<em><b>Faults</b></em>' containment reference list. The list contents are of type
     * {@link org.teiid.designer.metamodels.wsdl.Fault}. It is bidirectional and its opposite is '
     * {@link org.teiid.designer.metamodels.wsdl.Fault#getOperation <em>Operation</em>}'. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Faults</em>' containment reference list isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Faults</em>' containment reference list.
     * @see org.teiid.designer.metamodels.wsdl.WsdlPackage#getOperation_Faults()
     * @see org.teiid.designer.metamodels.wsdl.Fault#getOperation
     * @model type="org.teiid.designer.metamodels.wsdl.Fault" opposite="operation" containment="true"
     * @generated
     */
    EList getFaults();

} // Operation
