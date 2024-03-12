//write a program that display the area and perimeter of the circle that has radius of 5.5 

class Circle
{
	public static void main(String[] args)
	{
		final double pi = 3.14;
		double radius = 5.5;
		double area = pi*radius*radius;
		double perimeter = 2*pi*radius;
		System.out.println("Area of circle is : "+area);
		System.out.println("Perimeter of circle is : "+perimeter);
	}
}