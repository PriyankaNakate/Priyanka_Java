import java.util.*;
class UpperCaseImple
{
	static String str;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		String returnStr = userToUpperCase();
		System.out.println(str+" : "+returnStr);
	}

	public static String userToUpperCase()
	{
		String newStr = "";
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch>='a' && ch<='z')
			{
				newStr = newStr + (char)(ch-32);
			}
			else{
				newStr = newStr+ch;
			}
		}
		return newStr;
	}
}