package JD01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Data2 {

	public static void main(String[] args) throws SQLException {
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_01", "root", "Y1012Jqkhkp");
		Statement stm = conn.createStatement();
		stm.executeUpdate("delete from college where name='shivu'");
		conn.close();
	}

}
