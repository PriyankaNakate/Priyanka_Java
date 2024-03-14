import java.util.Scanner;
class Percentage
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Percentage : ");
		float percentage = sc.nextFloat();
		if(percentage>=90)
		{
			System.out.println("First class with distinction");
		}
		else if(percentage>=75)
		{
			System.out.println("Distinction");
		}
		else if(percentage>=60)
		{
			System.out.println("First class");
		}
		else if(percentage>=35)
		{
			System.out.println("Second class");
		}
		else{
			System.out.println("Fail");
		}
	}
}