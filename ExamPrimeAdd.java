import java.util.Scanner;
class ExamPrimeAdd
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int sum = 0;
		while(num>0)
		{
			int rem = num%10;
			boolean flag = isPrime(rem);
			if(flag==true)
			{
				sum = sum + rem;
			}
			num/=10;
		}
		System.out.println(sum);
	}

	public static boolean isPrime(int digit)
	{
		boolean flag = true;
		if(digit==1)
		{
			flag = false;
		}
		else{
			for(int i=2;i<digit;i++)
			{
				if(digit%i==0)
				{
					flag = false;
					break;
				}
			}
		}
		return flag;
	}
}