//SQL Example

import java.sql.*;
public class Prac4 {
	public static void main(String args[]) 
	{
		try{
		Class.forName("com.mysql.jdbc.Driver");
		}
		catch(Exception e){System.out.println(e.getMessage());}
		try
		{
		Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","1234");
		Statement st=c.createStatement();
		ResultSet r=st.executeQuery("select * from emp");
		while(r.next())
		{
			System.out.println(r.getInt(1)+"  "+r.getString(2));
		}
		st.close();
		c.close();
		}
		catch(SQLException e){System.out.println(e.getMessage());}
	}
}
