import java.util.Scanner;
//A number is said to be a tech number, when an even digit number is divided into exactly two parts 
//and the square value of the sum of those two numbers is equal to the original number. ex-2025 => 20+25 = 45^2 = 2025
class TechNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int dup = num;
		int len = 0;
		int firstPart = 0;
		int secPart = 0;
		while(num>0)
		{
			len++;
			num/=10;
		}
		System.out.println("length of number : "+len);
		if(len%2==0)
		{
			firstPart = dup/100;
			System.out.print(firstPart+" ");
			secPart = dup%100;
			System.out.println(secPart);
			int add = firstPart+secPart;
			System.out.println(add);
			int square = add*add;
			if(square==dup)
			{
				System.out.println(dup+" is tech number");
			}
			else{
				System.out.println(dup+" is not tech number");
			}
		}
		else{
			System.out.println(dup+" is not tech number");
		}
	}
}