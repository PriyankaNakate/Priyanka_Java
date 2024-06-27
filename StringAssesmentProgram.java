import java.util.*;
class StringAssesmentProgram
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str = sc.next();
		int len = str.length();
		String fh = ((new StringBuffer(str.substring(0,(len/2)))).reverse()).toString();
		String sh = ((new StringBuffer(str.substring((len/2),len))).reverse()).toString();
		System.out.println(fh+" "+sh);
		String op = "";
		for(int i=0;i<sh.length();i++)
		{
			if(i.)
		}
	}
}