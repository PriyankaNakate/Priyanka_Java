class UserNullPointerException extends RuntimeException
{
	UserNullPointerException(String desc)
	{
		super(desc);
	}
}
class Student
{
	String sname;
	String branch;
}
class UserNullExceptionDriver
{
	public static void main(String[] args) {
		 Student s = null;
		 if(s==null){
		 	try{
		 		throw new UserNullPointerException("object is null");
		 	}
		 	catch(UserNullPointerException npe){
		 		npe.printStackTrace();
		 	}
		}
	}
}