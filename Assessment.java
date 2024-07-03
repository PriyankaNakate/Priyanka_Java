import java.util.*;
class Assessment  //(98 que from array pdf)
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no of chapters : ");
		int noOfChapter = sc.nextInt();
		System.out.print("Enter beginning missing day : ");
		int b = sc.nextInt();
		System.out.print("Enter ending missing day : ");
		int e = sc.nextInt();
		
		int unqChapters = solve1(noOfChapter,b,e);
		System.out.println("First way : "+unqChapters);

		int unqChapters1 = solve(noOfChapter,b,e);
		System.out.println("Second way : "+unqChapters1);
	}

	public static int solve1(int chptrs,int start,int end)
	{
		if((end-start)>=chptrs)
			return chptrs;
		else
			return (end-start)+1;
	}

	private static int solve(int chptrs,int start,int end)
	{
		int a = chptrs*((end/chptrs)+1);
		int[] chapters = new int[a];
		int index = 0;
		for(int j=1;j<=(a/chptrs);j++)
		{
			for(int i=0;i<chptrs;i++)
			{
				chapters[index++] = i;
			}
		}

		int [] arr = new int[end-start+1];
		for(int i=start,j=0;i<=end;i++,j++)
		{
			arr[j] = chapters[i];
		}

		long cnt  = Arrays.stream(arr).distinct().count();
		return (int)cnt;
	}
}