import java.util.Scanner;
class VowelOrConsonant
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a character : ");
		char ch = sc.next().charAt(0);
		System.out.println(!((ch>=65 && ch<=90)||(ch>=97 && ch<=122))?ch+" it is not alphabet":(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'||ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')?"Entered alphabet "+ch+" is VOWEL":"entered alphabet "+ch+" is CONSONANT");
	}
}