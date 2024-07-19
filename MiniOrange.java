import java.util.*;
class MiniOrange
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		encodeString(text);

	}

	public static void encodeString(String text)
	{
		String [] arr = text.split(" ");
		System.out.println(Arrays.toString(arr));
		String reverse = "";
		for(int i=0;i<arr.length;i++)
		{
			String str = arr[i];
			String word = "";
			for(int j=str.length()-1;j>=0;j--)
			{
				  char ch = str.charAt(j);
				  word += ch;
			}
			reverse+=word;
			reverse+=" ";
		}

		System.out.print(reverse);

		for(int i=0;i<reverse.length();i++)
		{
			char ch = reverse.charAt(i);
			if(i%2==0 && ch>=65&&ch<=90&&ch)

		}
	}
}