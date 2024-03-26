import java.util.Scanner;
class Automorphic
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int dup = num;
		int square = num*num;
		int div = 1;
		while(num!=0)
		{
			div*=10;
			num/=10;
		}
		int ld = square%div;
		System.out.println(dup==ld?dup+" automorphic number":dup+" not Automorphic Number");
		
	}
}