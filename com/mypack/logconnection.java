package com.mypack;

import java.sql.*;
import java.util.Scanner;
public class logconnection 
{
    connection c=new connection();
    Scanner sc=new Scanner(System.in);
	public void in(prodN p1)
	{
		try
		{
			PreparedStatement pst=c.con.prepareStatement("insert into login values(?,?)");
			pst.setString(1,p1.getUserId());
			pst.setString(2,p1.getPassword());			
			int b=pst.executeUpdate();
			if(b==1)
			System.out.println("Registered...");
			else
				System.out.println("Try again....");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void se(prodN p1)
	{
	try
	{
		PreparedStatement pst=c.con.prepareStatement("select * from login where USerId=? and Password=?");
		pst.setString(1,p1.getUserId());
		pst.setString(2,p1.getPassword());
		ResultSet rs=pst.executeQuery();
		
		if(rs.next())
		{
			p1.setPassword(rs.getString(2));
			System.out.println("Login Success...");
		}
		else
		{
		System.out.println("Login Fail,Register First...");
		System.out.println("For Registration type 'reg'");
		String s=sc.next();
		if(s.equals("reg"))
		{
		   in(p1);
		}   
		}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}

	public void sel()
	{
		try
		{
			PreparedStatement pst=c.con.prepareStatement("select * from category");
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
