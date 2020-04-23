package com.techlabs.model;

public class DataBase {
	public void doDBOperations(ICrudable obj) {
		obj.read();
		obj.create();
		obj.delete();
		obj.update();
	}

}
