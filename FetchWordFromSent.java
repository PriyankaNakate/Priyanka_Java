import java.util.*;
class FetchWordFromSent
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String sent = sc.nextLine();

		String word = "";
		for(int i=0;i<sent.length();i++)
		{
			char ch = sent.charAt(i);
			if(ch==' '){
				System.out.println(i);
				break;
			}
			word += ch;
		}
		System.out.println(word);
	}
}