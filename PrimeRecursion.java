import java.util.Scanner;
class PrimeRecursion
{
	static int num;
	static int i=2;
	static boolean flag = true;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		num = sc.nextInt();
		primeNumber();
		System.out.println(flag?"prime":"not prime");
	}
	public static void primeNumber(){
		if(i==num)
			return;
		if(num%i==0)
		{
			flag = false;
			return;
		}
		i++;
		primeNumber();
	}
}