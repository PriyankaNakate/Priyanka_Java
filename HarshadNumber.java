import java.util.Scanner;
class HarshadNumber  
//also known as niven number if the number is divisible by sum of digits of that number is harshad number. 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc. nextInt();
		int dup = num;
		int sum = 0;
		while(num>0)
		{
			int rem = num%10;
			sum = sum+rem;
			num/=10;
		}
		// System.out.println("Sum of digits : "+sum);
		System.out.println((dup%sum==0)?dup+" is Harshad number":dup+" is not harshad number");
	}
}