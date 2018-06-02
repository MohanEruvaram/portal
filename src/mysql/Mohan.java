package mysql;

import java.sql.DriverManager;

import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;

public class Mohan {

	public static void main(String[] args) throws Exception{
java.sql.Connection con=DriverManager.getConnection("jdbc:odbc:login");
java.sql.Statement st=con.createStatement();
java.sql.ResultSet rs=st.executeQuery("select * from mohan");
	System.out.println("Mohan");
while(rs.next()) {
	System.out.println(rs.getInt(0)+"__________________"+rs.getInt(1));
}




	}

}
