import java.util.Scanner;
class ExamMissingNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		String str = num+"";
		int  digit = num/10;
		while(num>0)
		{
			int rem = num%10;
			for(int i=digit;i<=rem;i++)
			{
				for(int j=0;j<str.length();j++)
				{
					if(i!=str.charAt(j))
					{
						System.out.println(i);
					}
				}
			}
		}
	}
}