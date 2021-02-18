package com.qa.jdiAnswers;

import java.util.List;

public class Project {
	private List<Developer> developers;

	public Project(List<Developer> devs) {
		this.developers = devs;
	}

	public void implement() {
		// Loop through all objects inside developer list
		developers.forEach(d -> d.writeJavas());		
	}
}
