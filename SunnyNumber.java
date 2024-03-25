import java.util.Scanner;
//A number is called a sunny number if the number next to the given number is a perfect square.
class SunnyNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int perSquare = num+1;
		int dup = perSquare;
		int res=0;
		int count=0;
		for(int i=1;perSquare>0;i+=2)
		{
			res=perSquare-i;
			count++;
			perSquare=res;
			// System.out.print(res+" ");
		}
		// System.out.println(count);
		if((count*count)==dup)
			System.out.println(num+" is sunny number");
		else
			System.out.println(num+" is not sunny number");
	}
}