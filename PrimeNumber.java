import java.util.Scanner;
class PrimeNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int length=0;
		int count = 0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				count++;
				break;
			}
		}
		if(count==0)
		{
			System.out.println(num+" is prime");
		}
		else{
			System.out.println(num+" is not prime");
		}
	}
}