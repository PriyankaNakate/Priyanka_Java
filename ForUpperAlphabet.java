class ForUpperAlphabet
{
	public static void main(String[] args) {
		for(char ch = 'A';ch<='Z';ch++)
		{
			System.out.print(ch+" ");
		}
		System.out.println();
		System.out.println("Reverse Alphabet : ");
		for(char ch='Z';ch>=65;ch--)
		{
			System.out.print(ch+" ");
		}
	}
}