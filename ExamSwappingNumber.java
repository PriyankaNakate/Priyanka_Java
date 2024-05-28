import java.util.Scanner;
class ExamSwappingNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int dup = num;
		System.out.print("Enter a number for swapping : ");
		int swap = sc.nextInt();
		int len = 0;
		while(num>0)
		{
			len++;
			num/=10;
		}
		int rev = 0;
		for(int i =1;i<=len-swap;i++)
		{
			int rem = dup%10;
			rev = rev*10 + rem;
			dup/=10;
		}
		int div =1;
		for(int i=1;i<=swap;i++)
		{
			div = div*10;
		}
		int sepNum = num/div;
		System.out.println(" "+sepNum+rev);
	}
}