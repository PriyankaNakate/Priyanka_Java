class Human
{
	String name;
	String gender;
	Human(String name,String gender)
	{
		this.name = name;
		this.gender = gender;
	}
	public void eat(){
		System.out.println("Human Can Eat");
	} 
	public void walk(){
		System.out.println("Human Can walk");
	}
	public void think(){
		System.out.println("Human Can Think");
	}
	public void speak(){
		System.out.println("Human Can Speak");
	}
	public void displayHuman(){
		System.out.println("**Human Details**");
		System.out.println("Name : "+name);
		System.out.println("gender : "+gender);
	}
}

class Graducation extends Human
{
	String course;
	int duration;
	String branch;
	String university;
	int yop;

	Graducation(String course,int duration,String branch,String university,int yop,String name,String gender)
	{
		super(name,gender);
		this.course = course;
		this.duration = duration;
		this.branch = branch;
		this.university = university;
		this.yop = yop;
	}

	public void displayGraducation(){
		System.out.println();
		System.out.println("**Graducation Details**");
		System.out.println("Course : "+course);
		System.out.println("Duration : "+duration);
		System.out.println("Branch : "+branch);
		System.out.println("University : "+university);
		System.out.println("yop : "+yop);
	}
}

class PostGraducation extends Graducation
{
	String specialization;
	int pgduration;
	int pgyop;
	String pguniversity;

	PostGraducation(String specialization,int pgduration,int pgyop,String pguniversity,String course,int duration,String branch,String university,int yop,String name,String gender)
	{
		super(course,duration,branch,university,yop,name,gender);
		this.specialization = specialization;
		this.pgduration = pgduration;
		this.pgyop = pgyop;
		this.pguniversity = pguniversity;
	}

	public void displayPostGraducation(){
		System.out.println();
		System.out.println("**Post Graducation Details**");
		System.out.println("specialization : "+specialization);
		System.out.println("pgduration : "+pgduration);
		System.out.println("pgyop : "+pgyop);
		System.out.println("pguniversity : "+pguniversity);
	}
}

class Job extends PostGraducation
{
	String company;
	double salary;
	String designation;
	String location;

	Job(String company,double salary,String designation,String location,String specialization,int pgduration,int pgyop,String pguniversity,String course,int duration,String branch,String university,int yop,String name,String gender)
	{
		super(specialization,pgduration,pgyop,pguniversity,course,duration,branch,university,yop,name,gender);
		this.company = company;
		this.salary = salary;
		this.designation = designation;
		this.location = location;
	}

	public void displayJob()
	{
		System.out.println();
		System.out.println("**Job Details**");
		System.out.println("Company : "+company);
		System.out.println("salary : "+salary+" lakhs");
		System.out.println("designation : "+designation);
		System.out.println("location : "+location);
	}
}

class MultiLevelDriver
{
	public static void main(String[] args) {
		Job j = new Job("TCS",7,"Java Developer","Pune","Java",2,2025,"SUUP","Btech",4,"CS","SUUP",2023,"Priyanka","Female");
		j.displayHuman();
		j.eat();
		j.walk();
		j.think();
		j.speak();
		j.displayGraducation();
		j.displayPostGraducation();
		j.displayJob();
	}
}