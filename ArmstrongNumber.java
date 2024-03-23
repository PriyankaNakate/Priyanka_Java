import java.util.Scanner;
class ArmstrongNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int dup = num;
		int dup1 = num;
		int length = 0;
		int sum =0;
		while(num!=0)
		{
			length++;
			num/=10;
		}
		// System.out.println(length);
		while(dup>0)
		{
			int rem = dup%10;
			int power =1;
			for(int i=1;i<=length;i++)
			{
				power = power*rem;
			}
			dup/=10;
			sum+=power;
		}
		// System.out.println("sum of digit : "+sum);
		if(sum==dup1)
		{
			System.out.println(dup1+" is Armstrong Number");
		}
		else
		{
			System.out.println(dup1+" is not Armstrong Number");
		}
	}
}