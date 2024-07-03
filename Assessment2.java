import java.util.*;
class Assessment2
{
	public static void main(String[] args) {
		int [] arr = {25,10,20};
		int op = solve(arr);
		System.out.println("op : "+op);
	}

	private static int solve(int[] arr)
	{
		int sum =0;
		for(int i=arr.length-2;i>=0;i--)
		{
			int add = arr[i]+arr[i+1];
			sum+=add;
			arr[i] = add;
		}
		return sum;
	}
}