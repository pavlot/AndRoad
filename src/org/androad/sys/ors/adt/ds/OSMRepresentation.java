// Created by plusminus on 21:38:11 - 08.02.2009
package org.androad.sys.ors.adt.ds;


public enum OSMRepresentation {
	// ===========================================================
	// Elements
	// ===========================================================

	POLYGON, NODE, WAY, NONE;

	// ===========================================================
	// Constants
	// ===========================================================

	public static final OSMRepresentation[] NODE_OR_POLYGON = new OSMRepresentation[]{OSMRepresentation.NODE, OSMRepresentation.POLYGON};

	// ===========================================================
	// Fields
	// ===========================================================

	// ===========================================================
	// Constructors
	// ===========================================================

	// ===========================================================
	// Getter & Setter
	// ===========================================================
}