import java.util.Scanner;
class DuckNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int dup = num;
		int count=0;
		while(num>0)
		{
			int rem = num%10;
			if(rem==0)
			{
				count++;
				break;
			}
			num/=10;
		}
		System.out.println((count==0)?dup+" is not Duck Number":dup+" is `Duck Number");
	}
}