/*
	Filename:	PurchaseOrder.java
	Description:	model class for purchase order class
		>> practice 8 - implementation of a purchase order object that has an array of Items
		>> promts user for the amount of items that will be on the purchase order
*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class PurchaseOrder
{
	private int _purchaseOrderNo;
	private Item[] _items;

	public PurchaseOrder(int purchaseOrderNo, int numItems)
	{
		_purchaseOrderNo = purchaseOrderNo;
		AddItems(numItems);
	}

	public void AddItems(int numItems)
	{
		_items = new Item[numItems];
		Taxes tax = new Taxes();

		for (int i = 0; i < _items.length; i++)
		{

			Scanner sc = new Scanner(System.in);
			String itemDesc = "";
			double itemPrice = 0.0; 
			//double itemTax 0.0;

			System.out.print("Please enter item description for purchase order: ");
			itemDesc = sc.nextLine();

			System.out.print("Please enter item price: ");
			itemPrice = sc.nextDouble();

			_items[i] = new Item(itemDesc, itemPrice, tax.calculateTax(itemPrice));
		}

	}

	public void printPurchaseOrder()
	{
		DecimalFormat df = new DecimalFormat("$#,###.00");
		double purchaseOrderAmtTotal = 0.0;
		System.out.println("Purchase order number: " + _purchaseOrderNo);
		System.out.println();
		//System.out.println("Description\tPrice\tTax");
		System.out.println(String.format("%-33s%-12s%-10s", "Description", "Price $", "Tax $"));
		for (int i = 0; i < _items.length; i++)
		{
			_items[i].printPOItemDetails();
			purchaseOrderAmtTotal += (_items[i].getPrice() + _items[i].getTax());
		}

		//System.out.println();
		printCharacterMultipleTimes('-',50);
		System.out.println();
		System.out.println(String.format("%-6s%43s", "Total: ", df.format(purchaseOrderAmtTotal)));
		printCharacterMultipleTimes('*',50);
	}

	private void printCharacterMultipleTimes(char charX, int xTimes)
	{
		for (int i = 0; i < xTimes; i++)
		{
			System.out.print(charX);
		}
	}
}