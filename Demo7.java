class Demo7
{
	String str1 = "Hi i am non static variable from class Demo7";
	public static void main(String[] args){
		System.out.println("Hello from main");
		Demo8 obj = new Demo8();
		obj.m1();
	}
}

class Demo8
{
	static Demo7 obj = new Demo7();
	void m1(){
		System.out.println("Hello from m1()");
		System.out.println(obj.str1);
		m2();
	}

	void m2(){
		System.out.println("Hi from m2()");
		System.out.println(obj.str1);
		m3();
	}

	static void m3(){
		System.out.println("Hi from m3()");
		System.out.println(obj.str1);
	}
}