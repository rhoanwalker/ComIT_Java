// Class 10, Practice 4.5 - Question 2
// String.compareTo function is used to determine the 

import java.util.Scanner;

class C10_P04_5_Q02
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		String firstName;
		String secondName;

		System.out.print("Please enter the first name: ");
		firstName = scanner.next();

		System.out.print("Please enter the second name: ");
		secondName = scanner.next();

		int compareNames = firstName.compareTo(secondName);

		if (compareNames < 0 )
		{
			System.out.println("The name " + firstName + " is first.");
		}
		else if (compareNames > 0)
		{
			System.out.println("The name " + secondName + " is first.");	
		}
		else
		{
			System.out.println("Both names " + firstName + " and " + secondName + " are the same.");
		}

	}
	
}