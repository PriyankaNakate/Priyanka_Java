import java.util.Scanner;
class DrivingLicences
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age : ");
		int age = sc.nextInt();
		if(age>18){
			System.out.print("Enter your RTO test marks : ");
			double marks = sc.nextDouble();
			if(marks>60){
				System.out.println("You are eligible for Driving Licences");
			}
			else {
				System.out.println("re-appeared for the test again");
			}
		}
		else{
			System.out.println("Not eligible for driving licences try after "+(19-age)+" years");
		}
	}
}