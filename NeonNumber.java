import java.util.Scanner;
class NeonNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int square = num*num;
		int sum =0;
		while(square!=0)
		{
			int rem = square%10;
			sum+=rem;
			square/=10;
		}
		System.out.println(num==sum?num+" is neon number":num+" is not neon number");
	}
}