package com.mypack;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Fashion 
{
	connection c=new connection();
/*
| id   | name         |
+------+--------------+
|    1 | menfashion   |
|    2 | womenfashion |
|    3 | footwear     |
|    4 | jewellary    |*/
	
	public void menfashion()
	{
	try
	{
		PreparedStatement pst=c.con.prepareStatement("select * from menfashion");
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
	public void womenfashion()
	{
	try
	{
		PreparedStatement pst=c.con.prepareStatement("select * from womenfashion");
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
	
	public void footwear()
	{
	try
	{
		PreparedStatement pst=c.con.prepareStatement("select * from footwear");
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

	
	public void jewellary()
	{
	try
	{
		PreparedStatement pst=c.con.prepareStatement("select * from jewellary");
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
