import java.util.Scanner;
class EmployeePay
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter employee salary : ");
		double salary = sc.nextDouble();
		System.out.print("Enter employee monthly target score : ");
		int score = sc.nextInt();
		// double increaseSalary;
		if(score>90)
		{
			System.out.println("Increases the pay of employee is : "+(salary+((salary*3)/100)));
		} 
		else{
			System.out.println("Increases the pay of employee is : "+(salary+((salary*1)/100)));
		}
	}
}