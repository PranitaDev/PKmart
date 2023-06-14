package com.mypack;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
/*
| id   | name      |
+------+-----------+
|    1 | makeup    |
|    2 | hand bags |
|    3 | skin care |*/
public class Beauty {
	connection c=new connection();
	
	public void makeup()
	{
	try
	{
		PreparedStatement pst=c.con.prepareStatement("select * from makeup");
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
	public void handBags()
	{
	try
	{
		PreparedStatement pst=c.con.prepareStatement("select * from handbags");
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
	
	public void skinCare()
	{
	try
	{
		PreparedStatement pst=c.con.prepareStatement("select * from skincare");
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
