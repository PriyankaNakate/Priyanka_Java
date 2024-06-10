class TwoDarrayUsingForeach
{
	public static void main(String[] args) {
		int [][] a = {{10,20,30},{40,50},{60,70,80,90}};

		System.out.println("Using Foreach : ");
		for(int [] i : a)
		{
			for(int j : i)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}

		System.out.println("Using for loop : ");
		for(int i =0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

		System.out.println("Using While Loop : ");
		int i =0;
		while(i<a.length)
		{
			int j = 0;
			while(j<a[i].length)
			{
				System.out.print(a[i][j]+" ");
				j++;
			}
			i++;
			System.out.println();
		}

		System.out.println("Using do While Loop : ");
		i =0;
		do
		{
			int j = 0;
			do
			{
				System.out.print(a[i][j]+" ");
				j++;
			}while(j<a[i].length);
			
			i++;
			System.out.println();
		}while(i<a.length);

	}
}