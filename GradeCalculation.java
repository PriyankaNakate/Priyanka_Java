import java.util.*;
class GradeCalculation
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of subjects you want to add : ");
		int n = sc.nextInt();
		float [] subjects = new float[n];
		System.out.print("Enter marks for each subjects out of 100");
		int index = 0;
		int count = 0;
		for(int i=1;i<=n,count<=n;i++)
		{
			if(marks>0 && marks<=100)
			{
				subjects[index++] = sc.nextFloat();
				count++;
			}
			else{
				System.out.print("Enter marks between 1 to 100");
			}
		}

		System.out.println(Arrays.toString(subjects));
	}
}