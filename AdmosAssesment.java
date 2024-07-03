import java.util.*;
class AdmosAssesment
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str = sc.next();
		int len = str.length();

		String firstHalf= (new StringBuffer(str.substring(0,len/2))).reverse().toString();
		String secondHalf= (new StringBuffer(str.substring((len/2),len))).reverse().toString();
		System.out.println(firstHalf+" : "+secondHalf);

		String op="";
		for(int i=0;i<secondHalf.length();i++)
		{
			if(i<firstHalf.length())
				op=op+firstHalf.charAt(i);
			op=op+secondHalf.charAt(i);
		}
		System.out.println(op);
	}
}