import java.util.Scanner;
class Sunny
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int newNum = num+1;
		int count = 0;
		for(int i=1;i<=newNum/2;i++)
		{
			if(i*i==newNum)
			{
				count++;
				break;
			}
		}
		System.out.println(count==1?num+" is Sunny Number":num+" is not Sunny Number");
	}
}