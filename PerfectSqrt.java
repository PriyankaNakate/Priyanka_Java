import java.util.Scanner;
class PerfectSqrt
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		boolean flag = false;
		int sqrt = 0;
		for(int i = 1;i<=num;i++)
		{
			if(i*i==num)
			{
				flag = true;
				sqrt = i;
				break;
			}
		}
		if(flag)
			System.out.println(sqrt+" is a perfect square root of "+num);
		else
			System.out.println(sqrt+" is not a perfect square");

		// int count = 0;
		// for(int i=1;num>0;i+=2)
		// {
		// 	res=num-i;
		// 	count++;
		// 	num=res;
		// }
	}
}