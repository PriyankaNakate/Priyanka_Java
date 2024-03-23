import java.util.Scanner;
class FactorsOfNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("Factors of "+num+" is : ");
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				System.out.print(i+" ");
			}
		}
	}
}