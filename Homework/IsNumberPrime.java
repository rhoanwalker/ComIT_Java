import java.util.Scanner;

class IsNumberPrime
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int numberToCheck, remainder;
		int counter = 2;
		boolean isNumberPrime = true;

		System.out.println("Please enter number to check!\n");
		numberToCheck = sc.nextInt();

		while ((counter < numberToCheck) && isNumberPrime)
		{
			remainder = numberToCheck % counter;

			if (remainder == 0)
			{
				isNumberPrime = false;
			}
			counter ++;
		}

		if (isNumberPrime)
		{
			System.out.println("The number " + numberToCheck + " is a prime number!");
		}
		else
		{
			System.out.println("The number " + numberToCheck + " is a Not prime number!");
		}
	}
}