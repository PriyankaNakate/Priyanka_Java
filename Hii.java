

import java.util.*;
class Hii
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		//int n=4;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==2||i==3)
				{
					if(j%2!=0)
						System.out.print("*"+" ");
				}
				else{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}