package db;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dbms
{
	
	public static Connection getConnection() 
	{
		try
		{
		Connection con;
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println(1);
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
		System.out.println(2);
		return con;
		}
		catch(Exception e)
		{
			System.out.println(">>>>>>>>>>>>>>>>>"+e);
		}
		return null;
	}
}
