package com.techlabs.model;

public abstract class InstrumentSpec {
	private Builder builder;
	private String model;
	private Type type;
	private Wood backWood;
	private Wood topWood;

	public InstrumentSpec(Builder builder, String model, Type type, Wood topWood, Wood backWood) {
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.topWood = topWood;
		this.backWood = backWood;
	}
	
	public boolean matches(InstrumentSpec otherSpec) {
		if(builder!=otherSpec.builder) {
			return false;
		}
		if((model!=null) && (!model.equals("")) && (!model.equals(otherSpec))) {
			return false;
		}
		if(type!=otherSpec.type) {
			return false;
		}
		if(backWood!=otherSpec.backWood) {
			return false;
		}
		if(topWood!=otherSpec.topWood) {
			return false;
		}
		return true;
	}
	
	public Builder getBuilder() {
		return builder;
	}
	
	public String getModel() {
		return model;
	}
	
	public Wood getTopwood() {
		return topWood;
	}
	
	public Wood getBackwood() {
		return backWood;
	}
	
	public Type getType() {
		return type;
	}

}
