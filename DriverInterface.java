interface Parent1
{
	void m1();
}

interface Parent2
{
	void m2();
}

interface Child extends Parent1,Parent2
{
	void m3();
}

class Implements implements Child
{
	public void m1(){
		System.out.println("implementation to m1() of parent1");
	}

	public void m2(){
		System.out.println("implementation to m2() of parent2");
	}

	public void m3(){
		System.out.println("implementation to m3() of Child");
	}
}

class DriverInterface 
{
	public static void main(String[] args) {
		Implements obj = new Implements();
		obj.m1();
		obj.m2();
		obj.m3();
	}
}