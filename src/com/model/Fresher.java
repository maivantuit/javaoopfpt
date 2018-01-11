package com.model;

import java.util.Date;

public class Fresher extends Candidate{
	private String graduationDate;
	private String graduationRank;
	private String education;
	
	public Fresher(){}

	
	/**
	 * @param graduationDate
	 * @param graduationRank
	 * @param education
	 */
	public Fresher(String graduationDate, String graduationRank, String education) {
		super();
		this.graduationDate = graduationDate;
		this.graduationRank = graduationRank;
		this.education = education;
	}


	/**
	 * @param candidateID
	 * @param fullName
	 * @param birthDay
	 * @param phone
	 * @param email
	 * @param candidate_type
	 */
	public Fresher(String candidateID, String fullName, String birthDay,
			String phone, String email, int candidate_type) {
		super(candidateID, fullName, birthDay, phone, email, candidate_type);
		// TODO Auto-generated constructor stub
	}
	
	public Fresher(String candidateID, String fullName, String birthDay,
			String phone, String email, int candidate_type, String graduationDate, String graduationRank, String education) {
		super(candidateID, fullName, birthDay, phone, email, candidate_type);
		// TODO Auto-generated constructor stub
		this.graduationDate = graduationDate;
		this.graduationRank = graduationRank;
		this.education = education;
	}


	/**
	 * @return the graduationDate
	 */
	public String getGraduationDate() {
		return graduationDate;
	}


	/**
	 * @param graduationDate the graduationDate to set
	 */
	public void setGraduationDate(String graduationDate) {
		this.graduationDate = graduationDate;
	}


	/**
	 * @return the graduationRank
	 */
	public String getGraduationRank() {
		return graduationRank;
	}


	/**
	 * @param graduationRank the graduationRank to set
	 */
	public void setGraduationRank(String graduationRank) {
		this.graduationRank = graduationRank;
	}


	/**
	 * @return the education
	 */
	public String getEducation() {
		return education;
	}


	/**
	 * @param education the education to set
	 */
	public void setEducation(String education) {
		this.education = education;
	}
	
	
	
}
