package com.mypack;

import java.util.Scanner;

public class Shopping {
	
	logconnection lc = new logconnection();
	Electronic e1=new Electronic();
	Fashion f1=new Fashion();
	Beauty b1=new Beauty();
	Book bk1=new Book();
	prodN p1=new prodN(); 
	Category c1=new Category();
	
	Scanner sc=new Scanner(System.in);

	//Electronic Data
	public void choice()
	{
			String s2=sc.next();
			if(s2.equals("1"))
			{
				c1.eletronic();
				System.out.println("\nEnter Your Choice:");
				int s3=sc.nextInt();
				switch(s3)
				{
				case 1:e1.mobile();break;
				case 2:e1.laptop();break;
				case 3:e1.tv();break;
				case 4:e1.smartHome();break;
				default:System.out.println("invalid input...");
				}
			}
			//fashion data
			if(s2.equals("2"))
			{
				c1.fashion();
				System.out.println("\nEnter Your Choice:");
				int s3=sc.nextInt();
				
				switch(s3)
				{
				case 1:f1.menfashion();break;
				case 2:f1.womenfashion();break;
				case 3:f1.footwear();break;
				case 4:f1.jewellary();break;
				default :System.out.println("invalid input...");
				}
			}
			//Beauty data
			if(s2.equals("3"))
			{
				c1.beauty();
				System.out.println("\nEnter Your Choice:");
				int s3=sc.nextInt();
				switch(s3)
				{
				case 1:b1.makeup();break;
				case 2:b1.handBags();break;
				case 3:b1.skinCare();break;
				default :System.out.println("invalid input...");
				}	
			}
			//book data
			if(s2.equals("4"))
			{
				c1.book();
				int s3=sc.nextInt();
				switch (s3)
				{
				case 1:bk1.selfHelp();break;
				case 2:bk1.spirituality();break;
				case 3:bk1.bussiness();break;
				case 4:bk1.friction();break;
				default :System.out.println("invalid input...");
				}	
			}
		}
   }
