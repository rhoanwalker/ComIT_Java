/*
	Filename:	Invoices.java
	Purpose:	model class for invoices class
		>> practice 8 - implementation of a Invoices object that has an array of Items
		>> user is prompt if they want to add more invoices up to 10
*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class Invoice
{
	/* PROPERTIES */
	final private int NUM_ITEMS = 10;
	private int _invoiceNo;
	private int _lastIdx = 0;
	private Item[] _items;

	/* CONSTRUCTORS */
	public Invoice(int invoiceNo)
	{
		_invoiceNo = invoiceNo;
		AddItemsToInvoice();
	}

	/* METHODS */
	public void AddItemsToInvoice()
	{
		_items = new Item[NUM_ITEMS];
		Taxes tax = new Taxes();
		int opt;
		
		do 
		{
			Scanner sc = new Scanner(System.in);
			String itemDesc = "";
			double itemPrice = 0.0;

			System.out.print("Please enter description for item " + (_lastIdx + 1) + ": ");
			itemDesc = sc.nextLine();

			System.out.print("Please enter the price for item " + (_lastIdx + 1) + ": ");
			itemPrice = sc.nextDouble();

			_items[_lastIdx] = new Item(itemDesc, itemPrice, tax.calculateTax(itemPrice));
			_lastIdx++;

			System.out.println("\n" + (_lastIdx) + " items of " + NUM_ITEMS + " added to this invoice.");

			if ((_lastIdx) >= NUM_ITEMS)
			{
				System.out.println("No more items can be added to this invoice!");
				break;
			}

			System.out.print("Do you want to add another item? 1-YES | 2-NO: ");
			opt = sc.nextInt();

		} while (opt == 1);

	}

	// prints the bottom portion of the invoice (item details)
	public void printInvoiceDetails()
	{
		DecimalFormat df = new DecimalFormat("#,###.00");
		double invoiceTotal = 0.0;
		Taxes taxCalc = new Taxes();

		System.out.println("Invoice number: " + _invoiceNo);
		System.out.println();
		System.out.println(String.format("%-30s%s", "Description", "Price"));
		for (int i = 0; i < _lastIdx; i++)
		{
			_items[i].printItemDetails();
			invoiceTotal += _items[i].getPrice();
		}

		double gst = taxCalc.calculateGST(invoiceTotal);
		double pst = taxCalc.calculatePST(invoiceTotal);

		System.out.println();
		printCharacterMultipleTimes('-',41);
		System.out.println();
		System.out.println(String.format("%-4s%36s", "Net: ", df.format(invoiceTotal)));
		System.out.println(String.format("%-8s%32s", "GST(5%): ", df.format(gst)));
		System.out.println(String.format("%-8s%32s", "PST(8%): ", df.format(pst)));
		System.out.println(String.format("%41s","__________"));
		System.out.println(String.format("%-6s%34s", "Total: ", df.format((invoiceTotal + gst + pst))));
		printCharacterMultipleTimes('*',41);
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