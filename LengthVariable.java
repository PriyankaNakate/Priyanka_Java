class LengthVariable
{
	public static void main(String[] args) {
		int [] a = {10,20,30,40,50};
		int len = 0;
		for( ; ; ){
			try{
				System.out.println(a[len++]);
			}
			catch(ArrayIndexOutOfBoundsException ae){
				break;
			}
		}
		System.out.println(len-1);
	}
}