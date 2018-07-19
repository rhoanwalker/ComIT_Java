

import java.util.Scanner;

public class C12_InClassExer
{
	public static void main(String[] args)
	{
		Scanner scInput = new Scanner(System.in);
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
				case 2 : // Take out a book

					GetBookByIndex(books, lastIdx);
					break;
				case 3 : // Return a book
					break;
				case 4 : // list of all books
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
		Scanner sc = new Scanner(System.in);

		System.out.print("\n***\n\n");
		System.out.println("Welcome to Class 12: Book Exercises!");
		System.out.println("______________________________________________\n");
		System.out.println("0 - Quit");
		System.out.println("1 - Create a book");
		System.out.println("2 - Take out a book");
		System.out.println("3 - Return a book");
		System.out.println("4 - List all books");

		System.out.print("\n\nPlease enter number for the selected option above: ");

		return sc.nextInt();
	}

	// Create Book
	public static C12_Book CreateBook()
	{
		Scanner sc = new Scanner(System.in);
		String bookName;
		String bookAuthor;
		int numCopies;

		System.out.print("Please enter the name of the book: ");
		bookName = sc.nextLine();

		System.out.print("Please enter the author of the book: ");
		bookAuthor = sc.nextLine();

		System.out.print("Please enter the number of copies: ");
		numCopies = sc.nextInt();

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
			System.out.println("Book no. " + (i+1) + " - " + books[i].toString());
		}		
	}

	// Get the index of the books in the available to be loaned
	public static int GetBookByIndex(C12_Book[] books, int lastIdx)
	{
		Scanner sc = new Scanner(System.in);

		int bookIdx;
		ListOfBooks(books,lastIdx);
		//C12_Book selectedBook = books[sc.nextInt() - 1];

		do 
		{
			System.out.println();
			System.out.print("Please enter the book no. to process: ");
			bookIdx = sc.nextInt() - 1;
		} while (!(bookIdx >= 0 && bookIdx < lastIdx));

		/*
			boolean isLoaned = selectedBook.Loan();

			if (isLoaned)
			{
				System.out.println("Book " + selectedBook.getName() + " loaned successfully!");
				System.out.println("There are " + selectedBook.getRemainingCopies() + " copies remaing to be loaned.");
			}
			else
			{
				System.out.println("Sorry, no books available to be loaned");
			}
		*/
		return bookIdx;
	} 
}