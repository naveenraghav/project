package db;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connect_File 
{
	static Connection con;
	static
	{
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println(1);
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
		System.out.println(2);
		}
		catch(Exception e)
		{
			System.out.println(">>>>>>>>>>>>>>>>>"+e);
		}

	}
	public static Connection getConnection() 
	{
		return con;
	}
}
