package com.techlabs.model;

public class GuitarSpec extends InstrumentSpec{
	private int numStrings;
	
	public GuitarSpec(Builder builder, String model, Type type, int numStrings, Wood topWood, Wood backWood) {
		super(builder, model, type, topWood, backWood);
		this.numStrings=numStrings;
	}
	
	public boolean matches(InstrumentSpec otherSpec) {
		if(!super.matches(otherSpec))
			return false;
		if(!(otherSpec instanceof GuitarSpec))
			return false;
		GuitarSpec spec = (GuitarSpec) otherSpec;
		if(numStrings!=spec.numStrings)
			return false;
		return true;
	}

}
