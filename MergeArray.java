// w.j.p to merge two arrays into one single array 
import java.util.*;
class MergeArray
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter size for arr1 : ");
		int size1 = sc.nextInt();
		System.out.print("enter size for arr2 : ");
		int size2 = sc.nextInt();
		
		int [] arr1 = new int[size1];
		int [] arr2 = new int[size2];
		
		System.out.println("Enter elements for arr1 : ");
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i] = sc.nextInt();
		}
		System.out.println("arr1 is : "+Arrays.toString(arr1));
		
		System.out.println("Enter elements for arr2 : ");
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i] = sc.nextInt();
		}
		System.out.println("arr2 is : "+Arrays.toString(arr2));

		int mergeArr [] = new int[size1+size2];
		int index = 0;
		for(int i=0;i<arr1.length;i++)
		{
			mergeArr[index++] = arr1[i];
		}
		for(int i=0;i<arr2.length;i++)
		{
			mergeArr[index++] = arr2[i];
		}
		System.out.println("Array after merge two arrays : "+Arrays.toString(mergeArr));
	}
}