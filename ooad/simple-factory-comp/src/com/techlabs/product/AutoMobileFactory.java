package com.techlabs.product;

import com.techlabs.product.AutoType;
import com.techlabs.product.IAuto;

public class AutoMobileFactory {
	
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
