import java.util.*;
class TrimImple
{
	static String str;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		str = sc.nextLine();

		String str1 = userTrim();
		System.out.println(str+" : "+str.length());
		System.out.println(str1+" : "+str1.length());
	}

	public static String userTrim()
	{
		// //int cnt = 0;
		// String word = "";
		// for(int i=0;i<str.length();i++)
		// {
		// 	char ch = str.charAt(i);
		// 	if(ch!=' ')
		// 	{
		// 		word+=ch;
		// 		//cnt++;
		// 	}
		// }
		//return word;

		String op = "";
		int index = 0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			{
				index = i;
				break;
			}
		}
		op = str.substring(index);
		for(int i=str.length()-1;i>=0;i--)
		{
			if(str.charAt(i)!=' ')
			{
				index = i;
				break;
			}
		}
		op = op.substring(0,index-1);
		return op;
	}
}