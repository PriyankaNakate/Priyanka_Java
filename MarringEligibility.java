import java.util.Scanner;
class MarringEligibility
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter age : ");
		int age = sc.nextInt();
		System.out.print("Enter Property : ");
		double prop = sc.nextDouble();
		// long money = 10000000L;
		// String surname = "Ambani";
		System.out.print("Enter surname : ");
		String surname = sc.next().toUpperCase();
		if((age>=21 && prop==10000000) || surname.equals("AMBANI"))
		{
			System.out.println("Eligible for marring");
		}
		else{
			System.out.println("not eligible for marring");
		}
	}
}