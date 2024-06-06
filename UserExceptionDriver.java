import java.util.Scanner;
class UserArithmeticException extends RuntimeException
{
	UserArithmeticException(String desc)
	{
		super(desc);
	}
}
class UserExceptionDriver
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two numbers : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		if(num2==0)
		{
			try{
				throw new UserArithmeticException("divide number by zero");
			}
			catch(UserArithmeticException ue){
				System.out.println(ue.getMessage());
			}
		}
		else{
			System.out.println(num1/num2);
		}
	}
}