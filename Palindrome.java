import java.util.Scanner;
class Palindrome
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int dup = num;
		int rev = 0;
		while(num>0)
		{
			int rem = num%10;
			rev = rev*10+rem;
			num/=10;
		}
		System.out.println("Reverse Number is : "+rev);
		System.out.println((dup==rev)?dup+" is Palindrome number":dup+" is not a Palindrome number");
	}
}