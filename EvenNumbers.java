class EvenNumbers
{
	public static void main(String[] args) {
		System.out.println("Even Number     odd Number");
		for(int i=1;i<=100;i++)
		{
			if(i%2==0)
				System.out.println(i);
			else
				System.out.println("     "i);
		}
	}
}