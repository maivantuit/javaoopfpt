package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.naming.spi.DirStateFactory.Result;

import connection.DBConnect;

import model.Experience;

public class ExperienceDAO {
	// 0. 
	
	// 1. get table Experience:
	public ArrayList<Experience> getlistExperience(){
		Connection con = DBConnect.getConnection();
		ArrayList<Experience> list = new ArrayList<>();
		String sql = "Select * from Experience";
		try {
			PreparedStatement pstmt = con.prepareCall(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				Experience e = new Experience();
				e.setCandidateID(rs.getString("CandidateID"));
				e.setFullName(rs.getString("FullName"));
				e.setBirthDay(rs.getString("BirthDay"));
				e.setPhone(rs.getString("Phone"));
				e.setEmail(rs.getString("Email"));
				e.setCandidate_type(rs.getInt("CandidateType"));
				e.setExpInYear(rs.getInt("ExpInYear"));
				e.setProSkill(rs.getString("ProSkill"));
				list.add(e);
			}
		} catch (Exception e) {
			System.out.println("Error general!: "+e.getMessage());
		}
		
		return list;
	}
	
	// 2. get table Experience by a parameter (key):
	public Experience getARecordExperienceByID(String canid){
		Connection con  = DBConnect.getConnection();
		String sql = "select * from Experience where CandidateID = '"+canid+"'";
		Experience e = new Experience();
		try {
			PreparedStatement pstmt = con.prepareCall(sql);
			ResultSet rs = pstmt.executeQuery();			
			while(rs.next()){
				e.setCandidateID(rs.getString("CandidateID"));
				e.setFullName(rs.getString("FullName"));
				e.setBirthDay(rs.getString("BirthDay"));
				e.setPhone(rs.getString("Phone"));
				e.setEmail(rs.getString("Email"));
				e.setCandidate_type(rs.getInt("CandidateType"));
				e.setExpInYear(rs.getInt("ExpInYear"));
				e.setProSkill(rs.getString("ProSkill"));				
			}
		} catch (Exception ex) {
			System.out.println("Error general: "+ex.getMessage());
		}
		
		return e;
	}
	// 3. insert an experience
	public void insertExperience(String candidateID, String fullName, String birthDay,
		String phone, String email, int candidate_type, int expInYear, String proSkill){
		Connection con  = DBConnect.getConnection();
		try {
			SimpleDateFormat d = new SimpleDateFormat("dd/MM/yyyy");
			java.util.Date parsed = d.parse(birthDay);
			//System.out.println("B");
			java.sql.Date sq = new java.sql.Date(parsed.getTime());;
			try {
				PreparedStatement pstmt;
				ResultSet rs;
				//System.out.println("C");
				String sql = "insert into Experience(CandidateID,FullName,BirthDay,Phone,Email,CandidateType,ExpInYear,ProSkill)" +
						" values(?,?,?,?,?,?,?,?)";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, candidateID);
				pstmt.setString(2, fullName);
				//System.out.println("A");
				pstmt.setDate(3, sq);
				pstmt.setString(4,phone);
				pstmt.setString(5,email);
				pstmt.setInt(6,candidate_type);
				pstmt.setInt(7,expInYear);
				pstmt.setString(8,proSkill);
				int row = pstmt.executeUpdate();
			} catch (Exception e) {
				System.out.println("Error general 1: "+e.getMessage());
			}
		} catch (Exception e) {
			System.out.println("Error general 2: "+e.getMessage());
		}finally{
			try {
				con.close();
			} catch (SQLException e) {				
				e.printStackTrace();
			}
		}
		
	}
	
	public void updateExperience(String candidateID, String fullName, String birthDay,
			String phone, String email, int candidate_type, int expInYear, String proSkill){
		Connection con  = DBConnect.getConnection();
		try {
			SimpleDateFormat d = new SimpleDateFormat("dd/MM/yyyy");
			java.util.Date parsed = d.parse(birthDay);
			//System.out.println("B");
			java.sql.Date sq = new java.sql.Date(parsed.getTime());;
			try {
				PreparedStatement pstmt;
				ResultSet rs;
				//System.out.println("C");
				String sql = "update Experience set CandidateID = ?, FullName = ?, BirthDay = ?,Phone=?,Email= ?, CandidateType = ?,ExpInYear = ?, ProSkill= ? where CandidateID = ?";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, candidateID);
				pstmt.setString(2, fullName);
				//System.out.println("A");
				pstmt.setDate(3, sq);
				pstmt.setString(4,phone);
				pstmt.setString(5,email);
				pstmt.setInt(6,candidate_type);
				pstmt.setInt(7,expInYear);
				pstmt.setString(8,proSkill);
				pstmt.setString(9,candidateID);
				int row = pstmt.executeUpdate();
			} catch (Exception e) {
				System.out.println("Error general 1: "+e.getMessage());
			}
		} catch (Exception e) {
			System.out.println("Error general 2: "+e.getMessage());
		}finally{
			try {
				con.close();
			} catch (SQLException e) {				
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		//1. 
		ExperienceDAO ed = new ExperienceDAO();
//		ArrayList<Experience> liste = ed.getlistExperience();
//		for(Experience ele : liste){
//			ele.showMe();
//		}
//		// 2. 
//		Experience e1 = ed.getARecordExperienceByID("Can1");
//		e1.showMe();
		// 3.
//		ed.insertExperience("Can5","Tu","30/03/1995","0982712932","tu@gmail.com",0,3,"Java and . NET");
		// 4. 
		Experience e2 = new Experience();
		
		
	}
}
