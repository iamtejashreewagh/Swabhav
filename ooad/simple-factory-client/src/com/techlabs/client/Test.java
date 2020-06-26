package com.techlabs.client;

import com.techlabs.product.AutoMobileFactory;
import com.techlabs.product.AutoType;
import com.techlabs.product.IAuto;

public class Test {
	public static void main(String[] args) {
		AutoMobileFactory factory = new AutoMobileFactory();
		IAuto auto = factory.make(AutoType.BMW);
		auto.start();
		auto.stop();
		
		if (auto instanceof IAuto) {
			System.out.println("instance of IAuto");
		}
		
		System.out.println(auto.getClass());
	}

}
