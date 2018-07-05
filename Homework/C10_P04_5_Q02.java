import java.util.Scanner;

class C10_P04_5_Q02
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		String nameOne;
		String nameTwo;

		System.out.print("Please enter the first name: ");
		nameOne = scanner.next();

		System.out.print("Please enter the seecond name: ");
		nameTwo = scanner.next();

		int compareNames = nameOne.compareTo(nameTwo);

		if (compareNames < 0 )
		{
			System.out.println("The name " + nameOne + " is first.");
		}
		else if (compareNames > 0)
		{
			System.out.println("The name " + nameTwo + " is first.");	
		}
		else
		{
			System.out.println("Both names " + nameOne + " and " + nameTwo + " are the same.");
		}

	}
	
}