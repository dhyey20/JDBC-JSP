import java.sql.*;


public class prac6 {
public static void main(String[] args) {
    int count=0;
		try{
			try{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			}
			catch(Exception e){System.out.println(e.getMessage());}
                    try (Connection cn = DriverManager.getConnection("jdbc:odbc:example")) {
                        Statement st = cn.createStatement();
                        ResultSet rs = st.executeQuery("select * from emp");
                        ResultSetMetaData rsm=rs.getMetaData();
                        while(rs.next())
                        { 	
                        	//String s=rsm.getColumnTypeName(count);
                        	//System.out.println("Index of column:"+count+"  Type:"+s);
                        	count++;
       
                        }   
                        System.out.println("Number of records:"+count);
                        
                        System.out.println("Number of columns:"+rsm.getColumnCount());
                       
                        
                       
                        st.close();
                    }
                    
		}
		
		catch(SQLException e){System.out.println(e.getMessage());}
	}

}
