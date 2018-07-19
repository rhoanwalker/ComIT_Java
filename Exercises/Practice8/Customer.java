/*
	Filename:	Customer.java
	Purpose:	public class to implement a customer object
		>> contructor takes in customer name and number runs a private method to add customer invoice
*/

import java.util.Scanner;

public class Customer
{
	private int _customerNo;
	private String _customerName;
	private Invoice _invoice;

	public Customer(int customerNo, String customerName)
	{
		_customerNo = customerNo;
		_customerName = customerName;
		AddCustomerInvoice();
	}

	/* METHODS */
	// Add invoice to customer
	private void AddCustomerInvoice()
	{
		Scanner sc = new Scanner(System.in);
		int invNo;

		System.out.print("Please enter invoice number: ");
		invNo = sc.nextInt();

		_invoice = new Invoice(invNo);		
	}

	// prints the top portion of the the customer invoice
	public void printCustomerDetailsOnInvoice()
	{
		System.out.println();
		printCharacterMultipleTimes('*',41);
		System.out.println();
		System.out.println("Customer No.: " + _customerNo);
		System.out.println("Customer Name: " + _customerName);
		System.out.println();

		_invoice.printInvoiceDetails();
	}

	// simple method to print a special character multiple times. line a series of dashes for a line
	// takes the character and the number of times to repeat.
	private void printCharacterMultipleTimes(char charX, int xTimes)
	{
		for (int i = 0; i < xTimes; i++)
		{
			System.out.print(charX);
		}
	}
}