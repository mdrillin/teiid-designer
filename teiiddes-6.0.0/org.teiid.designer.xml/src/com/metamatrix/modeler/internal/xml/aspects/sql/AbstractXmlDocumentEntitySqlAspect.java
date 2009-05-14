/*
 * JBoss, Home of Professional Open Source.
 *
 * See the LEGAL.txt file distributed with this work for information regarding copyright ownership and licensing.
 *
 * See the AUTHORS.txt file distributed with this work for a full listing of individual contributors.
 */
package com.metamatrix.modeler.internal.xml.aspects.sql;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EObject;

import com.metamatrix.modeler.core.ModelerCore;
import com.metamatrix.modeler.core.metamodel.aspect.AbstractMetamodelAspect;
import com.metamatrix.modeler.core.metamodel.aspect.AspectManager;
import com.metamatrix.modeler.core.metamodel.aspect.MetamodelEntity;
import com.metamatrix.modeler.core.metamodel.aspect.sql.SqlAspect;
import com.metamatrix.modeler.core.metamodel.aspect.sql.SqlColumnAspect;
import com.metamatrix.modeler.core.metamodel.aspect.sql.SqlTableAspect;

/**
 * AbstractXmlDocumentEntitySqlAspect
 */
public abstract class AbstractXmlDocumentEntitySqlAspect extends AbstractMetamodelAspect implements SqlAspect {

    public static final String ASPECT_ID = ModelerCore.EXTENSION_POINT.SQL_ASPECT.ID;

    public static final String FULL_NAME_DELIMITER = "."; //$NON-NLS-1$

    /**
     * Construct an instance of AbstractXmlDocumentEntitySqlAspect.
     */
    public AbstractXmlDocumentEntitySqlAspect(final MetamodelEntity entity) {
        super.setMetamodelEntity(entity);
        super.setID(ASPECT_ID);
    }

    /** 
     * @see com.metamatrix.modeler.core.metamodel.aspect.sql.SqlAspect#isQueryable(org.eclipse.emf.ecore.EObject)
     */
    public boolean isQueryable(final EObject eObject) {
        return true;
    }

    /** 
     * @see com.metamatrix.modeler.core.metamodel.aspect.sql.SqlAspect#getParentObjectID(org.eclipse.emf.ecore.EObject)
     */
    @Override
    public Object getParentObjectID(EObject eObject) {
        final SqlAspect childAspect = AspectManager.getSqlAspect(eObject);
        
        // If we are trying to get the ObjectID associated with the parent 
        // of a SqlColumnAspect then navigate up the parent hierarchy until
        // we reach a SqlTableAspect
        if (childAspect instanceof SqlColumnAspect) {
            EObject parent = eObject.eContainer();
            SqlAspect parentAspect = AspectManager.getSqlAspect(parent);
            while ( parentAspect != null && !(parentAspect instanceof SqlTableAspect) ) {
                parent = parent.eContainer();
                parentAspect = AspectManager.getSqlAspect(parent);
            }
            if (parentAspect != null && (parentAspect instanceof SqlTableAspect)) {
                return parentAspect.getObjectID(parent);
            }
        }

        // Else return the ObjectID of the parent aspect
        final EObject parent = eObject.eContainer();
        if ( parent != null ) {
            SqlAspect parentAspect = AspectManager.getSqlAspect(parent);
            if ( parentAspect != null ) {
                return parentAspect.getObjectID(parent);
            }
        }
        return null;
    }

    /**
     * @see com.metamatrix.modeler.core.metamodel.aspect.sql.SqlAspect#getNameInSource(org.eclipse.emf.ecore.EObject)
     */
    public String getNameInSource(EObject eObject) {
        return null;
    }
    
    /**
     * @see com.metamatrix.modeler.core.metamodel.aspect.sql.SqlAspect#getFullName(org.eclipse.emf.ecore.EObject)
     */
    @Override
    public String getFullName(final EObject eObject) {        
        // Else simply append the entity name onto the parent fullname
        final String parentFullName = getParentFullName(eObject);
		final String name = getName(eObject);
        if ( parentFullName != null ) {
            return parentFullName + FULL_NAME_DELIMITER + name;
        }
        return name;
    }

	protected String getShortName(final EObject eObject) {
		return getName(eObject);
	}

    /**
     * @see com.metamatrix.modeler.core.metamodel.aspect.sql.SqlAspect#getPath(org.eclipse.emf.ecore.EObject)
     */
    @Override
    public IPath getPath(final EObject eObject) {
        final IPath parentPath = getParentPath(eObject);
        final String name = getName(eObject);
        if ( parentPath != null && name != null) {
            return parentPath.append(name);
        } else if(name == null) {
            return null;    
        }
        return new Path(name);
    }

    protected String getParentFullName(EObject eObject) {
        final EObject parent = eObject.eContainer();
        if ( parent != null ) {
            final SqlAspect parentAspect = AspectManager.getSqlAspect(parent);
            if ( parentAspect != null ) {
                final String parentFullName = parentAspect.getFullName(parent);
                return parentFullName;
            }
        }
        return null;
    }

    protected IPath getParentPath(EObject eObject) {
        final EObject parent = eObject.eContainer();
        if ( parent != null ) {
            final SqlAspect parentAspect = AspectManager.getSqlAspect(parent);
            if ( parentAspect != null ) {
                final IPath parentPath = parentAspect.getPath(parent);
                return parentPath;
            }
        }
        return null;
    }
    
    protected String getModelName(EObject eObject) {
        IPath parentPath = getParentPath(eObject);
        return parentPath.segment(0);
    }
}
