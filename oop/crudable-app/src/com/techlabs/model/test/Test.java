package com.techlabs.model.test;

import com.techlabs.model.AddressDB;
import com.techlabs.model.CustomerDB;
import com.techlabs.model.DataBase;
import com.techlabs.model.OrderDB;

public class Test {
	public static void main(String[] args) {
		DataBase db = new DataBase();
		db.doDBOperations(new CustomerDB());
		db.doDBOperations(new AddressDB());
		db.doDBOperations(new OrderDB());
	}

}
