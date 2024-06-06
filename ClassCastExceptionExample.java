class Parent
{
	int a = 10;
}

class Child extends Parent
{
	int b = 20;
}

class ClassCastExceptionExample
{
	public static void main(String[] args) {
		System.out.println("Program Started");
		Parent p = new Parent();
		try{
			Child c = (Child)p;
		}
		catch(Exception e){
			e.printStackTrace();
		}

		System.out.println("Program ended");
	}
}