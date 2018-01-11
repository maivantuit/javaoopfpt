package com.model;

import java.util.ArrayList;

public class ManagementCadidate {
	public static void main(String[] args) {
		
		// day1:
		ArrayList<Candidate> listCandidate = new ArrayList<Candidate>(); 
		
		Experience e1 = new Experience("Can01", "Mai Van Tu", "30/03/1995", "0987 321 321", "tu@gmail.com", 0, 3, "Java, C#");
		Experience e2 = new Experience("Can02", "Mai Van Tu2", "30/03/1995", "0987 321 321", "tu@gmail.com", 0, 3, "Java, C#");
		
		listCandidate.add(e1);
		listCandidate.add(e2);
		
		for(Candidate element : listCandidate){
			if(element instanceof Experience){
				((Experience) element).showMe();
			}
		}
		
		
	}
}
