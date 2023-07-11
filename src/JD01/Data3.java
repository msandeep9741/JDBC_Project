package JD01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Data3 {

	public static void main(String[] args) throws SQLException {
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_01", "root", "Y1012Jqkhkp");
		Statement stm = conn.createStatement();
		stm.executeUpdate("update college set mobile='9663493546' where name='shivu'");
		conn.close();
	}

}
