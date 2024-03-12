import java.util.Scanner;
class RunWayLength
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter speed : ");
		double speed = sc.nextDouble();
		System.out.print("Enter acceleration : ");
		double acceleration = sc.nextDouble();
		double minLength = (speed*speed)/(2*acceleration);  //using formula : length= speed(v2)/2*acceleration(a)
		System.out.println("The minimum runway length for this airplane is "+minLength);
	}
}