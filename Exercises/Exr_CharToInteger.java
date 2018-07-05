// Accept a input from the keyboard and print out the integer values

import java.util.Scanner;

class Exr_CharToInteger
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		String myString;

		System.out.print("Please enter a text: ");
		myString = scanner.nextLine();

		for (int i = 0; i < myString.length(); i++)
		{
			System.out.print((int)myString.charAt(i));
			if (i < (myString.length() - 1))
			{
				System.out.print(", ");
			}
		}
	}
}