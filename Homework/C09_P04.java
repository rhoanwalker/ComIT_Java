/*
	Filename: 	C09_P04.java - Class 9, Practice 4
	Developer:	Rhoan Walker
	Date:		July 4, 2018
	Description:	There are three question in the exercise. A menu option is used to have user select which question they want to do.
				(1)- Enter the height of a number of students and determine the average height and the number of student above/below.
				(2)- Enter the price of the items in a shoppoing cart and calculate the total amount with 13% tax for each item.
				(3)- Get the three telephone numbers of a contact based on the index input from keyboard. (contact list can be hard coded). 
	
	Things used:
		>> loops (for, while and do-while)
		>> conditionals (switch and if-then-else statements)
		>> Variables (global, constant, array)
			-->> array (single and multi-dimensional)
		>> try-catch
		>> sub-methods (void, returned and parameter)
*/	

import java.util.Scanner;
import java.io.IOException;

class C09_P04
{
	// GLOBAL VARIABLE
	static Scanner gbl_scInput = new Scanner(System.in);
	static final double TAX_RATE = 13;

	public static void main(String[] args)
	{
		int opt;
		int q3;
		boolean exitApp = false;

		while (!exitApp)
		{
			do 
			{
				Menu();
				opt = gbl_scInput.nextInt();
			} while (!(opt >= 0));

			switch (opt)
			{
				case 0: exitApp = true; break;
				case 1: HeightOfXStudents(4); break;
				case 2: ShoppingCart(3); break;
				case 3: // show contact from static directory
					System.out.print("Please enter index of the contact you wish to view: ");
					TelephoneNumbers(gbl_scInput.nextInt(), ContactsDirectoryStatic());
					break;
				case 4: // show contact from dynamic directory
					String[][] dynContactsDirectory = ContactsDirectoryDynamic();
					System.out.print("Please enter index of the contact you wish to view: ");
					TelephoneNumbers(gbl_scInput.nextInt(), dynContactsDirectory);
					break;
				default: System.out.println("Could not determine action to take from value entered!");
			}

			if (opt == 0) { break;} //Exit loop without pausing the program for user response.

			// Java requires a IOExceptions to be handled because of the method being used to pause the program.
			try {
				System.out.println("\nPress the Enter Key to continue...");
				System.in.read(); // pause program execution.
			}
			catch (IOException ex){ // catch block to handle IOException
				System.out.println("IO Exception" + ex.getMessage()); // print IOException to screen
			}
		}

		System.out.println("Thank you for using Class 9 Practice 4 app!");

	}

	public static void Menu()
	{
		System.out.println("Welcome to Class 9, Practice 4!");
		System.out.println("________________________________\n");
		System.out.println("0. Exit");
		System.out.println("1. Height of Student");
		System.out.println("2. Shopping Cart");
		System.out.println("3. Phone Numbers (Static Directory)");
		System.out.println("4. Phone Numbers (Dynamic Directory)");

		System.out.println("\nPlease enter option:");
	
	}

	public static void HeightOfXStudents(int x)
	{
		double[] studentsHeight = new double[x];
		double totalHeight = 0.0;
		double avgHeight = 0.0;
		int aboveAvg = 0;
		int belowAvg = 0;

		// accept student grade input from user for X number of students
		for (int i = 0; i < studentsHeight.length; i++)
		{
			System.out.print("Please enter the height of student " + (i+1) + ": ");
			studentsHeight[i] = gbl_scInput.nextDouble();
			totalHeight += studentsHeight[i];
		}

		// get the average height for the students
		avgHeight = totalHeight / studentsHeight.length;

		// determine how many student is above (>=) the average height. otherwise below the average height
		for (int j = 0; j < studentsHeight.length; j++)
		{
			if (studentsHeight[j] >= avgHeight)
			{
				aboveAvg += 1;
			}
			else
			{
				belowAvg += 1;
			}
		}

		System.out.println("The average height is: " + String.format("%.2f", avgHeight));
		System.out.println("There are " + String.format("%.2f", aboveAvg) + " students above the average height");
		System.out.println("There are " + String.format("%.2f", belowAvg) + " students below the average height");

	}

	public static void ShoppingCart(int num)
	{
		double[] itemsPrice = new double[num];

		// get the price for each item in cart
		for (int i = 0; i < itemsPrice.length; i++)
		{
			System.out.print("Please enter the price for item " + (i+1) + " : $");
			itemsPrice[i] = gbl_scInput.nextDouble();
		}

		// call sub method to display total cost of each item. Price + Tax
		DisplayTotalItemCost(itemsPrice);
	}

	public static void DisplayTotalItemCost(double[] itemsPrice)
	{
		double taxAmt = 0.0;

		for (int i = 0; i < itemsPrice.length; i++)
		{
			taxAmt = itemsPrice[i] * (TAX_RATE/100);
			System.out.println("The price with tax on item " + (i+1) + " is: $" + String.format("%.2f", (itemsPrice[i] + taxAmt)));
		}
	}

	// The contact list is expected as a parameter. This is done to facilitate a static (hard code list) and
	// a dynamic (input from keyboard)
	public static void TelephoneNumbers(int idx, String[][] contactList)
	{
		// The index of the contact is expected and not the position. Therefore contact 1 is index 0
		for (int i = 0; i < contactList[(idx)].length; i++)
		{
			//System.out.println("Contact at index " + idx + ", phone number " + (i+1) + ": " + contactList[idx][i]);
			System.out.println("Contact at index " + idx + ", " + PhoneType(i+1) + ": " + contactList[idx][i]);
		}
	}

	// Static directory
	public static String[][] ContactsDirectoryStatic()
	{
		String[][] contactList = new String[5][3];

		contactList[0][0] = "204-111-0000";
		contactList[0][1] = "204-111-1111";
		contactList[0][2] = "204-111-2222";

		contactList[1][0] = "204-222-0000";
		contactList[1][1] = "204-222-1111";
		contactList[1][2] = "204-222-2222";

		contactList[2][0] = "204-333-0000";
		contactList[2][1] = "204-333-1111";
		contactList[2][2] = "204-333-2222";

		contactList[3][0] = "204-444-0000";
		contactList[3][1] = "204-444-1111";
		contactList[3][2] = "204-444-2222";

		contactList[4][0] = "204-555-0000";
		contactList[4][1] = "204-555-1111";
		contactList[4][2] = "204-555-2222";

		return contactList;
	}

	//Dynamic directory
	public static String[][] ContactsDirectoryDynamic()
	{
		String[][] contactList;

		System.out.print("Please enter the number of contacts: ");
		int numContacts = gbl_scInput.nextInt();

		contactList = new String[numContacts][3]; // number of phone numbers hard coded for this exercise

		for (int i = 0; i < contactList.length; i++)
		{
			for (int j = 0; j < contactList[i].length; j++)
			{
				System.out.print("Please enter " + PhoneType(j+1) + " number for contact at index " + i + ": ");
				contactList[i][j] = gbl_scInput.next();
			}
		}

		return contactList;
	}

	public static String PhoneType(int x)
	{
		String phoneType = "";

		switch (x)
		{
			case 1: phoneType = "Mobile"; break;
			case 2: phoneType = "Home"; break;
			case 3: phoneType = "Work"; break;
			default: System.out.println("Phone type could not be retrieved!");
		}

		return phoneType;
	}
}