class Developer
{
	String developerType;
	String developerExp;
	String designation;
	String qualification;
	String companyName;
	double salary;
	String jobLocation;

	Developer(String developerType,String developerExp,String designation,String qualification,String companyName,double salary,String jobLocation)
	{
		this.developerType = developerType;
		this.developerExp = developerExp;
		this.designation = designation;
		this.qualification = qualification;
		this.companyName = companyName;
		this.salary = salary;
		this.jobLocation = jobLocation;
	}

	public void displayDeveloper(){
		System.out.println();
		System.out.println("**Developer Details**");
		System.out.println("Developer Type : "+developerType);
		System.out.println("Developer Experience : "+developerExp);
		System.out.println("Designation : "+designation);
		System.out.println("Qualification : "+qualification);
		System.out.println("Company Name : "+companyName);
		System.out.println("Salary : "+salary);
		System.out.println("Job Location : "+jobLocation);
	}
}

class Frontend extends Developer
{
	String [] technologies;
	boolean haveAnyCertification;

	Frontend(String [] technologies,boolean haveAnyCertification,String developerType,String developerExp,String designation,String qualification,String companyName,double salary,String jobLocation)
	{
		super(developerType,developerExp,designation,qualification,companyName,salary,jobLocation);
		this.technologies = technologies;
		this.haveAnyCertification = haveAnyCertification;
	}

	public void displayFrontend(){
		System.out.println();
		System.out.println("**Frontend Developer Details**");
		System.out.println("Technologies : "+Arrays.toString(this.technologies));
		System.out.println("Do you did any Certification Course : "+haveAnyCertification);
	}
}

class DeveloperDriver
{
	public static void main(String[] args) {
		String [] technologies = {"1.Html","2.CSS","3.JS","4.React JS","5.Angular"};
		Frontend f = new Frontend(technologies,true,"Frontend","Fresher(0)","Frontend designer","Btech","Qspider",35000,"Pune");
		f.displayFrontend();
		f.displayDeveloper();
	}
}