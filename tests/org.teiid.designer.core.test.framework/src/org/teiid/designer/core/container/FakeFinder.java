/*
 * JBoss, Home of Professional Open Source.
 *
 * See the LEGAL.txt file distributed with this work for information regarding copyright ownership and licensing.
 *
 * See the AUTHORS.txt file distributed with this work for a full listing of individual contributors.
 */
package org.teiid.designer.core.container;


/**
 * @since 3.1
 */
public class FakeFinder implements EObjectFinder {
    //############################################################################################################################
	//# Methods                                                                                                                  #
	//############################################################################################################################

	/**
	 * @see EObjectFinder#find(java.lang.Object)
     * @since 3.1
	 */
	@Override
	public Object find(final Object key) {
		return null;
	}

	/**
	 * @see EObjectFinder#findKey(java.lang.Object)
     * @since 3.1
	 */
	@Override
	public Object findKey(final Object object) {
		return null;
	}

}
