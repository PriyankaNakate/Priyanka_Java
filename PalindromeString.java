import java.util.Scanner;
class PalindromeString
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a name : ");
		String name = sc.next();
		String revName = "";
		for(int i=name.length()-1;i>=0;i--)
		{
			revName += name.charAt(i);
		}
		System.out.println((revName.equals(name))?name+" is Palindrome string":name+" is not Palindrome string");
	}
}