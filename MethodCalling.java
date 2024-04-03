class MethodCalling{
	public static void main(String[] args) {
		System.out.println("Main Starts");
		priya();
		System.out.println("Main Ends");
	}
	public static void priya(){
		System.out.println("Priya Starts");
		riya();
		System.out.println("Priya Ends");
	}
	public static void riya()
	{
		System.out.println("riya Starts");
		jiya();
		System.out.println("riya Ends");
	}
	public static void jiya()
	{
		System.out.println("jiya Starts");
		System.out.println("jiya Ends");
	}
}