import java.util.*;
class FibonacciesSeriesInArr
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many terms u want to  print of fibonaccies series : ");
		int fiboo = sc.nextInt();
		int arr [] = new int[fiboo];
		int num1 = 0;
		int num2 = 1;
		int index =0;
		arr[index++] = num1;
		arr[index++] = num2;
		for(int i=1;i<=fiboo-2;i++)
		{
			int num3=num1+num2;
			arr[index++]=num3;
			num1 = num2;
			num2 = num3; 
		}
		System.out.println(Arrays.toString(arr));

		// String str = "priya";
		// String str2 = "riya";
		// String str3 = "jiya";

		// System.out.println(str.concat(str2.concat(str3)));
	}
}