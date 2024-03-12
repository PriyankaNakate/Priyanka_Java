import java.util.Scanner;
class  CalculateTips
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a subtotal : ");
		double st = sc.nextDouble();
		System.out.print("enter tiprate : ");
		double tr = sc.nextDouble();
		double tip=st*tr/100;
		double  total = tip+st;
		System.out.println("The tip is "+tip+" and total is "+total);
	}
}

