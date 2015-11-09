import java.sql.*;

public class prac7 {
public static void main(String[] args) {
			try{
				Class.forName("com.mysql.jdbc.Driver");
			}
			catch(Exception e){System.out.println(e.getMessage());}
			Connection c;
			try {
				c = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","1234");
			
                        Statement st = c.createStatement();
                        ResultSet rs = st.executeQuery("select * from student where name='ABC'");
                        while(rs.next())
                            System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3));  
			} catch (SQLException e) {
				e.printStackTrace();
			}          
            }
	

   
}
