class ReverseIncrePattern
{
	public static void main(String[] args) {
		int num=1;
		int j;
		for(int i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(num-- +" ");
			}
			System.out.println();
			num=num+j;
			num = i + num;
		}
	}
}