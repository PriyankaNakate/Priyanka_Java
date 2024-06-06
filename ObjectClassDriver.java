import java.util.*;
class Employee
{
	String name;
	String role;

	Employee(String name,String role)
	{
		this.name = name;
		this.role = role;
	}

	@Override
	protected void finalize()
	{
		System.out.println("Object got destroyed");
	}
}

class ObjectClassDriver
{
	public static void main(String[] args) 
	{
		Employee obj = new Employee("Priya","Manager");
		System.out.println(obj.name);
		obj=null;
		System.gc();
		System.out.println(obj.name);
	}
}