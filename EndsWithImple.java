import java.util.*;
class EndsWithImple
{
	static String str;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		str = sc.nextLine();
		System.out.print("Enter String for matches : ");
		String str1 = sc.next();
		System.out.print("Enter index : ");
		int endIndex = sc.nextInt();
		boolean op = userEndsWith(str1,endIndex);
		System.out.println(str+" : "+op);
	}

	public static boolean userEndsWith(String str1,int endIndex)
	{
		if(endIndex<0 && endIndex>str.length()-1)
		{
			throw new StringIndexOutOfBoundsException("Wrong index");
		}
		boolean flag = true;
		for(int i=endIndex;i<str1.length();i++)
		{
			char ch = str1.charAt(i);
			if(ch!=str.charAt(i))
			{
				flag = false;
				break;
			}
		}
		return flag;
	}
}