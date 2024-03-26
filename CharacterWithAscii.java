class CharacterWithAscii
{
	public static void main(String[] args) {
		// for(char ch='A';ch<='Z';ch++)      //using char value by adding int num
		// {
		// 	System.out.println(ch+" => "+(ch+0));
		// }

		// for(char ch='A';ch<='Z';ch++)     //using type casting
		// {
		// 	System.out.println((int)ch+" => "+ch);
		// }

		int asciiVal = 65;
		for(char ch='A';ch<='Z';ch++)     //by taking variable
		{
			System.out.println(asciiVal++ +" => "+ch);
		}

	}
}