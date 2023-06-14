package com.mypack;

import java.sql.*;

public class Electronic {
connection c=new connection();
/* 1 | Mobile      |
|  2 | comp/Laptop |
|  3 | TV          |
|  4 | Smart home  |*/
	public void mobile()
	{
	try
	{
		PreparedStatement pst=c.con.prepareStatement("select * from Mobile");
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
	public void laptop()
	{
	try
	{
		PreparedStatement pst=c.con.prepareStatement("select * from Laptop");
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
	
	public void tv()
	{
	try
	{
		PreparedStatement pst=c.con.prepareStatement("select * from TV");
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

	
	public void smartHome()
	{
	try
	{
		PreparedStatement pst=c.con.prepareStatement("select * from smarthome");
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