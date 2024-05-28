class Student
{
	String name;
	String place;
	String branch;
	int yop;

	Student(String name,String place,String branch,int yop)
	{
		this.name = name;
		this.place = place;
		this.branch = branch;
		this.yop = yop;
	}

	public boolean equals(Object s1)
	{
		Student s2 = (Student)s1;
		if((this.name==s2.name)&&(this.place==s2.place)&&(this.branch==s2.branch)&&(this.yop==s2.yop))
			return true;
		else
			return false;
	}
}

class StudentDriver
{
	public static void main(String[] args) {
		Student s1 = new Student("Priya","Pune","CS",2023);
		Student s2 = new Student("Priya","Pune","CS",2024);
		System.out.println(s1.equals(s2));
	}
}