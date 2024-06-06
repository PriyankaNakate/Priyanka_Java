class Parent
{
	static int a = 10;
	static void m1(){
		System.out.println("static m1() with no arguments in parent class");
	}

	// void m1(){
	// 	System.out.println("static m1() with no arguments in parent class differ in static keyword"); // CTE
	// }  

	static void m1(int a){
		System.out.println("static m1() with arguments in parent class");
	}

	void m3(){
		System.out.println("non static m3() with no arguments in parent class");
	}
}
class Child extends Parent
{
	int a = 20;
	static void m1(int a){
		System.out.println("static m1() with arguments in child class");
	}
	public void main() {
		int a = 30;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
		super.m1(40);
		super.m3();
	}
	void m3(){
		System.out.println("non static m3() with no arguments in child class");
	}
}

class VariableHiding
{
	public static void main(String[] args) {
		Child c = new Child();
		System.out.println(c.a);
		c.main();
		c.m1();
		c.m1(50);
		c.m3();
	}
}