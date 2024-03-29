import java.util.Scanner;
class BuzzNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		if(num%10==7 || num%7==0)
			System.out.println(num+" is buzz number");
		else
			System.out.println(num+" is not buzz number");
	}
}