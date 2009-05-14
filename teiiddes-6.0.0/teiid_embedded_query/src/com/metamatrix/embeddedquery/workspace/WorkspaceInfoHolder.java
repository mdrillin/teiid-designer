/*
 * JBoss, Home of Professional Open Source.
 *
 * See the LEGAL.txt file distributed with this work for information regarding copyright ownership and licensing.
 *
 * See the AUTHORS.txt file distributed with this work for a full listing of individual contributors.
 */
package com.metamatrix.embeddedquery.workspace;

public class WorkspaceInfoHolder {
	static WorkspaceInfo info;
	
	public static WorkspaceInfo getInfo() {
		return info;
	}
	
	public static void setInfo(WorkspaceInfo winfo) {
		info = winfo;
	}
}
