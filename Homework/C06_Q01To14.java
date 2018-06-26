/*
	Filename:	C06_Q01To14.java
	Developer:	Rhoan Walker
	Created:	June 20, 2018
	Modified:	June 25, 2018
	Description:
		--> This console app is java codes examples for CLass 6, question 1-14
		--> Here I am just using a menu to select which question to do
	Code Changes:

*/

// import java library to be used. Further research can be done on these
import java.util.Scanner;
import java.io.IOException;
import java.lang.Runtime;

class C06_Q01To14
{
	public static void main(String[] args)
	{
		// Declaration
		Scanner sc = new Scanner(System.in);
		int option;
		boolean exitApp = false;

		// While loop to keep program running until user decides to exit.
		while (!exitApp)
		{
			// Do while loop fail-safe to ensure user enters expected options
			do
			{
				Menu();
				option = sc.nextInt();			
			} while (!(option >=0 && option < 15));

			// action user selections
			switch (option)
			{
				case 0: exitApp = true; break;
				case 1: Question1(); break;
				case 2: case 3: case 4: case 5: case 6: case 7: Question2To7(option); break;
				case 8: Question8To13(1,3); break;
				case 9: Question8To13(1,9); break;
				case 10: Question8To13(1,10000); break;
				case 11: Question8To13(5,10); break;
				case 12: Question8To13(5,15); break;
				case 13: Question8To13(5,15000); break;
				case 14: Question14(); break;
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

		System.out.println("Thank you for using class 6, question 1-14!");

	}

	// Experiment with a menu option to make the program feel more dynamic.
	// This method will actually just display the menu items/list
	// A try catch is being used to manage any unhandeld exception baing that I am trying to use a runtime command.
	public static void Menu()
	{
		try {
			// Trying out the use of the clear screen bash command.
			// Still not fucntioning as how I would want however.
			Runtime.getRuntime().exec("clear");

			System.out.println("Welcome to Class 6: Question 1 - 14 Exercises!");
			System.out.println("______________________________________________\n");
			System.out.println("0. Exit");
			System.out.println("1. Phrase");
			System.out.println("2. Integer (273)");
			System.out.println("3. Float (7.5)");
			System.out.println("4. Sum (1234 + 532)");
			System.out.println("5. Subtraction (1234 - 532)");
			System.out.println("6. Multiplication (1234 * 532)");
			System.out.println("7. Division (1234 - 532)");
			System.out.println("8. Numbers 1 to 3");
			System.out.println("9. Numbers 1 to 9");
			System.out.println("10. Numbers 1 to 10,000");
			System.out.println("11. Numbers 5 to 10");
			System.out.println("12. Numbers 5 to 15");
			System.out.println("13. Numbers 5 to 15,000");
			System.out.println("14. \"Hello\" 200 times");

			System.out.println("\nEnter number of option to be displayed to screen:");
		}
		catch (IOException ex) {
			ex.printStackTrace(); // stack trace from IOException
		}

	}

	//Simple print line statement method
	public static void Question1()
	{
		System.out.println("Hi, I already print sentences.");
	}

	// Using one method (algorithm) being that these are literal values
	// So I'm passing the question number selected by the user to determine the output.
	public static void Question2To7(int q)
	{
		// use of a switch case statement to determine action to be taken.
		switch (q)
		{
			case 2 : System.out.println(273); break;
			case 3 : System.out.println(7.5); break;
			case 4 : System.out.println(1234 + 532); break;
			case 5 : System.out.println(1234 - 532); break;
			case 6 : System.out.println(1234 * 532); break;
			case 7 : System.out.println(1234 / 532); break;
			default : System.out.println("Error occurred with option value: " + q);
		}
	}

	//This method simply prints out a start to a end number. e.g: 1 - 3
	// It accepts two arguments and uses a while loop for printing the numbers
	public static void Question8To13(int x, int y)
	{
		while (x <= y)
		{
			// print the value of 'x' and increment
			System.out.println(x);
			x += 1; // same as x = x + 1;
		}
	}

	// Print "hello" 200 times
	// A For loop is utilized in the method
	public static void Question14()
	{
		// declare counter (i) variable of data type integer and initialize it to 1
		for (int i = 1; i <= 200; i++)
		{
			System.out.println(i + " - hello"); // the equivalent number is also printed
		}
	}
}