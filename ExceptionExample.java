import java.util.Scanner;
class ExceptionExample
{
	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		try{
			System.out.println(num/0);
		}

		catch(Exception ae){
			ae.printStackTrace();
		}

		System.out.println("main method ended");
	}
}