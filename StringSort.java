//w.j.p to sort the string elements and print the string based on alphabetical order
import java.util.*;
class StringSort
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str = sc.next().toLowerCase();
		int arr[] = new int[str.length()];
		for(int i=0;i<str.length();i++)
		{
			arr[i] = str.codePointAt(i);
		}

		//System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[i])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			} 
		}
		//System.out.println(Arrays.toString(arr));

		for(int i : arr)
		{
			char ch = (char)i;
			System.out.print(ch);
		}
	}
}

//write a java program to reverse the each charactor in words in a sentence.
// e.g qspiders training institute => sredipsq gniniart etutitsni
