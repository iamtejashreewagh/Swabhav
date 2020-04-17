package com.techlabs.model;

public enum Type {
	ACOUSTICS, ELECTRIC;

	public String toString() {

		switch (this) {
		case ACOUSTICS:
			return "Acoustics";
		case ELECTRIC:
			return "Electric";
		default:
			return "None";

		}

	}

}
