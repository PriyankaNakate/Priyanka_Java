class ExceptionNullPointer
{
	static ProgramNull p;
	public static void main(String[] args) {
		System.out.println("main method started");
		try{
			System.out.println(p.a);
		}

		catch(Exception e){
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

		System.out.println("main method ended");
	}
}