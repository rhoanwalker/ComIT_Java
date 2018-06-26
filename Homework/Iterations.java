import java.util.Scanner;

class Iterations
{
	public static void main (String[] args)
	{
		//PrintHelloXTimes(10);
		Scanner usrInput = new Scanner(System.in);
		Scanner scGen = new Scanner(System.in);
		int usrSelection;
		int result = 0; //default to zero to ensure result starts with a proper value

		WelcomeMenu();

		do
		{
			usrSelection = usrInput.nextInt();
			System.out.flush();
			Menu();
		} while (!(usrSelection > 0 && usrSelection < 3));

		switch (usrSelection)
		{
			case 1 : PrintHelloXTimes (10);
				break;
			default : System.out.println("Something gone wrong!");
		}

	}

	public static void WelcomeMenu()
	{
		System.out.flush();
		System.out.println("Hi, welcome to Iterations examples!");
		System.out.println("What would you like to do today?\n");
		Menu();
	}

	public static void Menu()
	{
		System.out.println("Please choose from the options below.");
		System.out.println("-------------------------------------\n");
		System.out.println("1 - Print Hello World X-Times!");
		System.out.println("2 - This was something else!");
		System.out.println("0 - Exit");
		System.out.println("-------------------------------------\n");
	}

	public static void PrintHelloXTimes (int numTimes)
	{
		int counter = 0;

		while (counter < numTimes)
		{
			System.out.println("Hello World!");
			counter ++;
		}
	}

	public static int MultiPlyNNumbers (int nNumbers)
	{
		int total = 0;
		int counter = 0;

		while (counter < nNumbers)
		{
			total = total * counter;
			counter ++;
		}

		return total;
	}

	public static int SumOfNNumbers (int nNumbers)
	{
		int sumTotal = 0;
		int counter = 0;

		while (counter < nNumbers)
		{
			sumTotal += counter;
			counter ++;
		}

		return sumTotal;
	}
}