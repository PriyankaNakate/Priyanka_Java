import java.util.Scanner;
class Swapping
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two numbers : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("numbers before Swapping : ");
		System.out.print("num1 : "+num1+" num2 : "+num2);
		num3 = num1;
		num1 = num2;
		num2 = num3;
	}
}