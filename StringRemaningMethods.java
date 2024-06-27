import java.util.*;
class StringRemaningMethods
{
	public static void main(String[] args) {
		String str  = "I@love@mangoes";
		String str1 = "Priya";
		String str2 = new String("Priya");
		StringBuffer str3 = new StringBuffer("Priya");
		String str4 = new String("Priya");

		// System.out.println(Arrays.toString(str.split("@")));
		// System.out.println(Arrays.deepToString(str.split("@")));

		// String strArr[] = str.split("@");
		// System.out.println(Arrays.toString(strArr));

		//System.out.println(str.indexOf());
		System.out.println(str1.equals(str2)); //true
		System.out.println(str1.equals(str3)); //false
		System.out.println(str2.equals(str3)); //false
		System.out.println(str2.equals(str4)); //true
		System.out.println(str1.codePointAt(4));

		String name = new String("Pankaj");
		//String con = name.concat("Apeksha");
		System.out.println(name.concat("Apeksha"));
		//System.out.println(con);
		System.out.println(name);
		StringBuffer sb = new StringBuffer("Pankaj");

		//System.out.println(sb.concat("Priyanka"));
		System.out.println(sb);

		String s1 = "java";
		String s2 = "java";
		System.out.println("String Literal (==) : "+s1==s2);
		System.out.println("String Literal (.equals) : "+s1.equals(s2));
		String s3 = new String("java");
		String s4 = new String("java");
		System.out.println("String class (==) : "+s3==s4);
		System.out.println("String class (.equals) : "+s3.equals(s4));
		StringBuffer sb1 = new StringBuffer("Priya");
		StringBuffer sb2 = new StringBuffer("Priya");
		//System.out.println("String Buffer (==) : "+sb1==sb2);
		System.out.println("String Buffer (.equals) : "+sb1.equals(sb2));

		String s = new String("java");
		String st = s;
		String st1 = new String("java");
		System.out.println(st==s);
		System.out.println(s2==s3);

		// 1. equals();
		// 2. equalsIngnoreCase();
		// 3. length();
		// 4. isEmpty();
		// 5. charAt();
		// 6. toLowerCase();
		// 7. toUpperCase();
		// 8. concat();
		// 9. subString();
		// 10. replace();
		// 11. spilt();
		// 12. trim();
		// 13. toCharArray();
		// 14. contentEquals() :- compare string literal with string buffer object
		// 15. indexOf();
		// 16. codePointAt();
		// 17. lastIndexOf();

	}
}

