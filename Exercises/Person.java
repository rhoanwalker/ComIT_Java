/*
	Filename:	Person.java
	Description:	The person class - does not implement a main method
		>> Class 14 - Implemented with two attributes (first and last name) and a function to equate twon instances of a person
		>> Practice 6 - added phone number attribute to accept only 10 digits
*/

public class Person
{
	/* PROPERTIES */
	final private int PHONE_NO_LENGTH = 10;
	private String _firstname;
	private String _lastname;
	private int _phoneNo;

	/* CONSTRUCTORS */
	public Person()
	{
		_firstname = "";
		_lastname = "";
		_phoneNo = 1000000000;
	}

	public Person(String firstname, String lastname)
	{
		_firstname = firstname;
		_lastname = lastname;
	}

	public void setPhoneNo(int phoneNo)
	{
		if (phoneNo.length == PHONE_NO_LENGTH)
		{
			_phoneNo = phoneNo;
		}
	}

	/* METHODS */


	/* FUNCTIONS */
	public String getFirstname() {return _firstname; }
	public String getLastname() {return _lastname; }
	public int getPhoneNo() {return _phoneNo; }
	public String getFullname() { return _firstname + " " + _lastname; }

	public boolean equals(Person person)
	{
		return (_firstname.equals(person._firstname) && _lastname.equals(person._lastname));
	}
}