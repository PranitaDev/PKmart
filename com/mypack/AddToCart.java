package com.mypack;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddToCart
{
	String id ;  
    String productName ;  
    int quantity;  
    double price ;  
    double totalPrice ;  
    
    
    public AddToCart(String id, String productName, int quantity, double price, double totalPrice) {
		super();
		this.id = id;
		this.productName = productName;
		this.quantity = quantity;
		this.price = price;
		this.totalPrice = totalPrice;
	}
	public List<Product> cartItems;//declare
   
    
    public AddToCart() {
        cartItems = new ArrayList<>();//memory allocation
    }

    public void addItem(Product prod) {
        cartItems.add(prod);
    }

    public void removeItem(Product prod) {
        cartItems.remove(prod);
    }

    public List<Product> getCartItems() {
        return cartItems;
    }
    public static void displayFormat()   
    {  
    	System.out.format("--------------------------------------------------------------------------------------------");  
        System.out.print("\nProduct ID\t\tName\t\tQuantity\t\tRate\t\tTotal Price\n");  
        System.out.format("--------------------------------------------------------------------------------------------\n");  
    
    }  
    
    public void display()   
    {  
        System.out.format("%-9s\t      %-9s\t     %5d\t       %9.2f\t        %14.2f\n" ,id, productName, quantity, price, totalPrice);  
    }  
}
    
