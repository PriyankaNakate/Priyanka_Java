import java.util.Scanner;
class PowerOfNumWithLength
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int dup = num;
		int length = 0;
		int power = 1;
		while(num>0)
		{
			length++;
			num/=10;
		}
		System.out.println("length of "+dup+" is : "+length);
		for (int i=1;i<=length;i++) {
			power*=dup;
		}
		System.out.println("Power : "+power);
	}
}