package com.model;

import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Date;

 public abstract class Candidate {
	private String candidateID;
	private String fullName;
	private String birthDay;
	private String phone;
	private String email;
	private int candidate_type;
	private int candidate_count;
	private ArrayList<Certificate> listCertificate;
	
	public Candidate(){
		candidate_count++;
	}
	/**
	 * 
	 * @param ce
	 */
	public void addCertificate(Certificate ce){
		listCertificate.add(ce);
	}
	/**
	 * 
	 */
	public void showInFo(){
		System.out.printf("%-10s %-15s %-10s %-15s %-15s %-5s",candidateID,fullName,birthDay,phone,email,candidate_type);
	}
	
	/**
	 * @param candidateID
	 * @param fullName
	 * @param birthDay
	 * @param phone
	 * @param email
	 * @param candidate_type
	 * @param candidate_count
	 * @param listCertificate
	 */
	public Candidate(String candidateID, String fullName, String birthDay,
			String phone, String email, int candidate_type,
			int candidate_count, ArrayList<Certificate> listCertificate) {
		super();
		this.candidateID = candidateID;
		this.fullName = fullName;
		this.birthDay = birthDay;
		this.phone = phone;
		this.email = email;
		this.candidate_type = candidate_type;
		this.candidate_count = candidate_count;
		this.listCertificate = listCertificate;
	}



	/**
	 * @param candidateID
	 * @param fullName
	 * @param birthDay
	 * @param phone
	 * @param email
	 * @param candidate_type
	 * @param candidate_count
	 */
	public Candidate(String candidateID, String fullName, String birthDay,
			String phone, String email, int candidate_type) {		
		this.candidateID = candidateID;
		this.fullName = fullName;
		this.birthDay = birthDay;
		this.phone = phone;
		this.email = email;
		this.candidate_type = candidate_type;		
	}
	
	
	
	
	/**
	 * @return the listCertificate
	 */
	public ArrayList<Certificate> getListCertificate() {
		return listCertificate;
	}



	/**
	 * @param listCertificate the listCertificate to set
	 */
	public void setListCertificate(ArrayList<Certificate> listCertificate) {
		this.listCertificate = listCertificate;
	}



	/**
	 * @return the candidateID
	 */
	public String getCandidateID() {
		return candidateID;
	}
	/**
	 * @param candidateID the candidateID to set
	 */
	public void setCandidateID(String candidateID) {
		this.candidateID = candidateID;
	}
	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}
	/**
	 * @param fullName the fullName to set
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	/**
	 * @return the birthDay
	 */
	public String getBirthDay() {
		return birthDay;
	}
	/**
	 * @param birthDay the birthDay to set
	 */
	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}
	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the candidate_type
	 */
	public int getCandidate_type() {
		return candidate_type;
	}
	/**
	 * @param candidate_type the candidate_type to set
	 */
	public void setCandidate_type(int candidate_type) {
		this.candidate_type = candidate_type;
	}
	/**
	 * @return the candidate_count
	 */
	public int getCandidate_count() {
		return candidate_count;
	}
	/**
	 * @param candidate_count the candidate_count to set
	 */
	public void setCandidate_count(int candidate_count) {
		this.candidate_count = candidate_count;
	}
	
	
	
	
	
	
}
