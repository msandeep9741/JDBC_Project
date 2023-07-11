package JD01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Data1 {

	public static void main(String[] args) throws SQLException {
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_01", "root", "Y1012Jqkhkp");
		Statement state = con.createStatement();
		state.executeUpdate("insert into college values(02,'sandeep','banglore','sandeep@gmail.com','9876543453')");
		//state.executeUpdate("delete from student where name='shivu'");
		con.close();
		System.out.println("Data");
	}

}
