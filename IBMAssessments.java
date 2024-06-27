import java.util.*;
class IBMAssessments
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String str1[] = str.split(" ");
		System.out.println(Arrays.toString(str1));
		String op ="";
		int max = 0;
		for(int i=0;i<str1.length;i++)
		{
			int len = str1[i].length();
			if(len%2==0)
			{
				if(len>max)
				{
					max = len;
					op = str1[i]; //hi how are u amar
				}
			}
		}
		System.out.println(op);
	}
}