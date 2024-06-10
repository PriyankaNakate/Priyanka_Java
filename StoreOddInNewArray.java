import java.util.*;
class StoreOddInNewArray
{
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,7,8,9,10};
		int count = 0;
		for(int i : arr)
		{
			if(i%2==1)
				count++;
		}

		int [] oddNumber = new int[count];
		int index = 0;
		for(int i : arr)
		{
			if(i%2==1)
				oddNumber[index++]=i;
		}
		System.out.println(Arrays.toString(oddNumber));
	}
}