/*
	Filename:	C13_InClassExer.java
	Description:	Main class to test Class 13 inclass exercise. (Slide 37 - Class 15 lecture slides)
*/

public class C13_InClassExer
{
	public static void main (String[] args)
	{
		Bicycle[] bicycles = new Bicycle[10];

		// build each instance of the bicycle and initialize it speed to the value of i in the for loop
		for (int i = 0; i < bicycles.length; i++)
		{
			bicycles[i] = new Bicycle(i);
		}

		// look through array of bicycle and accelerate its speed by 10 for each odd element
		for (int i = 0; i < bicycles.length; i++)
		{
			// check if the element (index + 1) is odd
			if (((i+1) % 2) != 0)
			{
				bicycles[i].Accelerate(10); // call method in Biclycle class to accererate speed
			}

			// Simple output to visualize outcome
			System.out.println("element = " + (i+1) + ". speed = " + bicycles[i].getSpeed());
		}

		/* NOTE: one loop could be used to achieve this... */
	}
}