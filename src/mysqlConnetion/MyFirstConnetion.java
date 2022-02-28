package mysqlConnetion;
import java.sql.*;

public class MyFirstConnetion {

	
	public static void main(String[] args) {
		
		String baseDeDatos = "fooball";
		String usuario = "root";
		String password = "2017";
		String host = "localhost";
		String puerto = "3302";
		String driver = "com.mysql.jdbc.Driver";
		String cnx1 = "jdbc:mysql://localhost/mysql";
		
		Connection conn = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn= DriverManager.getConnection(cnx1,usuario,password);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		

	}
}
