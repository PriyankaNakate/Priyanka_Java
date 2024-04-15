class PrimePattern
{
	static int num =2;
	public static void main(String[] args) {
		int count = 0;
		// for(int i=1;count!=10;i++)
		// {
		// 	if(prime())
		// 	{
		// 		System.out.print(num+" ");
		// 		count++;
		// 	}
		// 	num++;
		// }
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(prime())
				{
					System.out.print(num++ +" ");
				}
			}
			System.out.println();
		}
	}

	public static boolean prime()
	{
		boolean flag = true;
		for(int i=2;i<num;i++)
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