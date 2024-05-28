class Parent
{
	int a = 10;
}
class Child extends Parent
{
	int a = 20;
	public void main() {
		int a = 30;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}
}

class VariableHiding
{
	public static void main(String[] args) {
		Child c = new Child();
		System.out.println(c.a);
		c.main();
	}
}