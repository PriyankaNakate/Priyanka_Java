import java.util.Scanner;
class BodyMassIndex
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter weight in ponds : ");
		double weight = sc.nextDouble();
		System.out.print("Enter height in inches : ");
		double height = sc.nextDouble();
		System.out.println("BMI is : "+weight/(height*height)*703);
	}
}