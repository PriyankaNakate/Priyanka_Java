import java.util.*;
class StorePrimeNoInArr
{
	public static void main(String[] args) {
		boolean flag;
		int [] primeNo = new int [10];
		int count = 0;
		for(int i=1;count<=10;i++)
		{
			flag = isPrime(i);
			if(flag==true)
			{
				primeNo[count++] = i;
				if(count==10)
					break;
			}
		}
		System.out.println("First 10 prime numbers : "+Arrays.toString(primeNo));

	}

	public static boolean isPrime(int num)
	{
		boolean flag = true;
		if(num==1)
			return false;
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

