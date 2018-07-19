/*
	Filename:	Practice8App.java
	Purpose:	Implements the main class method for the program.
		>> Program will keep running until the user enters an option to quit.
		>> Options to perform actions for customer and supplier as per requirements in Practice8_Ok.txt
*/

/* IMPORTS */
import java.util.Scanner;
import java.io.IOException;
import java.text.DecimalFormat;

public class Practice8App
{
	public static void main(String[] args)
	{
		Scanner mainScanner = new Scanner(System.in);
		int option;
		boolean exitApp = false;

		while (!exitApp)
		{	
			do // only move forward if a valid option is selected
			{
				Menu();
				option = mainScanner.nextInt();				
			}while (!(option >=0 && option < 3)); // Validate options

			// perform actions based on selected options
			switch (option)
			{
				case 0: exitApp = true; break;
				case 1: AddInvoice(); break;
				case 2: AddPurchaseOrder(); break;
				//case 3: customer.printCustomerDetailsOnInvoice(); break;
				default: System.out.println("Something gone wrong!");
			}

			if (option == 0) { break;} //Exit loop without pausing the program for user response.

			// Java requires a IOExceptions to be handled because of the method being used to pause the program.
			try {
				System.out.println("\nPress the Enter Key to continue...");
				System.in.read(); // pause program execution.
			}
			catch (IOException ex){ // catch block to handle IOException
				System.out.println("IO Exception" + ex.getMessage()); // print IOException to screen
			}

		}
		// display to user before exiting the system.
		System.out.println("Thank you for using Invoice and Purchase Order App!");		
	}

	/* METHODS */
	// Menu
	public static void Menu()
	{
		System.out.println("Welcome to the Invoice and Purchase Order App!");
		System.out.println("______________________________________________\n");
		System.out.println("0. Exit");
		System.out.println("1. Add Invoice");
		System.out.println("2. Add Purchase Order");
		System.out.println("3. Print Customer Invoice");
		System.out.println("4. Print Supplier Purchase Order");

		System.out.println("\nEnter number of option to be displayed to screen:");
	}

	// Add customer invoice and print details immediately
	public static void AddInvoice()
	{
		Customer customer; // create instance of supplier
		Scanner invScanner = new Scanner(System.in);
		int customerNo;
		String customerName;

		// Prompt for, accept and store keyboard input 
		System.out.print("Please enter customer name: ");
		customerName = invScanner.nextLine();

		System.out.print("Please enter customer number: ");
		customerNo = invScanner.nextInt();

		// create new object for customer invoice
		customer = new Customer(customerNo, customerName);
		customer.printCustomerDetailsOnInvoice();
	}

	// Add supplier purchase order and print details immediately
	public static void AddPurchaseOrder()
	{
		Supplier supplier; // create instance of supplier
		Scanner poScanner = new Scanner(System.in);
		int supplierNo;
		String supplierName;

		// Prompt for, accept and store keyboard input 
		System.out.print("Please enter supplier name: ");
		supplierName = poScanner.nextLine();

		System.out.print("Please enter supplier number: ");
		supplierNo = poScanner.nextInt();

		// create new object for supplier invoice
		supplier = new Supplier(supplierNo, supplierName, 1);
		supplier.printSupplierPurchaseOrder();
	}
	
}