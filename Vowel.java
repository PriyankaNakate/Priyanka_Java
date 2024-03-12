import java.util.Scanner;
class Vowel
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String name = sc.next().toLowerCase();
		char ch = name.charAt(0);
		System.out.println("Hi my name is "+name+" and first letter is "+ch);
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ){
			System.out.println("character is "+ch+" vowel");
		}
		else{
			System.out.println("Character is "+ch+" consonents");
		}
	}
}