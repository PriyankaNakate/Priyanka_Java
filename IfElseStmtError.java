class IfElseStmtError
{
	public static void main(String[] args) {
		System.out.println("Execution starts");
		int a=10;
		if(false)
			a=20;
			System.out.println("hii from if block");
		else 
			System.out.println("hello from else block");
		System.out.println("execution ends");
	}
}