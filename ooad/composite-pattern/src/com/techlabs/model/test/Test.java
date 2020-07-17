package com.techlabs.model.test;

import com.techlabs.model.File;
import com.techlabs.model.Folder;

public class Test {
	public static void main(String[] args) {
		Folder root = new Folder("Movies");
		root.addChild(new File("abc", 100, ".avi"));
		
		Folder action = new Folder("Action");
		root.addChild(action);
		action.addChild(new File("lmn", 60, ".avi"));
		
		Folder adventure = new Folder("Adventure");
		action.addChild(adventure);
		
		action.addChild(new File("lmn", 60, ".avi"));
		
	
		root.addChild(new File("pqr", 200, ".avi"));
		System.out.println(root.show(0));
	}

}
