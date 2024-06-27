import java.util.*;
class ArraySmallestElement
{
	public static void main(String[] args) {
		int [] a = {2,3,5,7,9,1};
		int min = a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min = a[i];
			}
		}

		System.out.println("Smallest element in an array : "+min);

		int max = a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max = a[i];
			}
		}

		System.out.println("largest element in an array : "+max);
	}
}