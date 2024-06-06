import java.util.Scanner;
class Demo
{
	int num;
}

class Test
{
	static Demo d;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try{
			System.out.print("enter a number : ");
			Demo d = new Demo();
			d.num = sc.nextInt();
			// System.out.println(d.num/0);
			Test.d.num = 67;
			System.out.println(Test.d.num);
		}
		catch(ArithmeticException ae){
			ae.printStackTrace();
		}
		catch(NullPointerException e){
			e.printStackTrace();
		}
	}
}