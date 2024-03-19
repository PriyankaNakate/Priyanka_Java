class ForLowerAlphabet
{
	public static void main(String[] args) {
		for(char ch=97;ch<=122;ch++)
		{
			System.out.print(ch+" ");
		}
		System.out.println();
		System.out.println("Reverse Alphabet : ");
		for(char ch=122;ch>=97;ch--)
		{
			System.out.print(ch+" ");
		}
	}
}