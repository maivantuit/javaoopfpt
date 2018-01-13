package com.model;

import java.util.Date;
import java.util.Scanner;

public class Intern extends Candidate {
	private String majors;
	private String semester;
	private String universityName;
	
	public Intern(){}

	/**
	 * @param majors
	 * @param semester
	 * @param universityName
	 */
	public Intern(String majors, String semester, String universityName) {
		super();
		this.majors = majors;
		this.semester = semester;
		this.universityName = universityName;
	}

	/**
	 * @param candidateID
	 * @param fullName
	 * @param birthDay
	 * @param phone
	 * @param email
	 * @param candidate_type
	 */
	public Intern(String candidateID, String fullName, String birthDay,
			String phone, String email, int candidate_type) {
		super(candidateID, fullName, birthDay, phone, email, candidate_type);
		// TODO Auto-generated constructor stub
	}
	public Intern(String candidateID, String fullName, String birthDay,
			String phone, String email, int candidate_type, String majors, String semester, String universityName) {
		super(candidateID, fullName, birthDay, phone, email, candidate_type);
		// TODO Auto-generated constructor stub
		this.majors = majors;
		this.semester = semester;
		this.universityName = universityName;
	}
	public void inputIntern(){
		Scanner sc = new Scanner(System.in);
		super.inputCandidate();
		System.out.print("Input majors: ");
		majors =sc.nextLine();
		System.out.print("Input semester: ");
		semester =sc.nextLine();
		System.out.print("Input universityName: ");
		universityName =sc.nextLine();
	}
	/**
	 * 
	 */
	public void showMe(){
		super.showInFo();
		System.out.printf("%-15s %-15s %-15s \n",majors,semester,universityName);
	}

	/**
	 * @return the majors
	 */
	public String getMajors() {
		return majors;
	}

	/**
	 * @param majors the majors to set
	 */
	public void setMajors(String majors) {
		this.majors = majors;
	}

	/**
	 * @return the semester
	 */
	public String getSemester() {
		return semester;
	}

	/**
	 * @param semester the semester to set
	 */
	public void setSemester(String semester) {
		this.semester = semester;
	}

	/**
	 * @return the universityName
	 */
	public String getUniversityName() {
		return universityName;
	}

	/**
	 * @param universityName the universityName to set
	 */
	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}
	
	
}
