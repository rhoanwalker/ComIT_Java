/*
	Filename:	Bicycle.java
	Description:	Bicycle object that as a speed attribute and methods to accelerate and get speed
*/

public class Bicycle
{
	private int _speed;

	// CONSTRUCTOR

	public Bicycle(int speed)
	{
		_speed = speed;
	}

	// METHODS | FUNCTIONS

	// Accelerate speed
	public void Accelerate(int additonalSpeed)
	{
		_speed += additonalSpeed;
	}

	// return the speed of the bicycle
	public int getSpeed()
	{
		return _speed;
	}
}