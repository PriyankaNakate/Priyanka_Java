import java.util.*;
class StringCharAtMethod
{
	static String str = "Priyanka";
	public static void main(String[] args) {
		for(int i=0;i<str.length();i++)
		{
			// System.out.print(userCharAt(i)+" ");
			char ch =userCharAt(i);
			System.out.println(ch);
		}
	}

	public static char userCharAt(int index)
	{
		if(index<0 || index>=str.length()){
			throw new StringIndexOutOfBoundsException("Wrong index");
		}
		char [] arr= new char[str.length()];
		for(int i=0;i<str.length();i++)
		{
			arr[i]=str.charAt(i);
		} 
		return arr[index];
	}
}