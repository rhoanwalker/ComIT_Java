# Practice 8
## Exercise
Develop a program that generates invoices for customers and purchase orders from suppliers.

The system displays a menu asking if you want to make an invoice or purchase order.
  * In case of an invoice, the program asks for the client’s data
  * In case of a purchase order, the program asks for the supplier’s data
Then the program asks to enter up to 10 items (may be less) with description and its value

At the end, the program calculates the net total, GST, PST and finally shows on screen all the data of the invoice or purchase order. It displays one piece of data per line:

  * Invoice Number / Purchase Order Number
  * Customer number / Supplier Number
  * Customer name / Supplier Name
  _____________________________
  Items with the value of each
  _____________________________ 
  * Net total
  * GST
  * PST
  * Final total

## Solution
* Classes
  * Main Program:
    * [Practice 8](Practice8App.java) - The class that implements the main method.

  * Customer Invoice:
    * [Customer](Customer.java) - This class stores the customer and invoices object for the customer. A method used to add invoice
    * [Invoice](Invoice.java) - Stores details of the customer invoice and items object.

  * Supplier Purchase Order:
    * [Supplier](Supplier.java) - Store the supplier and purchase order for the supplier. A method is used to add purchase order.
    * [PurchaseOrder](PurchaseOrder.java) - Stores details of the supplier purchase order and items object.

  * Shared class:
    * [Item](Item.java) - Both invoice and purchase order has a same requirements for what is stored/displayed. Item class used to modularize this.

  * Functional class:
    * [Taxes](Taxes.java) - Only implements functions to calculate tax amounts.