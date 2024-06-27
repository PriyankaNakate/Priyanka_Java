//w.j.p to fetch all the prime nnumbers in an array
import java.util.*;
class PrimeNoInArray
{
	public static void main(String[] args) {
		boolean flag;
		int [] arr = {2,3,4,5,6,7,8,9,13,14,15,16,17};
		for(int i=0;i<arr.length;i++)
		{
			flag = isPrime(arr[i]);
			if(flag==true)
			{
				System.out.println(arr[i]);
			}
		}
	}

	public static boolean isPrime(int num){
		boolean flag = true;
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0){
				flag = false;
				break;
			}
		}
		return flag;
	}
}