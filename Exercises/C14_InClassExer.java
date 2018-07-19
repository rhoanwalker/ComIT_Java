/* 
	Filename: C14_InClassExer.java
	Description: Main file to used in Class 14
			>> Class16 Lecture, slide 36 - Check if two instances of the person class is equivalent
*/

import java.util.Scanner;

public class C14_InClassExer
{
	public static void main(String[] args)
	{
		// Create and populate person object
		Person person1 = CreatePerson(1);
		Person person2 = CreatePerson(2);

		// Just display data entered by the user before comparison.
		System.out.println("The names of the persons enter are: ");
		System.out.println("First person: " + person1.getFullname());
		System.out.println("Second person: " + person2.getFullname());

		// Comparison using .equals function in person class. (similar to .equals function for String class)
		if (person1.equals(person2))
		{
			System.out.println("Both person have the same name!");
		}
		else
		{
			System.out.println("The names of the persons don't have the same name!");
		}

	}

	// Simple method to create a person
	public static Person CreatePerson(int x)
	{
		Scanner sc = new Scanner(System.in);
		String firstname;
		String lastname;

		System.out.print("Please enter firstname of person " + x + ": ");
		firstname = sc.nextLine();

		System.out.print("Please enter lastname of person: " + x + ": ");
		lastname = sc.nextLine();

		return new Person(firstname, lastname);
	}
}

