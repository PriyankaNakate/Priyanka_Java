class Singleton
{
	String name;
	String branch;

	private static Singleton singletonObj; // 1.create static variable of that class

	private Singleton(String name,String branch) // 2.declare all constructor of that class as private
	{
		this.name = name;
		this.branch = branch;
	}

	public static Singleton getInstance(String name,String branch) // 3.create static method which return object of that class 
	{
		if(singletonObj==null){       // 4.Provide logical implementation in that static method for creating an instance of that class
			singletonObj = new Singleton(name,branch);
			return singletonObj;
		}
		else{
			return singletonObj;
		}
	}

	public static void main(String[] args) {
		Singleton obj = getInstance("Priya","Compuet Science");
		System.out.println(obj.name);
		System.out.println(obj.branch);
		Singleton obj1 = getInstance("Pankaj","Mechnical");
		System.out.println(obj1.name);
		System.out.println(obj1.branch);
	}
}