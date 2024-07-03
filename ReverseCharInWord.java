import java.util.*;
class ReverseCharInWord
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//System.out.print("Enter a String : ");
		//String str = sc.nextLine();
		String str = "Qspider Institute Pune";
		//System.out.println(str.split(" "));
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				for(int j=i;j>=0;j++)
				{
					System.out.print(str.charAt(j));
				}
			}
		}
	}
}