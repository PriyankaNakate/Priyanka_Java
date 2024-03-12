import java.util.Scanner;
class FeetToMeter
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value for feet : ");
		double feet = sc.nextDouble();
		System.out.println(feet+" feet is "+feet*0.305+" meters");
	}
}