import java.util.Scanner;
class Largest
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num1 : ");
		int num1 = sc.nextInt();
		System.out.print("Enter num2 : ");
		int num2 = sc.nextInt();
		System.out.println((num1>num2)?num1+" is greater number between two numbers" : num2+" is greater number between two numbers");
	}
}