package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	public static Connection getConnection(){
		Connection connect = null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String connectionURL = "jdbc:sqlserver://DESKTOP-D617688\\SQLEXPRESS:1433;databaseName=ManageCandidate;user=sa;password=123";
			// thay localhost = DESKTOP-D617688\SQLEXPRESS, thêm dấu "\\"
			connect = DriverManager.getConnection(connectionURL);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connect;				
	}
	public static void main(String[] args) {
		Connection c = DBConnect.getConnection();
		if(c!=null){
			System.out.println("Ok");
		}
		
	}
}
