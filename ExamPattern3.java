class ExamPattern3
{
	public static void main(String[] args) {
		int even = 2;
		int odd = 1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i%2==0)
				{
					System.out.print(even+" ");
					even+=2;
				}
				else{
					System.out.print(odd+" ");
					odd+=2;
				}
			}
			System.out.println();
		}
	}
}