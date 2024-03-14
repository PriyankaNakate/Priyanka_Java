import java.util.Scanner;
class DonateBlood
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age : ");
		int age = sc.nextInt();
		if(age>20){
			System.out.print("Have you consume alcohol or cigarette within 24 hours (yes/no) : ");
			String consume = sc.next().toLowerCase();
			if(consume.equals("no")){
				System.out.print("Enter your weight : ");
				double weight = sc.nextDouble();
				if(weight>50){
					System.out.println("Yes you can donate blood");
				}
				else{
					System.out.println("You cannot donate blood because ur weight is less increase your weight");
				}
			}
			else{
				System.out.println("You cannot donate blood because you consume alcohol or cigarette");
			}
		}
		else{
			System.out.println("You cannot donate blood try after "+(21-age)+" years");
		}
	}
}