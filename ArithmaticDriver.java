interface Arithmatic
{
	int add(int a,int b);
	int multi(int a,int b);

}

class ArithmaticImplementation implements Arithmatic
{
	public int add(int a,int b){
		return a+b;
	}

	public int multi(int a,int b){
		return a*b;
	}
}

class ArithmaticDriver
{
	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		// System.out.print("Enter two numbers : ");
		// int a = sc.nextInt();
		// int b = sc.nextInt();
		ArithmaticImplementation obj = new ArithmaticImplementaion();
		System.out.println(obj.add(10,20));
		System.out.println(obj.add(10,20));
	}
}