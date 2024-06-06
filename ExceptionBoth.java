class ExceptionBoth
{
	int a = 10;
	static ExceptionBoth e;
	public static void main(String[] args) {
		System.out.println("main strat");
		try{
			System.out.println(10/0);
		}
		catch(ArithmeticException ae){
			ae.printStackTrace();
			try{
				System.out.println(e.a);
			}
			catch(NullPointerException ne){
				ne.printStackTrace();
			}
		}
		System.out.println("main ends");
	}
}