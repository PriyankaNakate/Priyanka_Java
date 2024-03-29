import java.util.Scanner;
class KeithNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int dup = num;
		int len = 0;
		int rev = 0;
		int sum = 0;
		while(num!=0)
		{
			len++;
			int rem = num%10;
			rev = rev*10+rem;
			num/=10;
		}
		// System.out.println(len);
		// System.out.println(rev);
		while(rev>0)
		{
			int rem = rev%10;
			System.out.print(rem+" ");
			sum+=rem;
			rev/=10;
		}
		System.out.print(sum+" ");
	}
}