import java.util.Scanner;
class FibonacciSeries 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Fibonacci Series : ");

		// ***** Method 1 : by initializing two numbers *****
		// int a = 0;
		// int b = 1;
		// int c = 0;
		// System.out.print(a+" "+b+" ");
		// for(int i=1;i<=10;i++)
		// {
		// 	c = a+b;
		// 	System.out.print(c+" ");
		// 	a=b;
		// 	b=c;
		// }

		// ***** Method 2 : by taking numbers from user *****
		// System.out.print("Enter number from which u want to print series : ");
		// int num = sc.nextInt();
		// System.out.print(num+" ");
		// int num1 = ++num;
		// num--;
		// System.out.print(num1+" ");
		// for(int i=1;i<=8;i++)
		// {
		// 	int res = num+num1;
		// 	System.out.print(res+" ");
		// 	num=num1;
		// 	num1=res;
		// }

		// ***** Method 3 : upto which number u want to print *****
		System.out.print("Enter number from which u want to print series : ");
		int num = sc.nextInt();
		System.out.print(num+" ");
		int num1 = ++num;
		num--;
		int res = 0;
		System.out.print(num1+" ");
		for(;res<=100;)
		{
			res =num+num1;
			System.out.print(res+" ");
			num=num1;
			num1=res;
		}
	}
}