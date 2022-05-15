package areaofcircle ;
import java.io.*;
class AOC {

	public static final double PI = Math.PI;

	// Overloaded Area() function to
	// calculate the area of the circle.
	// It takes one double parameter
	void Area(double r)
	{
		double A = PI * r * r;

		System.out.println("Area of the circle is :" + A);
	}
	void Area(float r)
	{
		double A = PI * r * r;

		System.out.println("Area of the circle is :" + A);
	}
}

 public class circle  {

	// Driver code
	public static void main(String[] args)
	{
		AOC obj = new AOC();
		obj.Area(5);
		obj.Area(2.5);
	}
}

