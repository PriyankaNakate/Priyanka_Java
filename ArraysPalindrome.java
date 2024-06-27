//W.j p to check array is palindrome or not
import java.util.*;
class ArraysPalindrome
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of an array : ");
		int size = sc.nextInt();
		char [] arr = new char[size];+
		System.out.println("Enter array elements : ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.next().charAt(0);
		}
		System.out.println("arr is : "+Arrays.toString(arr));

		char [] reverseArr = new char[size];
		int j = 0;
		for(int i=arr.length-1;i>=0;i--)
		{
			reverseArr[j++] = arr[i];
		}
		System.out.println("reverseArr is : "+Arrays.toString(reverseArr));

		if(Arrays.equals(arr,reverseArr))
		{
			System.out.println("It is Palindrome");
		}
		else{
			System.out.println("not Palindrome");
		}
	}
}


//steps :
// 1. Create an array of char data type 
// 2. reverse the array and store it an reversed array
// 3. compare both arrays using Arrays.equals()