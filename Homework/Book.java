

public class Book
{
	public String name;
	public int numberOfPages;

	/* CONSTRUCTORS */
	public Book()
	{
		this.name = "Blank";
		this.numberOfPages = 33;
	}

	public Book(String name, int numberOfPages)
	{
		this.name = name;
		this.numberOfPages = numberOfPages;
	}

	/* METHODS */

	/* FUNCTIONS */

	// Gets the amount of paper required to print the book
	public int GetPaperRequired()
	{
		return (numberOfPages / 2) + (numberOfPages % 2);
	}

	// Returns the book details to string
	public String toString()
	{
		return System.out.println(name + " and it has " + numberOfPages + " pages.");
	}

}