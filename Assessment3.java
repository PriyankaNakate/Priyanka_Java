import java.util.*;
class Assessment3
{
	public static void main(String[] args) {
		int a [] = {16,17,4,3,5,2}; //{16,17,4,3,5,2}
		int noLeader = 0;
		for(int i=0;i<a.length;i++)
		{
			int cnt = 0;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					cnt++;
				}
			}
			if(cnt==0)
			{
				System.out.print(a[i]+" ");
				noLeader++;
			}
		}

		if(noLeader==0)
			System.out.println("-1");
	}
}