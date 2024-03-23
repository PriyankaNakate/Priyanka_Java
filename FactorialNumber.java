import java.util.Scanner;
class FactorialNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int fact =1;
		int dup = num;
		while(num>1)
		{
			fact = fact*num;
			num--;
		}
		System.out.println("Factorial of "+dup+" is : "+fact);
	}
}