package com.mypack;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
| id   | name          |
+------+---------------+
|    1 | self help     |
|    2 |  spirituality |
|    3 | bussiness     |
|    4 | friction      |*/
public class Book {

	connection c=new connection();
	public void selfHelp()
	{
	try
	{
		PreparedStatement pst=c.con.prepareStatement("select * from selfhelp");
		ResultSet rs=pst.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)
			+" "+rs.getInt(4));
			
		}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
	public void spirituality()
	{
	try
	{
		PreparedStatement pst=c.con.prepareStatement("select * from spirituality");
		ResultSet rs=pst.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)
			+" "+rs.getInt(4));
			
		}
		
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
	
	public void bussiness()
	{
	try
	{
		PreparedStatement pst=c.con.prepareStatement("select * from bussiness");
		ResultSet rs=pst.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)
			+" "+rs.getInt(4));
			
		}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}

	
	public void friction()
	{
	try
	{
		PreparedStatement pst=c.con.prepareStatement("select * from friction ");
		ResultSet rs=pst.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)
			+" "+rs.getInt(4));
			
		}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
}