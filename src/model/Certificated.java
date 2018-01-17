package model;

import java.util.Date;

public class Certificated extends Candidate{
	private String certificateID;
	private String certificateName;
	private String certificateRank;
	private String certificateDate;
	/**
	 * 
	 */
	public Certificated() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param candidateID
	 * @param fullName
	 * @param birthDay
	 * @param phone
	 * @param email
	 * @param candidate_type
	 */
	public Certificated(String candidateID, String fullName, String birthDay,
			String phone, String email, int candidate_type) {
		super(candidateID, fullName, birthDay, phone, email, candidate_type);
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param certificateID
	 * @param certificateName
	 * @param certificateRank
	 * @param certificateDate
	 */
	public Certificated(String certificateID, String certificateName,
			String certificateRank, String certificateDate) {
		super();
		this.certificateID = certificateID;
		this.certificateName = certificateName;
		this.certificateRank = certificateRank;
		this.certificateDate = certificateDate;
	}
	public Certificated(String candidateID, String fullName, String birthDay,
			String phone, String email, int candidate_type,String certificateID, String certificateName,
			String certificateRank, String certificateDate) {
		super(candidateID, fullName, birthDay, phone, email, candidate_type);
		// TODO Auto-generated constructor stub
		this.certificateID = certificateID;
		this.certificateName = certificateName;
		this.certificateRank = certificateRank;
		this.certificateDate = certificateDate;
	}
	/**
	 * @return the certificateID
	 */
	public String getCertificateID() {
		return certificateID;
	}
	/**
	 * @param certificateID the certificateID to set
	 */
	public void setCertificateID(String certificateID) {
		this.certificateID = certificateID;
	}
	/**
	 * @return the certificateName
	 */
	public String getCertificateName() {
		return certificateName;
	}
	/**
	 * @param certificateName the certificateName to set
	 */
	public void setCertificateName(String certificateName) {
		this.certificateName = certificateName;
	}
	/**
	 * @return the certificateRank
	 */
	public String getCertificateRank() {
		return certificateRank;
	}
	/**
	 * @param certificateRank the certificateRank to set
	 */
	public void setCertificateRank(String certificateRank) {
		this.certificateRank = certificateRank;
	}
	/**
	 * @return the certificateDate
	 */
	public String getCertificateDate() {
		return certificateDate;
	}
	/**
	 * @param certificateDate the certificateDate to set
	 */
	public void setCertificateDate(String certificateDate) {
		this.certificateDate = certificateDate;
	}
	
	
}
