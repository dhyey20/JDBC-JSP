import java.sql.*;
public class prac8
{
	public static void main(String args[])
	{
		String driverName = "com.mysql.jdbc.Driver";
		 String url = "jdbc:mysql://localhost:3306/db";			
		 String userName = "root";
		 String pwd = "1234";
		 String sql="call insertdata (?,?,?)";
		 try 
		{
			Class.forName(driverName);
			Connection conn=DriverManager.getConnection(url,userName,pwd);
			CallableStatement ca=conn.prepareCall(sql);
                        ca.setInt(1, 104);
			ca.setString(2, "PQR");
			ca.setInt(3,90);
			ca.execute();
			Statement st = conn.createStatement();
                        ResultSet r = st.executeQuery("select * from student where name='ABC'");
			if(r.next())
                            System.out.println("Roll no: "+r.getInt(1)+" Name: "+r.getString(2)+"  Percentage:"+r.getInt(3));
                        else
                            System.out.println("Data not inserted with Callable Statement");
                        conn.close();
			
		}
		 catch (ClassNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 catch(SQLException e)
		 {
			 System.out.println("Sql Eception");
                         e.printStackTrace();
		 }
		 finally
		 {
			 
			 
		 }
		
	}
}
