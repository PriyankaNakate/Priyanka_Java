import java.util.Scanner;
class VowelSwitch
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a character : ");
		char ch = sc.next().toLowerCase().charAt(0);
		switch(ch)
		{
			case 'a' : 
			case 'e' :
			case 'i' :
			case 'o' : 
			case 'u' :System.out.println(ch+" is vowel");break
			default : System.out.println(ch+" is consonant");
		}
	}
}