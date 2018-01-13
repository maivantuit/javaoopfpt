package com.model;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagementCadidate {
	public static void main(String[] args) {		
		// day1:		
		/*
		ArrayList<Candidate> listCandidate = new ArrayList<Candidate>(); 
		
		Experience e1 = new Experience("Can01", "Mai Van Tu", "30/03/1995", "0987 321 321", "tu@gmail.com", 0, 3, "Java, C#");
		Experience e2 = new Experience("Can02", "Mai Van Tu2", "30/03/1995", "0987 321 321", "tu@gmail.com", 0, 3, "Java, C#");
		
		listCandidate.add(e1);
		listCandidate.add(e2);
		
		Fresher f1 = 
		new Fresher("Can03", "Khanh Nhi", "20/01/1996", "0982818212", "nhi@gmail.com", 1, "2018", "Gioi","DH Su Pham Ky Thuat");
		
		listCandidate.add(f1);
		
		Intern i1 = new Intern("Can04","Trinh Hong Dao","01/01/1995","0921818192","dao@gmail.com",2,"IT","Hoc Ky 5","DH Marketing");
		
		listCandidate.add(i1);
		
		for(Candidate element : listCandidate){
			if(element instanceof Experience){
				((Experience) element).showMe();
			}
			if(element instanceof Fresher){
				((Fresher) element).showMe();
			}
			if(element instanceof Intern){
				((Intern) element).showMe();
			}
		}
		*/
		
		// day 2:
		Scanner sc = new Scanner(System.in);
		ArrayList<Candidate> listCandidate2 =  new ArrayList<Candidate>();
		int n =0; // so phan tu.
		int array[] =null;
		int  choice = 0;
		do{
			System.out.println("---------------------------MANAGEMENT CANDIDATE------------------------------");
			System.out.println("1. Input info for experience");
			System.out.println("2. Input info for fresher");
			System.out.println("3. Input info for intern");
			System.out.println("4. Dislay infomation of candidates");
			System.out.println("5. Exit");
			System.out.println("Please, choice number 1-5");
			choice =sc.nextInt();
			switch (choice) {
			case 1:
				System.out.print("You wanna input how experience: ");
				n =sc.nextInt();
				array = new int[n];
				for (int i = 0; i < array.length; i++) {
					Experience e1 = new Experience();
					e1.inputExperience();	
					listCandidate2.add(e1);
				}
				System.out.println("Array after input: ");
				/*
				for (int i = 0; i < listCandidate2.size(); i++) {
					if(listCandidate2.get(i) instanceof Experience){
						listCandidate2.get(i).showInFo();
					}					
				}
				*/
				for(Candidate ele : listCandidate2){
					if(ele instanceof Experience){
						((Experience) ele).showMe();
					}
				}
				break;
			case 2:
				
				break;
			case 3:
	
				break;
			case 4:
				
				break;
			}
		}while(choice !=5);
		
	}
}
