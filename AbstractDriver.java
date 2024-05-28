abstract class Parent
{
	abstract void m1();
	abstract void m2();
	void m3(){
		System.out.println("Hii from m3() of Parent class");
	}
}

abstract class Child1 extends Parent
{
	void m2(){
		System.out.println("implementation provide by Child1 class");
	}

	abstract void m4();
}

class Child2 extends Parent
{
	void m1(){
		System.out.println("m1() implementation by child2");
	}

	void m2(){
		System.out.println("m2() implementation by child2");
	}

	void m5(){
		System.out.println("Hiii from m5() of child2 class");
	}
}

class Subchild extends Child1
{
	void m1(){
		System.out.println("m1() implementation by Subchild");
	}

	void m4(){
		System.out.println("m4() implementation by Subchild");
	}
}

class AbstractDriver
{
	public static void main(String[] args) {
		Child2 c = new Child2();
		c.m1();
		c.m2();
		c.m5();
		c.m3();
		Subchild sc = new Subchild();
		sc.m1();
		sc.m4();
		sc.m2();
		sc.m3();
	}
}