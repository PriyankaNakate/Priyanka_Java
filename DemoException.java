class DemoException
{
	static DemoException d;
	int a= 45;
	public static void main(String[] args) {
		System.out.println("main starts");
		try{
			System.out.println("Karthik is a very good boy");
		}
		catch(Exception e){
			e.printStackTrace();

			try{
				System.out.println(d.a);
			}
			catch(Exception e2){
				e2.printStackTrace();
			}
		}
		System.out.println("main ends");
	}
}