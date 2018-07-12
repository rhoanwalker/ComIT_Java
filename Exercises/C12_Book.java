

public class C12_Book
{
	// PROPERTIES
	private String _name;
	private String _author;
	private int _numCopies;
	private int _copiesLent;

	// CONSTRUCTORS
	public C12_Book()
	{
		_name = "Blank";
		_author = "Blank";
		_numCopies = 0;
		_copiesLent = 0;
	}

	public C12_Book(String name, String author, int numCopies)
	{
		_name = name;
		_author = author;
		_numCopies = numCopies;
		_copiesLent = 0;
	}

	// METHODS and FUNCTIONS

	public String toString()
	{
		return _name + ", by " + _author + ". " + _copiesLent + " copies lent out from " + _numCopies + " total.";
	}

	public String getName() { return _name; }
	public int getRemainingCopies() { return _numCopies - _copiesLent;}

	public boolean Loan()
	{
		boolean copyLent = false;

		if (_copiesLent < _numCopies)
		{
			_copiesLent++;
			copyLent = true;
		}

		return copyLent;
	}

}