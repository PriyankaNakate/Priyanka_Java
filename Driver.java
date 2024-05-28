import java.util.Scanner;
class Driver
{
	public static void main(String[] args) {
		boolean flag = true;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String str = sc.nextLine().toLowerCase();
		for(int i=0;i<=str.length()-1;i++)
		{
			char ch = str.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			{
				count++;
			}
		}
		System.out.println(count);
	}
}