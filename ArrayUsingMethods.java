import java.util.*;
class ArrayUsingMethods
{
	int arr [];
	static Scanner sc = new Scanner(System.in);
	public void storeElements(int arr[])
	{
		this.arr = arr;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
	}

	public void displayElements(){
		System.out.println("Array elements are : ");
		for(int i : arr)
		{
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		System.out.print("Enter the size : ");
		int size = sc.nextInt();

		System.out.print("Enter array elements : ");
		int arr[] = new int[size];

		ArrayUsingMethods obj = new ArrayUsingMethods();
		obj.storeElements(arr);
		obj.displayElements();
	}
}