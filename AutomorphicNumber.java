import java.util.Scanner;
class AutomorphicNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int dup = num;
		int square = num*num;
		System.out.println("square : "+square);
		int rev = 0;
		int rev1 = 0;
		for(int i=1;i<=2;i++)
		{
			int rem = square%10;
			rev = rev*10+rem;
			square/=10;
		}
		System.out.println("Reverse : "+rev);
		while(rev>0)
		{
			int rem = rev%10;
			// System.out.print(rem+" ");
			rev1 = rev1*10+rem;
			rev/=10;
		}
		System.out.println("reverse : "+rev1);
		System.out.println((rev1==dup)?dup+" is Automorphic Number":dup+" is not Automorphic Number");
	}
}