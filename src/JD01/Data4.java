package JD01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class Data4 {

	public static void main(String[] args) throws SQLException {
		try {
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_01", "root", "Y1012Jqkhkp");
		Statement stm = conn.createStatement();
		ResultSet exec = stm.executeQuery("select * from student");
		while(exec.next())
		{
			System.out.println(exec.getString(1));
			System.out.println(exec.getString(2));
			System.out.println(exec.getString(3));
			System.out.println(exec.getString(4));
			
		}
		
		
		conn.close();
	}
		catch (Exception e ) {
			e.printStackTrace();
		}
}
}

