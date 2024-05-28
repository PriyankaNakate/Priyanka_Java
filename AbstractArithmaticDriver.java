import java.util.Scanner;
abstract class AbstractArithmatic
{
	abstract int addition(int num1,int num2);
	abstract int substraction(int num1,int num2);
	abstract int Multiplication(int num1,int num2);
	abstract int division(int num1,int num2);
	abstract int modulus(int num1,int num2);
}

class ArithmaticImplementaion extends AbstractArithmatic
{
	public int addition(int num1,int num2){
		return num1+num2;
	}

	public int substraction(int num1,int num2){
		return num1-num2;
	}

	public int Multiplication(int num1,int num2){
		return num1*num2;
	}

	public int division(int num1,int num2){
		return num1/num2;
	}

	public int modulus(int num1,int num2){
		return num1%num2;
	}
}

class AbstractArithmaticDriver
{
	public static void main(String[] args) {
		ArithmaticImplementaion obj = new ArithmaticImplementaion();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(obj.addition(a,b));
		System.out.println(obj.substraction(a,b));
		System.out.println(obj.multiplication(a,b));
		System.out.println(obj.division(a,b));
		System.out.println(obj.modulus(a,b));
	}
}