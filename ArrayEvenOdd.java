// w.j. p to store even and odd elements in two different arrays
import java.util.*;
class ArrayEvenOdd
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of an array : ");
		int size = sc.nextInt();
		int [] arr = new int[size];
		System.out.println("Enter array elements : ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Array is : "+Arrays.toString(arr));

		int evenCnt = 0;
		int oddCnt = 0;

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				evenCnt++;
			}
			else
			{
				oddCnt++;
			}
		}

		int [] evenArr = new int[evenCnt];
		int [] oddArr = new int[oddCnt];
		int index = 0;
		int indx = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				evenArr[index++] = arr[i];
			}
			else
			{
				oddArr[indx++] = arr[i];
			}
		}

		System.out.println("Even elements array : "+Arrays.toString(evenArr));
		System.out.println("Odd elements array : "+Arrays.toString(oddArr));

	}
}