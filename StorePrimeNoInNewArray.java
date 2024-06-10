import java.util.*;
class StorePrimeNoInNewArray
{
	public static void main(String[] args) {
		int [] a = {2,3,4,5,6,7,8,9,10};
		int count = 0;
		boolean flag = true;
		for(int i : a)
		{
			if(isPrime(i))
			{
				count++;
			}
		}
		int [] primeNumber = new int[count];
		int index = 0;
		for(int i : a)
		{
			if(isPrime(i))
				primeNumber[index++]=i;
		}
		System.out.println(Arrays.toString(primeNumber));
	}

	public static boolean isPrime(int num){
		boolean flag = true;
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				flag = false;
				break;
			}
		}
		return flag;
	}
}