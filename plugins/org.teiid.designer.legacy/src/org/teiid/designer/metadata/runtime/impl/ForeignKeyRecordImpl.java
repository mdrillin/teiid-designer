/*
 * JBoss, Home of Professional Open Source.
 *
 * See the LEGAL.txt file distributed with this work for information regarding copyright ownership and licensing.
 *
 * See the AUTHORS.txt file distributed with this work for a full listing of individual contributors.
 */

package org.teiid.designer.metadata.runtime.impl;

import org.teiid.designer.metadata.runtime.ForeignKeyRecord;

/**
 * ForeignKeyRecordImpl
 *
 * @since 8.0
 */
public class ForeignKeyRecordImpl extends ColumnSetRecordImpl implements ForeignKeyRecord {

    /**
     */
    private static final long serialVersionUID = 1L;
    private Object uniqueKeyID;
    
    // ==================================================================================
    //                        C O N S T R U C T O R S
    // ==================================================================================

    public ForeignKeyRecordImpl() {
    	this(new MetadataRecordDelegate());
    }
    
    protected ForeignKeyRecordImpl(MetadataRecordDelegate delegate) {
    	this.delegate = delegate;
    }

    //==================================================================================
    //                     I N T E R F A C E   M E T H O D S
    //==================================================================================

    /* (non-Javadoc)
     * @see org.teiid.designer.metadata.runtime.ForeignKeyRecord#getPrimaryKeyID()
     */
    @Override
	public Object getUniqueKeyID() {
        return uniqueKeyID;
    }

    // ==================================================================================
    //                      P U B L I C   M E T H O D S
    // ==================================================================================

    /**
     * @param object
     */
    public void setUniqueKeyID(Object keyID) {
        uniqueKeyID = keyID;
    }    
}