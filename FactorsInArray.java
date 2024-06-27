// w.j.p to fetch all the factors in an array
//w.j.p to find the factors of a number and store all these factors in an array
//
import java.util.*;
class FactorsInArray
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// int [] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		// System.out.print("Enter number to search factors in array : ");
		// int num = sc.nextInt();
		// System.out.print("Factors of "+num+" in an array : ");
		// for(int i=0;i<arr.length;i++)
		// {
		// 	if(num%arr[i]==0)
		// 	{
		// 		System.out.print(arr[i]+" ");
		// 	}
		// }


		System.out.print("Enter number to find the factors : ");
		int num = sc.nextInt();
		int count = 0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}

		int [] arr = new int[count];
		int index = 0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				arr[index++] = i;
			}
		}
		System.out.println("Array is : "+Arrays.toString(arr));
	}
}

//w.j.p to find sum of all elements at even indexes
//w.j.p to find the sum of all elements at odd indexes
//w.j.p to store first 10 prime numbers in a new array
//w.j.p to store fibonaccies series of any terms in an array
//
