import java.util.Scanner;
class SumOfDigits
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number between 0 and 1000 : ");
		int digit = sc.nextInt();
		int sum = 0;
		int rem;
		if(digit>0 && digit<1000){
			for (;digit>0;) {
				rem=digit%10;
				sum = sum + rem;
				digit = digit/10;
			}
			System.out.println("The sum of the digit is : "+sum);
		}else{
			System.out.print("Enter number between 0 and 1000");
		}
	}
}