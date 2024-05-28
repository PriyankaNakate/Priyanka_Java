import java.util.*;
class ExamSwappingNumber1
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		System.out.print("Enter a key : ");
		int key = sc.nextInt();
		System.out.println(num+" "+rotate(num,key));
	}

	public static int rotate(int num,int key)
	{
		String str = " "+num;
		int length = str.length();
		String = str1 = "";
		for(int i=1;i<=key;i++)
			str+=num;

		for(int i=0;i<=length-1;i++)
			str1+=str.charAt(i+key);

		return Integer.parseInt(str1);
	}
}