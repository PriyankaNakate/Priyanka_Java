class FibonacciesRecursion
{
	static int num1 = 0;
	static int num2 = 1;
	static int num3;
	static int i = 0;
	public static void main(String[] args) {
		System.out.print(num1+" "+num2+" ");
		fibonaccies();
	}
	public static void fibonaccies(){
		i++;
		if(i>8) 
			return;
		num3 = num1+num2;
		System.out.print(num3+" ");
		num1 = num2;
		num2 = num3;
		fibonaccies();
	}
}