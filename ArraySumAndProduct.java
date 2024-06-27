// w.j.p to find to get sum and product in single dimensional array
import java.util.*;
class ArraySumAndProduct
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of an array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter array elements : ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Array is : "+Arrays.toString(arr));
		int sum = 0;
		int product = 1;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
			product*=arr[i];
		}
		System.out.println("Sum of elements in array : "+sum);
		System.out.println("Product of elements in array : "+product);
	}
}
