/*
	Filename:	Item.java
	Description:	model class for items description and cost
		>> practice 8 - implementation of a Item object
*/

import java.text.DecimalFormat;

public class Item
{
	/* PROPERTIES */
	private String _description;
	private double _price;
	private double _tax;

	/* CONSTRUCTORS */
	public Item(String description, double price, double tax)
	{
		_description = description;
		_price = price;
		_tax = tax;
	}

	/* METHODS */
	// Print details of items. Item price then calculate tax
	public void printItemDetails()
	{
		DecimalFormat df = new DecimalFormat("#,###.00");
		System.out.println(String.format("%-30s%s%10s", _description,"$", df.format(_price)));
	}

	// prints details of items, price and tax amounts
	public void printPOItemDetails()
	{
		DecimalFormat df = new DecimalFormat("#,###.00");
		System.out.println(String.format("%-30s%10s%10s", _description, df.format(_price), df.format(_tax)));
	}

	/* FUNCTIONS */
	// Getter for price
	public double getPrice()
	{
		return _price;
	}
	// tax amount getter
	public double getTax()
	{
		return _tax;
	}
}