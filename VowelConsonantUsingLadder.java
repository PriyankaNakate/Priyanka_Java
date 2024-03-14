import java.util.Scanner;
class VowelConsonantUsingLadder
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a character : ");
		char ch = sc.next().charAt(0);
		if(ch=='A' || ch=='a'){
			System.out.println(ch+" is vowel");
		}else if(ch=='e' || ch=='E'){
			System.out.println(ch+" is vowel");
		}else if(ch=='i' || ch=='I'){
			System.out.println(ch+" is vowel");
		}else if(ch=='o' || ch=='O'){
			System.out.println(ch+" is vowel");
		}else if(ch=='u' || ch=='U'){
			System.out.println(ch+" is vowel");
		}
		else{
			System.out.println(ch+" is consonant");
		}
	}
}