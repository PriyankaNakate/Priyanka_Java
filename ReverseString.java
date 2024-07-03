class ReverseString
{
	public static void main(String[] args) {
		String str = (args[0]);
		String op = "";
		for(int i=str.length()-1;i>=0;i--)
		{
			char ch =str.charAt(i);
			op+=ch;
		}
		System.out.println(op);
	}
}

//cltrl+shift+f = format