import java.util.Scanner;
class LeapYear
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a year : ");
		int year = sc.nextInt();
		System.out.println((year%4==0)?year+" is leap year":year+" is not leap year");
	}
}