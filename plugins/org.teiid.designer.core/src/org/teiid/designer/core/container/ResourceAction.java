/*
 * JBoss, Home of Professional Open Source.
 *
 * See the LEGAL.txt file distributed with this work for information regarding copyright ownership and licensing.
 *
 * See the AUTHORS.txt file distributed with this work for a full listing of individual contributors.
 */
package org.teiid.designer.core.container;

import org.eclipse.emf.ecore.resource.Resource;

/**
 * ResourceAction
 *
 * @since 8.0
 */
public class ResourceAction {

    private final Resource resource;
    private final boolean isNew;

    /**
     * Construct an instance of ResourceAction.
     * 
     */
    public ResourceAction( final Resource resource, final boolean isNew ) {
        this.resource = resource;
        this.isNew = isNew;
    }

    /**
     * @return
     */
    public boolean isNew() {
        return isNew;
    }

    /**
     * @return
     */
    public Resource getResource() {
        return resource;
    }

}
