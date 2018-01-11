package com.model;

import java.util.Date;

public class Experience extends Candidate{
	private int expInYear;
	private String proSkill;
	
	public Experience(){}
	
	
	/**
	 * @param expInYear
	 * @param proSkill
	 */
	public Experience(int expInYear, String proSkill) {
		super();
		this.expInYear = expInYear;
		this.proSkill = proSkill;
	}
	
	public void showMe(){
		super.showInFo();
		System.out.printf("%-5s %-15s \n",expInYear,proSkill);
	}
	
	
	/**
	 * @param candidateID
	 * @param fullName
	 * @param birthDay
	 * @param phone
	 * @param email
	 * @param candidate_type
	 */
	public Experience(String candidateID, String fullName, String birthDay,
			String phone, String email, int candidate_type) {
		super(candidateID, fullName, birthDay, phone, email, candidate_type);
		// TODO Auto-generated constructor stub
	}

	public Experience(String candidateID, String fullName, String birthDay,
			String phone, String email, int candidate_type, int expInYear, String proSkill) {
		super(candidateID, fullName, birthDay, phone, email, candidate_type);
		this.expInYear = expInYear;
		this.proSkill = proSkill;
	}


	/**
	 * @return the expInYear
	 */
	public int getExpInYear() {
		return expInYear;
	}


	/**
	 * @param expInYear the expInYear to set
	 */
	public void setExpInYear(int expInYear) {
		this.expInYear = expInYear;
	}


	/**
	 * @return the proSkill
	 */
	public String getProSkill() {
		return proSkill;
	}


	/**
	 * @param proSkill the proSkill to set
	 */
	public void setProSkill(String proSkill) {
		this.proSkill = proSkill;
	}
	

	
	
	
	
}
