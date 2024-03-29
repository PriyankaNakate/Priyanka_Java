import java.util.Scanner;
class Fascinating
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int mul2 = num*2;
		int mul3 = num*3;
		String concat = ""+num+mul2+mul3;
		System.out.println(concat);
		if(concat.length()==9)
		{
			

		}
		else{
			System.out.println("not Fascinating Number");
		}
	}
}