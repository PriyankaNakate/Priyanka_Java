import java.util.*;
class EqualsIgnoreCaseImple
{
	static String str1;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a first string : ");
		str1 = sc.next().toLowerCase();
		System.out.print("Enter a second string : ");
		String str2 = sc.next().toLowerCase();

		boolean flag = userEqualsIgnoreCase(str2);
		System.out.print(flag);
	}

	public static boolean userEqualsIgnoreCase(String str2)
	{
		if(str1.equals(str2))
			return true;
		else
			return false;
	}
}