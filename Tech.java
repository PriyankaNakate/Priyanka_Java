import java.util.Scanner;
class Tech
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int len = 0;
		int dup = num;
		while(num>0)
		{
			len++;
			num/=10;
		}
		if(num%2==0)
		{
			int div =1;
			for(int i=1;i<=len/2;i++)
				div*=10;
			int firstHalf = dup/div;
			int lastHalf = dup%div;
			int add = firstHalf+lastHalf;
			int square = add*add;
			System.out.println(dup==square?dup+" is tech number":dup+" is not tech number");
		}
		else{
			System.out.print(dup+" is not tech number");
		}
	}
}