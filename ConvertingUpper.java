//w.j.p to convert 1st letter into capital and rest into lower case
import java.util.Scanner;
class ConvertingUpper
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a name : ");
		String str = sc.next();
		// String firstLetter = str.subString(0,1).toUpperCase();
		// String remainingLetters = str.subString(1,str.length());
		// String merge = firstLetter.concat(remainingLetters);
		// System.out.println(merge);

		//w.j.p to get asciii value of all the characters from the string dynamically
		for(int i=0;i<str.length();i++)
		{
			System.out.println(str.charAt(i)+" : "+str.codePointAt(i));
		}

		System.out.println("Another way : ");
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			int asciii = ch;
			System.out.println(ch+" : "+asciii);
		}
	}
}
