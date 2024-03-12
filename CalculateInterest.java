import java.util.Scanner;           
class CalculateInterest
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter balance : ");
		double balance = sc.nextDouble();
		System.out.print("Enter interest rate : ");
		double interestRate = sc.nextDouble();
		// System.out.print("Enter month : ");
		// int month = sc.nextInt();
		// double annualInterestRate = month*interestRate/100;
		// System.out.println(annualInterestRate);
		double totalInterest = balance*(interestRate/1200);
		System.out.println("The total interest is : "+totalInterest);
		// System.out.println("The total amount with interest : "+(balance*interestRate*month)/12);
	}
}