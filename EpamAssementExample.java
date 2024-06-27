import java.util.*;
class EpamAssementExample
{
	public static void main(String[] args) {
		int [] a = {3,1,2,5,2};
		int min = a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min = a[i];
			}
		}

		int max = a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max = a[i];
			}
		}

		int count = 0;
		for(int i=min;i<=max;i++)
		{
			int cnt = 0;
			for(int j=0;j<a.length;j++)
			{
				if(a[j]==i)
				{
					cnt++;
				}
			}
			if(cnt>1 || cnt==0)
			{
				count++; 
			}
		}

		int [] newArr = new int[count];
		int index =0;
		for(int i=min;i<=max;i++)
		{
			int cnt = 0;
			for(int j=0;j<a.length;j++)
			{
				if(a[j]==i)
				{
					cnt++;
				}
			}
			if(cnt>1 || cnt==0)
			{
				newArr[index++] = i; 
			}
		}

		System.out.println(Arrays.toString(newArr));
	}
}