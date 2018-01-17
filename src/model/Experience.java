package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import java.util.Scanner;

import connection.DBConnect;

public class Experience extends Candidate{
	private int expInYear;
	private String proSkill;
	
	public Experience(String candidateID){
		Connection con = DBConnect.getConnection();
		try {
			Statement stmt = con.createStatement();
			String sql =  "select CandidateID from Experience where CandidateID = "+candidateID;
			ResultSet rs = stmt.executeQuery(sql);			
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
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
	
	public void inputExperience(){		
		Scanner sc = new Scanner(System.in);
		super.inputCandidate();
		System.out.print("Input expInYear: ");
		expInYear = sc.nextInt();		
		System.out.print("Input proSkill: ");
		proSkill = sc.nextLine();
		proSkill = sc.nextLine();
	}
	
	/**
	 * 
	 */
	public void showMe(){
		super.showInFo();
		System.out.printf("%-15s %-15s \n",expInYear,proSkill);
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
	

	
	
	
	public static void main(String[] args) {
		Experience e = new Experience("Can1");
		e.showMe();
	}
}
