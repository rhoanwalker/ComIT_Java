/*
	Filename:	Supplier.java
	Purpose:	public class to implement a supplier object
		>> contructor takes in supplier name and number runs a private method to add supplier purchase order
*/

import java.util.Scanner;

public class Supplier
{
	private int _supplierNo;
	private String _supplierName;
	private PurchaseOrder[] _purchaseOrders;

	public Supplier(int supplierNo, String supplierName, int purchaseOrderCnt)
	{
		_supplierNo = supplierNo;
		_supplierName = supplierName;
		AddPurchaseOrders(purchaseOrderCnt);
	}

	public void AddPurchaseOrders(int purchaseOrderCnt)
	{
		final int MAX_ITEM = 10;
		_purchaseOrders = new PurchaseOrder[purchaseOrderCnt];

		for (int i = 0; i < _purchaseOrders.length; i++)
		{
			Scanner sc = new Scanner(System.in);
			int purchaseOrderNo;
			int purchaseOrderItemCnt;

			System.out.print("Please enter purchase order number: ");
			purchaseOrderNo = sc.nextInt();

			do
			{
				System.out.print("Please enter number of items on purchase order: ");
				purchaseOrderItemCnt = sc.nextInt();
			} while (!(purchaseOrderItemCnt >= 0 && purchaseOrderItemCnt <= MAX_ITEM));

			_purchaseOrders[i] = new PurchaseOrder(purchaseOrderNo, purchaseOrderItemCnt);
		}
	}

	public void printSupplierPurchaseOrder()
	{
		System.out.println("*****************************");
		System.out.println();
		System.out.println("Supplier No.: " + _supplierNo);
		System.out.println("Supplier Name: " + _supplierName);
		System.out.println();

		for (int i = 0; i < _purchaseOrders.length; i++)
		{
			_purchaseOrders[i].printPurchaseOrder();
		}
	}
}