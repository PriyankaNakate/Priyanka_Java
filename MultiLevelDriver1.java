import java.util.*;
class JDK
{
	String latestVersion;
	int totalAvailableVersion;
	int releasedDate;
	boolean isPlatformIndependent;
	String vendor;  //"Oracle Corporation"

	JDK(String latestVersion,int totalAvailableVersion,int releasedDate,boolean isPlatformIndependent,String vendor)
	{
		super();
		this.latestVersion = latestVersion;
		this.totalAvailableVersion = totalAvailableVersion;
		this.releasedDate = releasedDate;
		this.isPlatformIndependent = isPlatformIndependent;
		this.vendor = vendor;
	}

	void displayJDK(){
		System.out.println();
		System.out.println("**JDK Details**");
		System.out.println("latestVersion : "+latestVersion);
		System.out.println("totalAvailableVersion : "+totalAvailableVersion);
		System.out.println("releasedDate : "+releasedDate);
		System.out.println("isPlatformIndependent : "+isPlatformIndependent);
		System.out.println("vendor : "+vendor);
	}
}

class JRE extends JDK
{
	String architecture; //x86_64
	String headlessMode; //false

	JRE(String architecture,String headlessMode,String latestVersion,int totalAvailableVersion,int releasedDate,boolean isPlatformIndependent,String vendor)
	{
		super(latestVersion,totalAvailableVersion,releasedDate,isPlatformIndependent,vendor);
		this.architecture = architecture;
		this.headlessMode = headlessMode;
	}

	void displayJRE(){
		System.out.println();
		System.out.println("**JRE Details**");
		System.out.println("architecture : "+architecture);
		System.out.println("headlessMode : "+headlessMode);
	}
}

class JVM extends JRE
{
	String type; //HotSpot
	boolean debugMode; //false
	int maxHeapSizeMB; //represents the maximum heap size allocated to the jvm in megabytes
	int maxThreadCount; //reprents the maximum no. of threads the jvm can create

	JVM(String type,boolean debugMode,int maxHeapSizeMB,int maxThreadCount,String architecture,String headlessMode,String latestVersion,int totalAvailableVersion,int releasedDate,boolean isPlatformIndependent,String vendor)
	{
		super(architecture,headlessMode,latestVersion,totalAvailableVersion,releasedDate,isPlatformIndependent,vendor);
		this.type = type;
		this.debugMode = debugMode;
		this.maxHeapSizeMB = maxHeapSizeMB;
		this.maxThreadCount = maxThreadCount;
	}

	void displayJVM(){
		System.out.println();
		System.out.println("**JVM Details**");
		System.out.println("Type : "+type);
		System.out.println("debugMode : "+debugMode);
		System.out.println("maxHeapSizeMB : "+maxHeapSizeMB);
		System.out.println("maxThreadCount : "+maxThreadCount);
	}
}

class JIT extends JVM
{
	String name; //HotSpot,GraalVM
	String version;
	String [] components;

	JIT(String name,String version,String [] components,String type,boolean debugMode,int maxHeapSizeMB,int maxThreadCount,String architecture,String headlessMode,String latestVersion,int totalAvailableVersion,int releasedDate,boolean isPlatformIndependent,String vendor)
	{
		super(type,debugMode,maxHeapSizeMB,maxThreadCount,architecture,headlessMode,latestVersion,totalAvailableVersion,releasedDate,isPlatformIndependent,vendor);
		this.name = name;
		this.version = version;
		this.components = components;
	}

	void displayJIT(){
		System.out.println();
		System.out.println("**JIT Details**");
		System.out.println("Name : "+name);
		System.out.println("version : "+version);
		System.out.println("Components : "+Arrays.toString(components));
	}
}

class MultiLevelDriver1
{
	public static void main(String[] args) {
		String [] components = {"1.code optimizer","2.target code generator","3.intermediate code genertor","4.profiler"};
		JIT jit = new JIT("GraalVM","JIT-2",components,"HotSpot",false,192,256,"x86_64","false","JDK-1.22",22,1996,false,"Oracle Corporation");
		jit.displayJIT();
		jit.displayJVM();
		jit.displayJRE();
		jit.displayJDK();
	}
}