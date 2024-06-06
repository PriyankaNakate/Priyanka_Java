class InstanceVarFinal
{
	final int a = 10;
	
	public static void main(String[] args) {
		InstanceVarFinal obj = new InstanceVarFinal();
		System.out.println(obj.a);
		InstanceVarFinal obj1 = new InstanceVarFinal();
		System.out.println(obj1.a);
	}
}