import java.util.*;
class ProgrammingLanguage
{
	String type;
	String level;
	int inventedYear;
	String founderName;
	double latestVersion;
	String extension;

	ProgrammingLanguage(String type,String level,int inventedYear,String founderName,double latestVersion,String extension)
	{
		this.type = type;
		this.level = level;
		this.inventedYear = inventedYear;
		this.founderName = founderName;
		this.latestVersion = latestVersion;
		this.extension = extension;
	}

	public void displayProgrammingLanguage(){
		System.out.println();
		System.out.println("**Programming Language Details**");
		System.out.println("Type : "+type);
		System.out.println("Level : "+level);
		System.out.println("Invented Year : "+inventedYear);
		System.out.println("Founder Name : "+founderName);
		System.out.println("Latest Version : JDK "+latestVersion);
		System.out.println("Extension : "+extension);
	}
}

class Java extends ProgrammingLanguage
{
	String [] features;
	boolean isPlatformIndependent;

	Java(String [] features,boolean isPlatformIndependent,String type,String level,int inventedYear,String founderName,double latestVersion,String extension)
	{
		super(type,level,inventedYear,founderName,latestVersion,extension);
		this.features = features;
		this.isPlatformIndependent = isPlatformIndependent;
	}

	public void displayJava(){
		System.out.println();
		System.out.println("**Java Details**");
		System.out.println("It is Platform Independent : "+isPlatformIndependent);
		System.out.println("features of java : "+Arrays.toString(this.features));
	}
}

class SingleLevelDriver
{
	public static void main(String[] args) {
		String [] features = {"1.Multithreaded","2.Secure & robust","3.Portable","4.Dynamic(strong memory management)"};
		Java j = new Java(features,true,"Object Oriented","High Level",1991,"James Gosling",1.22,".java");
		j.displayProgrammingLanguage();
		j.displayJava();
	}
}
