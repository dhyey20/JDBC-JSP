//SQL Example

import java.sql.*;
import java.util.Enumeration;
public class Practical4 {
	public static void main(String args[]) 
	{
		
		Enumeration<Driver> drivers = DriverManager.getDrivers();
		System.out.println(drivers);
		
		
	}
}
