import java.util.Scanner;
class FutureInvestment
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter investment amount : ");
		double investment = sc.nextDouble();
		System.out.print("Enter annual interest rate in percentage : ");
		double interestRate = sc.nextDouble();
		System.out.print("Enter number of years : ");
		double years = sc.nextDouble();
		System.out.println("Accumulated value (future investment) is : "+(investment+((investment/100)*interestRate)*years));
	}
}