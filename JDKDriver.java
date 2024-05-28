import java.util.*;
class JDK
{
	String latestVersion;
	int availableVersion;
	int releasedDate;
	boolean isPlatformIndependent;
	String vendor;

	JDK(String latestVersion,int availableVersion,int releasedDate,boolean isPlatformIndependent,String vendor)
	{
		super();
		this.latestVersion = latestVersion;
		this.availableVersion = availableVersion;
		this.releasedDate = releasedDate;
		this.isPlatformIndependent = isPlatformIndependent;
		this.vendor = vendor;
	}

	void displayJDK(){
		System.out.println();
		System.out.println("***JDK Details***");
		System.out.println("latestVersion : "+latestVersion);
		System.out.println("availableVersion : "+availableVersion);
		System.out.println("releasedDate : "+releasedDate);
		System.out.println("isPlatformIndependent : "+isPlatformIndependent);
		System.out.println("vendor : "+vendor);
	}
}

class JRE extends JDK
{
	String architecture;
	boolean headlessMode;

	JRE(String architecture,boolean headlessMode,String latestVersion,int availableVersion,int releasedDate,boolean isPlatformIndependent,String vendor)
	{
		super(latestVersion,availableVersion,releasedDate,isPlatformIndependent,vendor);
		this.architecture = architecture;
		this.headlessMode = headlessMode;
	}

	void displayJRE(){
		System.out.println();
		System.out.println("***JRE Details***");
		System.out.println("Architecture : "+architecture);
		System.out.println("headlessMode : "+headlessMode);
	}
}

class JVM extends JRE 
{
	String type;
	boolean debugMode;
	int maxHeapSizeMB;
	int maxThreadCount;

	JVM(String type,boolean debugMode,int maxHeapSizeMB,int maxThreadCount,String architecture,boolean headlessMode,String latestVersion,int availableVersion,int releasedDate,boolean isPlatformIndependent,String vendor)
	{
		super(architecture,headlessMode,latestVersion,availableVersion,releasedDate,isPlatformIndependent,vendor);
		this.type = type;
		this.debugMode = debugMode;
		this.maxHeapSizeMB = maxHeapSizeMB;
		this.maxThreadCount = maxThreadCount;
	}

	void displayJVM(){
		System.out.println();
		System.out.println("***JVM Details***");
		System.out.println("Type : "+type);
		System.out.println("debugMode : "+debugMode);
		System.out.println("maxHeapSizeMB : "+maxHeapSizeMB);
		System.out.println("maxThreadCount : "+maxThreadCount);
	}
}

class JIT extends JVM
{
	String name;
	String version;
	String[] components;

	JIT(String name,String version,String[] components,String type,boolean debugMode,int maxHeapSizeMB,int maxThreadCount,String architecture,boolean headlessMode,String latestVersion,int availableVersion,int releasedDate,boolean isPlatformIndependent,String vendor)
	{
		super(type,debugMode,maxHeapSizeMB,maxThreadCount,architecture,headlessMode,latestVersion,availableVersion,releasedDate,isPlatformIndependent,vendor);
		this.name = name;
		this.version = version;
		this.components = components;
	}

	void displayJIT(){
		System.out.println();
		System.out.println("***JIT Details***");
		System.out.println("Name : "+name);
		System.out.println("version : "+version);
		System.out.println("JIT Components : "+Arrays.toString(components));
	}
}

class JDKDriver
{
	public static void main(String[] args) {
		String [] components = {"1.intermediate code generator","2.code optimizer","3.target code genertaor","4.profiler"};
		JIT jit = new JIT("HotSpot","JIT-2",components,"HotSpot",false,125,256,"x86_64",false,"jdk-1.22",22,1991,false,"Oracle Corporation");
		jit.displayJIT();
		jit.displayJVM();
		jit.displayJRE();
		jit.displayJDK();
	}
}