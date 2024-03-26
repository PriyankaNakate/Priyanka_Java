import java.util.Scanner;
// First, check the given number consist of three digits or not. 
// If no, print cannot be a fascinating number.
// Else, multiply the given number by 2 and 3, separately.
// concatenate result with original number after if number have all digits from 1 to 9 exactly once then it is fascinating.
//number : 327 => 1.327×2=654 2.327×3=981 3."327"+"654"+"981" = 327654981

class FascinatingNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int dup = num;
		int len = 0;
		String concat = " ";
		while(num>0)
		{
			len++;
			num/=10;
		}
		if(len<3)
		{
			System.out.println("not Fascinating Number");
		}
		else
		{
			int mul2 = dup*2;
			int mul3 = dup*3;
			concat = concat+dup+mul2+mul3;
			System.out.println(concat);
			for(int i=1;i<concat.length();i++)
			{
				char ch = concat.charAt(i);
				// System.out.print(ch+" ");
				int count=0;
				switch(ch)
				{
					case '1' : count++;break;
					case '2' : count++;break;
					case '3' : count++;break;
					case '4' : count++;break;
					case '5' : count++;break;
					case '6' : count++;break;
					case '7' : count++;break;
					case '8' : count++;break;
					case '9' : count++;break;
				}
			}
			System.out.println(" count is : "+count);
			if(count==1)
			{
				System.out.println("Fascinating Number");
			}
			else
			{
				System.out.println("not Fascinating Number");
			}
		}
	}
}