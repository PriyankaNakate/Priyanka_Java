import java.util.Scanner;
class InterviewEligibility
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the percentage : ");
		float percentage = sc.nextFloat();
		if(percentage>60)
		{
			System.out.println("Eligible for interview");
		}
		else{
			System.out.println("Not eligible for interview");
		}
	}
}