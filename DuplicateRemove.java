import java.util.*;
class DuplicateRemove
{
	public static void main(String[] args) {
		int a [] = {1,2,3,2,4,5,2};
		int cnt = 0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					cnt++;
				}
			}
		}
		System.out.println(cnt);

		// int newArr [] = new int[a.length-cnt];
		// int index = 0;
		// for(int i=0;i<a.length;i++)
		// {
		// 	int count = 0;
		// 	for(int j=i+1;j<a.length;j++)
		// 	{
		// 		if(a[i]==a[j])
		// 		{
		// 			count++;
		// 		}
		// 	}

		// 	if(count==0)
		// 	{
		// 		// newArr[index++] = a[i];
		// 		System.out.print(a[i]+" ");
		// 	}
		// }

		// System.out.println(Arrays.toString(a));
		// System.out.println(Arrays.toString(newArr));
	}
}