import java.util.Scanner;
class CharacterUpperOrNot
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a character : ");
		char ch = sc.next().charAt(0);
		System.out.println(!((ch>=65 && ch<=90)||(ch>=97 && ch<=122))?ch+" it is not alphabet":(ch>=65 && ch<=90)?ch+" UPPERCASE ALPHABET":ch+" lowecase alphabet");
	}
}