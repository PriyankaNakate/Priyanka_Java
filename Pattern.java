class Pattern
{
	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>i;j--)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{
				if((i%2==1) && (j%2==1))
				{
					System.out.print("1 ");
				}
				else if((i%2==0) && (j%2==1))
				{
					System.out.print("0 ");
				}
				else if((i%2==1)&&(j%2==0)){
					System.out.print("0 ");
				}
				else {
					System.out.print("1 ");
				}
			}
			System.out.println();
		}
	}
}