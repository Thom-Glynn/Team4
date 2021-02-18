package com.qa.jdiAnswers;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
	
		// Initiate developer list
		List<Developer> d = new ArrayList<Developer>(); 
		//Adding an instance of BackendDeveloper class
		d.add(new BackendDeveloper());
		//Adding an instance of FrontendDeveloper class
		d.add(new FrontendDeveloper());
		// Create instance of Project 
		Project p = new Project(d);
		// call implement method from Project
		p.implement();
	}
}
