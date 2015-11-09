import java.sql.*;
public class DBAccessor {

    private static final String jdbcURL = "jdbc:oracle:thin:@ora.csc.ncsu.edu:1521:orcl";
    private static final String username = "dbshah3";      //unity id
    private static final String password = "dbmsproject12";      //9 digit student id

    public Connection getConnection() throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        return DriverManager.getConnection(jdbcURL, username, password);
    }

    public void executeUpdateSQL(String sql) throws Exception {
        Statement statement = getConnection().createStatement();
        statement.executeUpdate(sql);
        statement.close();
    }

    public void executeQuery(String sql) throws Exception {
        Statement statement = getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sql);
        while (rs.next()) {
            String s = rs.getString("COF_NAME");
            float n = rs.getFloat("PRICE");
            System.out.println(s + "   " + n);
        }
        statement.close();
    }

    public static void main(String[] args) throws Exception {
        DBAccessor dbAccessor = new DBAccessor();

        dbAccessor.executeUpdateSQL("CREATE TABLE COFFEES1 (COF_NAME VARCHAR(32), SUP_ID INTEGER, " +
                "PRICE FLOAT, SALES INTEGER, TOTAL INTEGER)");
        dbAccessor.executeUpdateSQL("INSERT INTO COFFEES1 VALUES ('Colombian', 101, 7.99, 0, 0)");
        dbAccessor.executeUpdateSQL("INSERT INTO COFFEES1 VALUES ('French_Roast', 49, 8.99, 0, 0)");

        dbAccessor.executeQuery("SELECT COF_NAME, PRICE FROM COFFEES1");
    }
}