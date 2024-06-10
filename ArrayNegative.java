//write a java program to fetch negative numbers in an array
import java.util.*;
class ArrayNegative
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// int [] a = {2,-3,0,6,-4,-2,7,8};
		// for(int i=0;i<a.length;i++){
		// 	if(a[i]<0){
		// 		System.out.println(a[i]);
		// 	}
		// }

		//write java program to reverse elements in an array
		// System.out.println("Original elements in array : ");
		// for(int i=0;i<a.length;i++){
		// 	System.out.print(a[i]+" ");
		// }
		// System.out.println();
		// System.out.println("Reverse elements in array : ");
		// for(int i=a.length-1;i>=0;i--){
		// 	System.out.print(a[i]+" ");
		// }

		// String [] names = {"priya","prachi","riya","jiya"};
		// System.out.println("Original elements in array : ");
		// for(int i=0;i<names.length;i++){
		// 	System.out.print(names[i]+" ");
		// }
		// System.out.println();
		// System.out.println("Reverse elements in array : ");
		// for(int i=names.length-1;i>=0;i--){
		// 	System.out.print(names[i]+" ");
		// }	

		//write a java program to find a particular/key elements in an array
		int [] a = {9,3,7,8,1,4}; //{1,9,7,4,8,9,10}
		System.out.print("Enter one number for search : ");
		int key = sc.nextInt();
		int i;
		for(i=0;i<a.length;i++){
			if(key==a[i])
			{
				System.out.println("Position of "+key+" in an array : "+(i+1));
				break;
			}
		}
		// System.out.println(i);
		if(i>=a.length){
			System.out.println("element not found");
		}
	}
}


