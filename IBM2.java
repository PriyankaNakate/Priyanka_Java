import java.util.*;
class IBM2
{
	public static void main(String[] args) {
		int [] arr={8,3,6,3,2,2,4,8,1,6};
		int pos =7;
		int ele = arr[pos];
		int count =0;

		for(int i=0;i<arr.length;i++)
		{
			if(i<pos && arr[i]>ele)
				count++;
			else if(i>pos && arr[i]<ele)
				count++;
		}
		System.out.println(count);
	}
}