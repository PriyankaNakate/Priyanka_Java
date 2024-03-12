import java.util.Scanner;
class CompoundValue
{                       
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the amount : ");
		double amount = sc.nextDouble();
		System.out.print("Enter the annual interest rate : ");
		double interestRate = sc.nextDouble();
		System.out.print("Enter the month : ");
		int month = sc.nextInt();
		// double interestRate = 5;
		// int month = 6;
		double monthlyInterestRate = (interestRate/100)/12;
		// double firstMonthAmount = amount*(1+monthlyInterestRate);
		// System.out.println(monthlyInterestRate);
		// System.out.println(firstMonthAmount);
		// double secondMonthAmount = (amount+firstMonthAmount)*(1+monthlyInterestRate);
		// System.out.println(secondMonthAmount);
		// double thirdMonthAmount = (amount+secondMonthAmount)*(1+monthlyInterestRate);
		// System.out.println(thirdMonthAmount);
		// double fourthMonthAmount = (amount+thirdMonthAmount)*(1+monthlyInterestRate);
		// System.out.println(fourthMonthAmount);
		// double fifthMonthAmount = (amount+fourthMonthAmount)*(1+monthlyInterestRate);
		// System.out.println(fifthMonthAmount);
		// double sixMonthAmount = (amount+fifthMonthAmount)*(1+monthlyInterestRate);
		// System.out.println(sixMonthAmount);
		double returnAmount = 0;
		int i;
		for(i=1;i<=month;i++)
		{
			returnAmount = (amount+returnAmount)*(1+monthlyInterestRate);
		}
		System.out.println("After six month return amount is : "+returnAmount);
	}
}