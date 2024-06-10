class ThreeDarrayUsingForeach
{
	public static void main(String[] args) {
		System.out.println();
		System.out.println("****Printing 3D Array*****");
		int [][][] arr = {{{10,20},{30}},{{40,50,60}}};
		System.out.println("Using Foreach : ");
		for(int [][] i : arr)
		{
			for(int[] j : i)
			{
				for(int k : j)
				{
					System.out.println(k+" ");
				}
			}
		}

		System.out.println("Using for loop : ");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				for(int k=0;k<arr[i][j].length;k++)
				{
					System.out.println(arr[i][j][k]);
				}
			}
		}

		System.out.println("Using while loop : ");
		int i =0;
		while(i<arr.length)
		{
			int j = 0;
			while(j<arr[i].length)
			{
				int k =0;
				while(k<arr[i][j].length)
				{
					System.out.println(arr[i][j][k]);
					k++;
				}
				j++;
			}
			i++;
		}

		System.out.println("Using Do while loop : ");
		i =0;
		do
		{
			int j = 0;
			do
			{
				int k =0;
				do
				{
					System.out.println(arr[i][j][k]);
					k++;
				}while(k<arr[i][j].length);
				j++;
			}while(j<arr[i].length);
			i++;
		}while(i<arr.length);
	}
}