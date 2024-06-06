class NullpointerExceptionExample
{
	int a = 10;
	void m1(){
		System.out.println("hi from m1()");
	}
}

class ExceptionHandle
{
	static NullpointerExceptionExample n;
	public static void main(String[] args) {
		System.out.println("main starts");
		try{
			System.out.println(n.a);
			n.m1();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("main end");
	}
}