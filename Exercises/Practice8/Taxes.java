/*
	Filename:	Taxes.java
	Description:	class used to manage tax calculation
		>> practice 8 - calculation of taxes individually and as a total amount
*/

public class Taxes
{
	/* PROPERTIES */
	final private double _GST = 0.05;
	final private double _PST = 0.08;

	/* FUNCTIONS */
	// Total amount of taxes
	public double calculateTax(double price)
	{
		double gstTax = price * _GST;
		double pstTax = price * _PST;

		return (gstTax + pstTax);
	}

	// GST amount
	public double calculateGST(double price)
	{
		return (price * _GST);
	}

	// PST amount
	public double calculatePST(double price)
	{
		return (price * _PST);
	}
}