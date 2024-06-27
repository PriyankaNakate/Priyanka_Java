import java.util.*;
class ElementCountInArray
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of an array : ");
		int size = sc.nextInt();
		int [] arr = new int[size];
		System.out.println("Enter array elements : ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("arr is : "+Arrays.toString(arr));

		System.out.println("Enter elements for searching the count : ");
		int ele = sc.nextInt();
		int cnt = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(ele==arr[i])
			{
				cnt++;
			}
		}
		if(cnt==0)
		{
			System.out.println(ele+" is not present in an array");
		}
		else{
			System.out.println("Count of entered element is : "+cnt);

		}
	}
}