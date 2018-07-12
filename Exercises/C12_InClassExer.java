

import java.util.Scanner;

public class C12_InClassExer
{
	static Scanner scInput = new Scanner(System.in);

	public static void main(String[] args)
	{
		int bookCount = 0;
		int lastIdx = 0;
		C12_Book[] books = new C12_Book[3];

		int menuOption = MenuOption();

		while (menuOption != 0)
		{
			switch (menuOption)
			{
				case 1 :
					books[lastIdx] = CreateBook();
					lastIdx++;
					break;
				case 2 :
					C12_Book selectedBook = GetBookByIndex(books, lastIdx);
					break;
				case 3 :
					break;
				case 4 :
					ListOfBooks(books, lastIdx);
					break;
				default:
					System.out.println("That's not a valid option!");
					break;
			}

			menuOption = MenuOption();
		}

		System.out.println("Thanks for stopping by!");

	}

	//METHODS

	// Menu Option
	public static int MenuOption()
	{
		System.out.println("Welcome to Class 6: Question 1 - 14 Exercises!");
		System.out.println("______________________________________________\n");
		System.out.println("0 - Quit");
		System.out.println("1 - Create a book");
		System.out.println("2 - Take out a book");
		System.out.println("3 - Return a book");
		System.out.println("4 - List all books");

		System.out.print("\n\nPlease enter number for the selected option above: ");

		return scInput.nextInt();
	}

	// Create Book
	public static C12_Book CreateBook()
	{
		String bookName;
		String bookAuthor;
		int numCopies;

		System.out.print("Please enter the name of the book: ");
		bookName = scInput.nextLine();

		System.out.print("Please enter the author of the book: ");
		bookAuthor = scInput.nextLine();

		System.out.print("Please enter the number of copies: ");
		numCopies = scInput.nextInt();

		return new C12_Book(bookName, bookAuthor, numCopies);
	}

	// Borrow Book
	public static void BorrowBook()
	{

	}

	// Return Book
	public static void ReturnBook()
	{

	}

	// List of Books
	public static void ListOfBooks(C12_Book[] books, int lastIdx)
	{
		if (lastIdx == 0)
		{
			System.out.println("There are no books!");
		}

		for(int i=0; i<lastIdx; i++)
		{
			System.out.println(books[i].toString() + " Index = " + i);
		}		
	}

	// Get book to borrow or return
	public C12_Book GetBookByIndex(C12_Book[] books, int nlastIdx)
	{
		int bookIdx;
		ListOfBooks(books,nlastIdx);

		System.out.println();
		System.out.print("Please enter the index of the book: ");
		bookIdx = scInput.nextInt();

		return books[bookIdx];
	}
}