import java.util.Scanner;
class FactorRecursion
{
	static int num;
	static int i=2;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		num = sc.nextInt();
		factor();
	}
	public static void factor()
	{
		if(i==num)
			return;
		if(num%i==0)
		{
			System.out.print(i+" ");
		}
		i++;
		factor();
	}
}