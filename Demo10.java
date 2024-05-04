class Demo10
{
	public static void main(String[] args) {
		System.out.println("Hii from main");
		Demo10 obj = new Demo10();
		obj.m1();
	}

	public void m1(){
		System.out.println("Hii from m1()");
		Demo11 obj = new Demo11();
		obj.m2();
	}
}

class Demo11
{
	public void m2(){
		System.out.println("Hii from m2()");
		m3();
	}

	public void m3(){
		System.out.println("Hii from m3()");
	}
}