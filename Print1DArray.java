import java.util.*;
class Print1DArray
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size = sc.nextInt();
		int [] arr = new int[size];
		System.out.println("Enter array elements :");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}

		System.out.println("Print array elements using for loop : ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}

		System.out.println();
		System.out.print("Using while loop : ");
		int i=0;
		while(i<arr.length)
		{
			System.out.print(arr[i]+" ");
			i++;
		}

		System.out.println();
		System.out.println("Using do while loop : ");
		do{
			System.out.print(arr[i]+" ");
			i++;
		}while(i<arr.length);

		System.out.println();
		System.out.println("Using forech loop : ");
		for(int j : arr)
		{
			System.out.print(j+" ");
		}
	}
}