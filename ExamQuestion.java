class ExamQuestion
{
	public static void main(String[] args) {
		String str = "hello*3";
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i).toLowerCase();
			System.out.print(++ch +" ");
			// if(ch==a || ch==e || ch==i || ch==o || ch==u)
			// 	System.out.print(++ch.toUpperCase +" ");
		}
	}
}