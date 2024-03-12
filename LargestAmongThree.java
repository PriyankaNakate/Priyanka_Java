import java.util.Scanner;
class LargestAmongThree
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num1 : ");
		int num1 = sc.nextInt();
		System.out.print("Enter num2 : ");
		int num2 = sc.nextInt();
		System.out.print("Enter num3 : ");
		int num3 = sc.nextInt();
		System.out.println((num1>num2 && num1>num3)?num1+" is greater number among three numbers" : (num2>num3)?num2+" is greater number among three numbers" : num3+" is greater number among three numbers");
	}
}

//((num1<num2)?((num1<num3)?(num1):(num3)?(num2):(num3))); --> it is for smallest number