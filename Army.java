import java.util.Scanner;
class Army
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age : ");
		int age = sc.nextInt();
		if (age>18) {
			System.out.print("Enter your height : ");
			double height = sc.nextDouble();
			if(height>=162){
				System.out.print("Enter your weight : ");
				double weight = sc.nextDouble();
				if(weight>56){
					System.out.println("Congrats you are able to join the Army");
				}
				else{
					System.out.println("Increases your weight at least "+(57-weight)+" km");
				}
			}
			else {
				System.out.println("Increases your height at least "+(162-height)+" cm");
			}
		}
		else{
			System.out.println("You are kid try after "+(19-age)+" years");
		}
	}
}