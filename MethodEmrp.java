import java.util.Scanner;
class MethodEmrp
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		boolean flag = isPrime(num);
		boolean flag1 = true;
		if(flag==flag1)
		{
			int rev=reverse(num);
			boolean flag2=isPrime(rev);
			if(flag2==flag)
				System.out.println("emrp number");
			else
				System.out.println("not emrp number");
		}
		else
		{
			System.out.println("not emrp number");
		}
	}
	public static boolean isPrime(int num){
		boolean flag = true;
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				flag=false;
				break;
			}
		}
		if(flag)
			return flag;
		else
			return flag;
	}
	public static int reverse(int num){
		int rev = 0;
		while(num!=0)
		{
			int rem = num%10;
			rev = rev*10+rem;
			num/=10;
		}
		return rev;
	}
}