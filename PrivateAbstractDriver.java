abstract class Parent
{
	private abstract void m1();
}

class Child extends Parent
{
	public void m1(){
		System.out.println("m1() from child class");
	}
}

class PrivateAbstractDriver
{
	public static void main(String[] args) {
		Child obj = new Child();
		obj.m1();
	}
}