import java.util.Scanner;
class PondsToKg 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number in ponds ; ");
		double ponds = sc.nextDouble();
		System.out.println(ponds+" pounds is "+ponds*0.454+" kg");
	}
}