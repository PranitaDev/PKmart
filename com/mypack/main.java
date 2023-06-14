package com.mypack;
import java.util.*;
import java.sql.*;
public class main {

	public static void main(String[] args) {
		
		logconnection lc = new logconnection();
		prodN p1=new prodN(); 
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter UserId and Password");
		p1.UserId=sc.next();
		p1.Password=sc.next();
		//All Data
		if(p1.getUserId() != null || p1.getPassword()!=null)
		{
			lc.se(p1);
			System.out.println("\nEnter Your Choice:");
			lc.sel();
			System.out.println("\nEnter the Id to select");
		}
		
		Shopping s=new Shopping();
		s.choice();
	
		Payment pay =new Payment();
		pay.bill();
		
		
		
	}

}
