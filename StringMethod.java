class StringMethod
{
	static String a = "Hello";
	public static void main(String[] args) {
		int l = userLength();
		System.out.println("String Length : "+l);
	}

	public static int userLength()
	{
		int l = 0;
		for(int i=0;;i++){
			try{
				a.charAt(i);
				l++;
			}
			catch(StringIndexOutOfBoundsException ae){
				break;
			}
		}
		return l;
	}
}
