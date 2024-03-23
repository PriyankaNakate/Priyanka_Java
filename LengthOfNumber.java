import java.util.Scanner;
class LengthOfNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int length = 0;
		for(int i=num;i>0;i/=10)
		{
			length++;
		}
		System.out.println("length of "+num+" is : "+length);
	}
}