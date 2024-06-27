import java.util.*;
class ArraysDescending
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a size of an array : ");
		int size = sc.nextInt();
		int arr [] = new int[size];
		System.out.print("Enter an array elements : ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("arr is : "+Arrays.toString(arr));

		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("array in descending order : "+Arrays.toString(arr));
	}
}