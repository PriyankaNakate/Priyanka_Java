import java.util.Scanner;
class EmrpNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int count = 0;
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				count++;
				break;
			}
		}
		boolean flag = count==0?true:false; 
		if(flag)
		{
			int rev = 0;
			while(num!=0)
			{
				int rem = num%10;
				rev = rev*10+rem;
				num/=10;
			}
			int count1 = 0;
			for(int i=2;i<=rev/2;i++)
			{
				if(rev%i==0)
				{
					count1++;
					break;
				}
			}
			boolean flag1 = count1==0?true:false;
			System.out.println((flag && flag1)?"Emrp Number":"Not a Emrp Number");
		}
		else{
			System.out.println("not emrp number");
		}
	}
}