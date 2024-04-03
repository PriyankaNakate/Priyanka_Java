import java.util.Scanner;
class Method
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int rev = reverse(num);
		System.out.println("reverse number : "+rev);
		boolean flag = true;
		boolean flag = isPalindrome(num,rev);
		if(flag)
			System.out.println("Palindrome number");
		else
			System.out.println("not Palindrome number");
	}
	public static int reverse(int num){
		int rev = 0;
		while(num!=0)
		{
			int rem = num%10;
			rev = rev*10+rem;
			num/=10;
		}
		return rev;
	}
	public static boolean isPalindrome(int num,int rev){
		boolean flag = true;
		if(num==rev){
			return flag;
		}
			// System.out.println("Palindrome number");
		else{
			flag = 1;
			return flag;
			// System.out.println("Not Palindrome number");
		}
	}
}