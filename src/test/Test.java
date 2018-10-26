package test;

import java.sql.Connection;
import java.sql.DriverManager;



public class Test
{
public static void main(String args[])
{
	String url="jdbc:mysql://localhost:3306/mysql1";
    String user="root";
	String pass="tamtam";
	
	
	try {
		
		Connection con=DriverManager.getConnection(url,user,pass);
		System.out.println("connection biuld");
	}catch(Exception e)
	{
		System.out.println(e);
	}
}
}
