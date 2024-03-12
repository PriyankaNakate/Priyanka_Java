import java.util.Scanner;
class AreaOfHexagon
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the side : ");
		double side = sc.nextDouble();
		double areaOfHexagon = (3*(2^1/2)*(side*side))/2;
		System.out.println("Area of the hexagon is : "+areaOfHexagon);
	}
}