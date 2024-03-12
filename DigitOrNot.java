import java.util.Scanner;
class DigitOrNot
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a digit : ");
		int digit  = sc.nextInt();
		System.out.println((digit>=0 && digit<=9)?digit+" it is digit": digit+" it is not digit");
	}
}