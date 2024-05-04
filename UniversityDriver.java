class University
{
	String name;
	String uniCode;
	int noOfColleges;
	String type;
	int establishYear;
	int course;
	College college;

	University(String name,String uniCode,int noOfColleges,String type,int establishYear,int course)
	{
		this.name = name;
		this.uniCode = uniCode;
		this.noOfColleges = noOfColleges;
		this.type = type;
		this.establishYear = establishYear;
		this.course = course;
	}

	public void displayUniversity(){
		System.out.println();
		System.out.println("**University Details**");
		System.out.println("Name : "+name);
		System.out.println("University code : "+uniCode);
		System.out.println("Number of Colleges : "+noOfColleges);
		System.out.println("University type : "+type);
		System.out.println("University establishYear : "+establishYear);
		System.out.println("University number of courses : "+course);
	}

	public void createInstanceOfCollege(String name,String collegeCode,String address,int noOfDept,char grade,int staffCount){
		college = new College(name,collegeCode,address,noOfDept,grade,staffCount);
	}
}

class College
{
	String name;
	String collegeCode;
	String address;
	int noOfDept;
	char grade;
	int staffCount;
	Department dept;

	College(String name,String collegeCode,String address,int noOfDept,char grade,int staffCount)
	{
		this.name = name;
		this.collegeCode = collegeCode;
		this.address = address;
		this.noOfDept = noOfDept;
		this.grade = grade;
		this.staffCount = staffCount;
	}

	public void displayCollege(){
		System.out.println();
		System.out.println("**College Details**");
		System.out.println("Name : "+name);
		System.out.println("College Code : "+collegeCode);
		System.out.println("Address : "+address);
		System.out.println("No of Department : "+noOfDept);
		System.out.println("College Grade : "+grade);
		System.out.println("Staff Count : "+staffCount);
	}

	public void createInstanceOfDept(String name,String hod,int noOfClassRoom,int staff,int subject){
		 dept = new Department(name,hod,noOfClassRoom,staff,subject);
	}
}

class Department
{
	String name;
	String hod;
	int noOfClassRoom;
	int staff;
	int subject;
	Teacher teacher;

	Department(String name,String hod,int noOfClassRoom,int staff,int subject)
	{
		this.name= name;
		this.hod = hod;
		this.noOfClassRoom = noOfClassRoom;
		this.staff = staff;
		this.subject = subject;
	}

	public void displayDepartment(){
		System.out.println();
		System.out.println("**Department Details**");
		System.out.println("Department Name : "+name);
		System.out.println("Department HOD : "+hod);
		System.out.println("noOfClassRoom : "+noOfClassRoom);
		System.out.println("Staff : "+staff);
		System.out.println("Subject : "+subject);
	}

	public void createInstanceOfTeacher(String name,String subject,long phoneNumber,String qualification,int exp)
	{
		teacher = new Teacher(name,subject,phoneNumber,qualification,exp);
	}
}

class Teacher
{
	String name;
	String subject;
	long phoneNumber;
	String qualification;
	int exp;

	Teacher(String name,String subject,long phoneNumber,String qualification,int exp)
	{
		this.name = name;
		this.subject = subject;
		this.phoneNumber = phoneNumber;
		this.qualification = qualification;
		this.exp = exp;
	}

	void displayTeacher(){
		System.out.println();
		System.out.println("**Teacher Details**");
		System.out.println("Name : "+name);
		System.out.print("Subject : "+subject);
		System.out.println("phoneNumber : "+phoneNumber);
		System.out.println("qualification : "+qualification);
		System.out.println("Experience : "+exp);
	}
}

class UniversityDriver
{
	public static void main(String[] args) {
		University obj = new University("SPPU","UNI123",1100,"Government",1950,300);
		obj.displayUniversity();
		obj.createInstanceOfCollege("Modern","Modern123","ShivajiNagar Pune",10,'A',110);
		obj.college.displayCollege();
		obj.college.createInstanceOfDept("CS","P.D.Nakate",10,10,48);
		obj.college.dept.displayDepartment();
		obj.college.dept.createInstanceOfTeacher("Shrikant","java",8253243252l,"Mtech",5);
		obj.college.dept.teacher.displayTeacher();
	}
}