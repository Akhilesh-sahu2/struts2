import java.sql.Connection;
import java.sql.DriverManager;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/test","root","root");
		
		System.out.println(" Con: "+con);
	}
}
