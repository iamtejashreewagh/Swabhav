package com.techlabs.product;

import com.techlabs.product.AutoType;
import com.techlabs.product.IAuto;

public enum AutoMobileFactory {
	INSTANCE;
	
	public IAuto make(AutoType type) {
		if(type == AutoType.AUDI) {
			return new Audi();
		}
		if(type == AutoType.BMW) {
			return new Bmw();
		}
			return new Tesla();
		
	}

}
