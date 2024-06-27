import java.util.Scanner;
class ConcatImple
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a first string : ");
		String str1 = sc.next();
		System.out.print("Enter a second string : ");
		String str2 = sc.next();
		System.out.println("First String : "+str1);
		System.out.println("Second String : "+str2);
		System.out.println("Concat String : "+str1+str2);
	}
}