import java.util.Scanner;
class StringCharacterCount
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter one string : ");
		String str = sc.next();
		System.out.print("Enter one character for searching : ");
		char ch = sc.next().charAt(0);
		int count = 0;
		for(int i=0;i<str.length();i++)
		{
			if(ch==str.charAt(i))
			{
				count++;
			}
		}
		if(count==0)
		{
			System.out.println("entered chracter is not present in string");
		}
		else{
			System.out.println("Count of entered character in string : "+count);
		}
	}
}