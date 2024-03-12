import java.util.Scanner;
class CostOfDriving
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the driving distance : ");
		double distance = sc.nextDouble();
		System.out.print("Enter miles per gallon : ");
		double miles = sc.nextDouble();
		System.out.print("Enter price per gallon : ");
		double price = sc.nextDouble();
		System.out.println("The cost of driving is : "+distance/miles*price);
	}
}