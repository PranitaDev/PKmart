package com.mypack;
import java.sql.*;

public class Category {
	connection c=new connection();
	
	public void eletronic()
	{
	try
	{
		PreparedStatement pst=c.con.prepareStatement("select * from Electronics");
		ResultSet rs=pst.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2));
			
		}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
	
	public void fashion()
	{
	try
	{
		PreparedStatement pst=c.con.prepareStatement("select * from Fashion");
		ResultSet rs=pst.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2));
			
		}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}

	public void beauty()
	{
	try
	{
		PreparedStatement pst=c.con.prepareStatement("select * from Beauty");
		ResultSet rs=pst.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2));
			
		}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
	
	public void book()
	{
	try
	{
		PreparedStatement pst=c.con.prepareStatement("select * from Books");
		ResultSet rs=pst.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2));
			
		}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
}
