import java.util.Scanner;
class Acceleration
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter starting velocity : ");
		double v1 = sc.nextDouble();
		System.out.print("Enter ending velocity : ");
		double v2 = sc.nextDouble();
		System.out.print("Enter time in seconds : ");
		double sec = sc.nextDouble();
		System.out.println("The average Acceleration is "+(v2-v1)/sec);
	}
}