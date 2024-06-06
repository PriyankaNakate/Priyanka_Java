class ExceptionExample
{
	public static void main(String[] args) {
		System.out.println("hiii");
		try{
			System.out.println("outer try");
			try
			System.out.println(10/0);
		}
		catch(ArithmeticException ae){
			System.out.println("outer catch 1");
		}
	}
}