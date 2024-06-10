class LengthVariUsingForeach
{
	public static void main(String[] args) {
		int [] a = {10,20,30,40,50,60};
		int len = 0;
		for(int i : a){
			len++;
		}
		System.out.println("Length of an array : "+len);
	}
}