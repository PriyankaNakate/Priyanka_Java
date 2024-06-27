import java.util.*;
class StringToArray
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a name : ");
		String name = sc.next();
		char[] arrr=stringToCharArray(name);
		System.out.println(Arrays.toString(arrr));
		// stringToCharArray(name);

		System.out.println("Using built in methods : ");
		char [] arr1 = name.toCharArray();
		System.out.println(Arrays.toString(arr1));
	}

	public static char[] stringToCharArray(String str)
	{
		char [] arr = new char[str.length()];
		for(int i=0;i<str.length();i++)
		{
				arr[i]=str.charAt(i);
		}
		return arr;
		// System.out.println(Arrays.toString(arr));
	}
}