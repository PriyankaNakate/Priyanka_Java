import java.util.*;
class SentenceToWord
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String sent = sc.nextLine();

		// System.out.println("Using built in method : ");
		// String [] words = sent.split(" ");
		// System.out.println(Arrays.toString(words));

		int cnt = 1;
		int i = 0;
		//infinite loop bcz we don't know the no of words
		for(;;){
			String word = "";
			for(;i<sent.length();i++)
			{
				char ch = sent.charAt(i);
				if(ch==' ')
				{
					i++; //update index for next word 
					cnt++; //increment count after getting a word
					break;
				}
				word+=ch; //concatenate character int empty string to get a word
			}
			// System.out.println(word);
			
			// to terminate the infinite loop at last index of sent
			if(i==sent.length())
				break;
		}

		String[] words = stringToStringArray(cnt,sent);
		System.out.println(Arrays.toString(words));
	}

	public  static String[] stringToStringArray(int cnt,String sent)
	{
		String [] words = new String[cnt];
		int index = 0;
		int i= 0;
		for(;;)
		{
			String word = "";
			for(;i<sent.length();i++)
			{
				char ch = sent.charAt(i);
				if(ch==' ')
				{
					i++; //update the index for next word
					//incre the count after getting a word
					break;
				}
				word += ch; // con characters int empty string tio gget a word
			}
			words[index++]=word;

			//to translate the infinite loop at last index of sent
			if(i==sent.length())
				break;
		}
		return words;
	}
}