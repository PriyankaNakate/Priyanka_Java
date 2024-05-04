class Parent
{
	static String str = "Hii from parent class";
	void m1(){
		System.out.println("Hello from parent class m1()");
	}

	static void m3(){
		System.out.println("Hello from parent class static m3()");
	}
}

class Child extends Parent
{
	String str = "Hii from child class";
	void m2(){
		System.out.println("Hello from child class m2()");
		m1();
		m3();
		System.out.println(super.str);
	}

	static void m4(){
		System.out.println("Hello from parent class static m4()");
	}
}

class InheritDriver
{
	public static void main(String[] args) {
		Child c = new Child();
		System.out.println(c.str);
		// System.out.println(c.str1);
		c.m2();
		c.m1();
		c.m3();
		c.m4();
	}
}