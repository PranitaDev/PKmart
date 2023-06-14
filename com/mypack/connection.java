package com.mypack;

import java.sql.*;

public class connection {
public Connection con;
	
	public connection()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ecomapp","root","pranita");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
