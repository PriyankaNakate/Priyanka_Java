import java.util.*;
class StartsWithImple
{
	static String str;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		str = sc.nextLine();
		System.out.print("Enter String for matches : ");
		String str1 = sc.next();
		System.out.print("Enter index : ");
		int searchIndex = sc.nextInt();
		boolean op = userStratsWith(str1,searchIndex);
		System.out.println(str+" : "+op);
	}

	public static boolean userStartsWith(String str1,int searchIndex)
	{
		if(searchIndex<0 && searchIndex>str.length()-1)
		{
			throw new StringIndexOutOfBoundsException("Wrong index");
		}
		boolean flag = true;
		for(int i=searchIndex;i<str1.length();i++)
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