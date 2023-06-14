package com.mypack;

import java.util.*;
import java.util.Scanner;

public class Payment 
{
	    String id = null;  
	    String productName = null;  
	    int quantity = 0;  
	    double price = 0.0;  
	    double totalPrice = 0.0;  
	    double overAllPrice = 0.0;  
	    double cgst, sgst, subtotal=0.0, discount=0.0;  
	    char choice = '\0';
	    Scanner scan = new Scanner(System.in);  
	    
	    public void bill()
	    {
	    	
	    List<AddToCart> atc = new ArrayList<AddToCart>();
	    
	    do   
	    {  
	        // read input values  
	        System.out.println("Enter the product details: ");  
	        System.out.println("Product ID: ");  
	        id = scan.next();  
	        System.out.println("Product Name: ");  
	        productName = scan.next();  
	        System.out.println("Quantity: ");  
	        quantity = scan.nextInt();  
	        System.out.println("Price (per unit): ");  
	        price = scan.nextDouble();  
	        //calculate total price for a particular product  
	        totalPrice = price * quantity;  
	        //calculates overall price  
	        overAllPrice = overAllPrice + totalPrice;  
	    
	        //creates Shoppingcart class object and add it to the List  
	        atc.add( new AddToCart(id, productName, quantity, price, totalPrice) );  
	        // ask for continue shopping?  
	        System.out.print("Want to add more items? (y or n): ");  
	        //reads a character Y or N  
	        choice = scan.next().charAt(0);  
	        //read remaining characters, don't store (no use)  
	        scan.nextLine();  
	    }
	    while (choice == 'y' || choice == 'Y');  
	    //display all product with its properties  
	    AddToCart.displayFormat();  
	    
	    for (AddToCart s : atc)   
	    {  
	        s.display(); 
	    }
	    
	    //price calculation  
	    System.out.println("\n\t\t\t\t\t\t\t            Total Amount (Rs.) " +overAllPrice);  
	    //calculating discount  
	    discount = overAllPrice*2/100;  
	    System.out.println("\n\t\t\t\t\t\t\t\t   Discount (Rs.) " +discount);  
	    //total amount after discount  
	    subtotal = overAllPrice-discount;   
	    System.out.println("\n\t\t\t\t\t\t\t\t        Subtotal "+subtotal);  
	    
	    System.out.println("\t\t----------------Thank You for Shopping!!-----------------");  
	    System.out.println("\t\t                     Visit Again");  
	    }
	}




