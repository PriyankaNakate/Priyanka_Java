import java.util.Scanner;
class TempEnergy
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the amount of water in kg : ");
		double water = sc.nextDouble();
		System.out.print("Enter initial temp : ");
		double intTemp = sc.nextDouble();
		System.out.print("Enter final temp: ");
		double finalTemp = sc.nextDouble();
		double energy = water*(finalTemp-intTemp)*4184;   //using formula : energy(Q) = waterWeight(M)*(finalTemperature-initialTemperature)*4184
		System.out.println("The energy needed is : "+energy);
	}
}