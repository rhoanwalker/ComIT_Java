import java.util.Scanner;

class C06_Q15To30
{
	// GLOBAL VARIABLES
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		int opt;

		do
		{
			Menu();
			opt = sc.nextInt();			
		} while (!(opt ==0 || (opt > 14 && opt < 31)));

		switch (opt)
		{
			case 0: System.exit(0); break;
			case 15: Question15(); break;
			case 16:
				System.out.println("Please enter a number:");
				Question16(sc.nextInt());
				break;
			case 17:
				System.out.print("Please enter CAD amount: ");
				double cad = sc.nextDouble();
				System.out.print("Please enter conversion rate: ");
				double rate = sc.nextDouble();
				Question17(cad, rate);
				break;
			case 18:
				System.out.print("Please enter two numbers.\nFirst number: ");
				int numOne = sc.nextInt();
				System.out.print("Second number: ");
				int numTwo = sc.nextInt();
				Question18(numOne, numTwo);
				break;
			case 19:
				Question19(10, 12.35, 'R');
				break;
			case 20:
				Question20();
				break;
			default: System.out.println("Something gone wrong!");
		}

		System.out.println("Thank you for using class 6, question 15-30!");
	}

	public static void Menu() 
	{
		System.out.println("Welcome to Class 6: Question 15 - 30 Exercises!");
		System.out.println("______________________________________________\n");
		System.out.println("0. Exit");
		System.out.println("15. Square of 1st 30 Natural no.");
		System.out.println("16. Sum of next 100");
		System.out.println("17. Convert CAD$ to USD$");
		System.out.println("18. Largest/Smallest");
		System.out.println("19. Declaration and Assignment");
		System.out.println("20. Positive/Negative");
		System.out.println("21. Enrollment");
		System.out.println("22. Salary Calculation");
		System.out.println("23. Multiplication table");
		System.out.println("24. Calculator");
		System.out.println("25. Salary Increase"); 
		System.out.println("26. Worker's Salary");
		System.out.println("27. Algorithm call");
		System.out.println("28. Algorithm 'Add'");
		System.out.println("29. Same param name Algorithm");
		System.out.println("30. Numberical password");

		System.out.println("\nEnter number of option to be displayed to screen:");
	}

	public static void Question15()
	{
		for (int i = 1; i <= 30; i++)
		{
			System.out.println(i + " squared is " + i*i);
		}
	}

	public static void Question16(int usrNum)
	{
		int totalSum = 0;

		// starting the sum at the number entered from the keyboard
		for (int i = usrNum; i <= (usrNum + 100); i++)
		{
			totalSum += i;
		}

		System.out.println("Total sum of numbers from " + usrNum + " to " + (usrNum + 100) + " is " + totalSum);
	}

	// here I am expecting CAD amount and Rate as arguments
	public static void Question17(double cadDollars, double rate)
	{
		double usdDollars = cadDollars * rate;

		// This is one way to format the amount of decimal places for a float
		System.out.println("CAD \t- " + String.format("%.2f", cadDollars));
		System.out.println("Rate \t- " + String.format("%.3f", rate));
		System.out.println("USD \t- " + String.format("%.2f", usdDollars));
	}

	public static void Question18(int numOne, int numTwo)
	{
		if (numOne > numTwo) {
			System.out.println(numOne + " is larger than " + numTwo);
		}
		else if (numOne == numTwo) {
			System.out.println(numOne + " is equal to " + numTwo);
		}
		else {
			System.out.println(numOne + " is smaller than " + numTwo);
		}
	}

	public static void Question19(int varN, double varA, char varC)
	{
		System.out.println("Variable values:\n\t" + varN + "\n\t" + varA + "\n\t" + varN);
		System.out.println("Sum [N + A]: " + (varN + varA));
		System.out.println("Diff [A - N]: " + String.format("%.2f", (varA - varN)));
	}

	public static void Question20()
	{
		System.out.print("Please enter a positive or negative integer: "); 
		int b = sc.nextInt();

		if (b >= 0) {
			System.out.println("The integer " + b + " is positive!");
		}
		else {
			System.out.println("The integer " + b + " is negative!");
		}
	}

	public static void Question21()
	{
		
	}
}