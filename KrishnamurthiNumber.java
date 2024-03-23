import java.util.Scanner;
class KrishnamurthiNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int dup = num;
		int sum =0;
		while(num>0)
		{
			int rem = num%10;
			int fact = 1;
			for(int i=rem;i>1;i--)
			{
				fact = fact*i;
			}
			// System.out.println(fact);
			// System.out.print(rem+" ");
			num/=10;
			sum = sum+fact;
		}
		// System.out.println(sum);
		System.out.println((sum==dup)?dup+" is Krishnamurthi Number" : dup+" is not Krishnamurthi Number");
	}
}