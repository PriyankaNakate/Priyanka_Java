//whether a charchter is alphabet or not
import java.util.Scanner;
class CharacterOrNot
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a character : ");
		// int char = sc.nextInt();
		char ch = sc.next().charAt(0);
		System.out.println(((ch>='A' && ch<='Z')||(ch>='a' && ch<='z'))?ch+" is alphabet":ch+" is not albhabet");
	}
}