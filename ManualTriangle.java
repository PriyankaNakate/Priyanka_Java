import java.util.Scanner;
class ManualTriangle
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers as a length : ");
		double len1 = sc.nextDouble();
		double len2 = sc.nextDouble();
		double len3 = sc.nextDouble();
		if((len1+len2)>len3 && (len1+len3)>len2 && (len2+len3)>len1)
		{
			System.out.println("It is triangle");
		}
		else
		{
			System.out.println("It is not triangle");
		}
	}
}