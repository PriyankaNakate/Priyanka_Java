import java.util.*;
class Array2D
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter rows : ");
		int rows = sc.nextInt();
		System.out.print("Enter columns : ");
		int column = sc.nextInt();

		int [][] arr = new int[rows][column];

		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<column;j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println(Arrays.deepToString(arr));

		int sum = 0;
		int product = 1;
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<column;j++)
			{
				sum+=arr[i][j];
				product*=arr[i][j];
			}
		}

		System.out.println("sum of array elements : "+sum);
		System.out.println("Product of array elements : "+product);		
	}
}