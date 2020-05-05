package com.techlabs.model;

public class MandolinSpec extends InstrumentSpec {
	private Style style;

	public MandolinSpec(Builder builder, String model, Type type,Style style, Wood topWood, Wood backWood) {
		super(builder, model, type, topWood, backWood);
		this.style=style;
	}

	public boolean matches(InstrumentSpec otherSpec) {
		if (!super.matches(otherSpec))
			return false;
		if (!(otherSpec instanceof GuitarSpec))
			return false;
		MandolinSpec spec = (MandolinSpec) otherSpec;
		if (!style.equals(spec.style))
			return false;
		return true;
	}

}
