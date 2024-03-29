import java.util.Scanner;
class SpyNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int dup = num;
		int sum = 0;
		int product = 1;
		while(num!=0)
		{
			int rem = num%10;
			sum+=rem;
			product*=rem;
			num/=10;
		}
		System.out.println(sum==product?dup+" is spy number":dup+" is not spy number");
	}
}