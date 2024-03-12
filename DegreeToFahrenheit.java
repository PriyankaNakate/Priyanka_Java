import java.util.*;
class DegreeToFahrenheit
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a degree in celsius : ");
		double degreeCelsius = sc.nextDouble();
		double fahrenheit = (degreeCelsius*9/5)+32;
		System.out.println(degreeCelsius+" celsius is "+fahrenheit+" Fahrenheit");
	}
}