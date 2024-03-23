import java.util.Scanner;
class PrimeBetween
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a range of numbers : ");
		int range1 = sc.nextInt();
		int range2 = sc.nextInt();
		for(int i=range1;i<=range2;i++)
		{
			int count=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					count++;
					break;
				}
			}
		if(count==0)
		{
			System.out.print(i+" ");
		}
		}
	}
}