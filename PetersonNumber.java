import java.util.Scanner;
//A number is said to be a Peterson number if the sum of factorials of each digit of the number is equal to the number itself.
class PetersonNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int dup = num;
		int sum = 0;
		while(num>0)
		{
			int rem = num%10;
			int fact = 1;
			for(int i=rem;i>1;i--)
			{
				fact = fact*i;
			}
			sum = sum+fact;
			num/=10;
		}
		System.out.println((sum==dup)?dup+" is peterson number":dup+" is not peterson number");
	}
}