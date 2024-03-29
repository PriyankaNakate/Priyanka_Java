import java.util.Scanner;
class PasswordChecking
{
	public static void main(String[] args) throws InterruptedException{
		Scanner sc = new Scanner(System.in);
		int attempt = 1;
		for(; ;)
		{
			int storedPin = 8668;
			int count = 3;
			do{
				System.out.print("Enter your pin : ");
				int userPin = sc.nextInt();
				if(userPin==storedPin)
				{
					System.out.println("Login Suceesfully");
					break;
				}
				else
				{
					System.out.println("you entered wrong pin you have only "+ (count-1) +" chance left");
				}
				if(count==1)
				{
					Thread.sleep(10000);
					System.out.println("You try to enter your pin again");
				}
				count--;
			}while(count>=1);

			if(attempt++ ==2)
			{
				break;
			}
		}
	}
}
