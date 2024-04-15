class StaticExample
{
	public static void main(String[] args) {
		m1();
		StaticExample1.m1();
		StaticExample3.m2();
	}

	public static void m1(){
		System.out.println("hello from m1()");
	}
}

class StaticExample3
{
	public static void m2(){
		System.out.println("hello from StaticExample3 m2()");
	}
}