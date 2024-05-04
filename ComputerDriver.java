class Computer
{
	String brand;
	String modelNumber;
	double price;
	String type;
	CPU cpu = new CPU(8,512,"i7");
	Monitor monitor = new Monitor(15,"LED","3840 x 2160");
	Mouse mouse;
	Keyboard keyboard;
	Camera camera;
	Speaker sp;
	Printer pr;

	Computer(String brand,String modelNumber,double price,String type)
	{
		this.brand = brand;
		this.modelNumber = modelNumber;
		this.price = price;
		this.type = type;
	}

	public void displayComputer(){
		System.out.println();
		System.out.println("**Computer Details**");
		System.out.println("Brand : "+brand);
		System.out.println("modelNumber : "+modelNumber);
		System.out.println("Price : "+price);
		System.out.println("Type : "+type);
	}

	public void createInstanceOfMouse(String brand,String type,int noOfButtons,boolean isScrollable){
		mouse = new Mouse(brand,type,noOfButtons,isScrollable);
	}

	public void createInstanceOfKeyboard(String brand,String type,int noOfKeys,boolean backLight){
		keyboard = new Keyboard(brand,type,noOfKeys,backLight);
	}

	public void createInstanceOfCamera(int frameRate,double quality,boolean motionSensing){
		camera = new Camera(frameRate,quality,motionSensing);
	}

	public void createInstanceOfSpeaker(String brand,String type,int noOfSpeaker,int watt){
		sp = new Speaker(brand,type,noOfSpeaker,watt);
	}

	public void createInstanceOfPrinter(String brand,String type,int printCapacity){
		pr = new Printer(brand,type,printCapacity);
	}
}

class CPU
{
	int ram;
	int rom;
	String processor;

	CPU(int ram,int rom,String processor)
	{
		this.ram = ram;
		this.rom = rom;
		this.processor = processor;
	}

	public void displayCPU(){
		System.out.println();
		System.out.println("**CPU Details**");
		System.out.println("RAM : "+ram);
		System.out.println("ROM : "+rom);
		System.out.println("Processor : "+processor);
	}
}

class Monitor
{
	double size;
	String displayType;
	String resolution; 

	Monitor(double size,String displayType,String resolution)
	{
		this.size = size;
		this.displayType = displayType;
		this.resolution = resolution;
	}

	public void displayMonitor(){
		System.out.println();
		System.out.println("**Monitor Details**");
		System.out.println("Size : "+size);
		System.out.println("displayType : "+displayType);
		System.out.println("Resolution : "+resolution);
	}
}

class Mouse
{
	String brand;
	String type;
	int noOfButtons;
	boolean isScrollable;

	Mouse(String brand,String type,int noOfButtons,boolean isScrollable)
	{
		this.brand = brand;
		this.type = type;
		this.noOfButtons = noOfButtons;
		this.isScrollable = isScrollable;
	}

	public void displayMouse(){
		System.out.println();
		System.out.println("**Mouse Details**");
		System.out.println("Brand : "+brand);
		System.out.println("Type : "+type);
		System.out.println("noOfButtons : "+noOfButtons);
		System.out.println("isScrollable : "+isScrollable);
	}
}

class Keyboard
{
	String brand;
	String type;
	int noOfKeys;
	boolean backLight;

	Keyboard(String brand,String type,int noOfKeys,boolean backLight)
	{
		this.brand = brand;
		this.type = type;
		this.noOfKeys = noOfKeys;
		this.backLight = backLight;
	}

	public void displayKeyboard(){
		System.out.println();
		System.out.println("**Keyboard Details**");
		System.out.println("Brand : "+brand);
		System.out.println("Type : "+type);
		System.out.println("noOfKeys : "+noOfKeys);
		System.out.println("backLight : "+backLight);
	}
}

class Camera
{
	int frameRate; //30frames/sec
	double quality; //2.07megapixel
	boolean motionSensing;

	Camera(int frameRate,double quality,boolean motionSensing)
	{
		this.frameRate = frameRate;
		this.quality = quality;
		this.motionSensing = motionSensing;
	}

	public void displayCamera(){
		System.out.println();
		System.out.println("**Camera Details**");
		System.out.println("frameRate : "+frameRate);
		System.out.println("Quality : "+quality);
		System.out.println("motionSensing : "+motionSensing);
	}
}

class Speaker
{
	String brand;
	String type;
	int noOfSpeaker;
	int watt; //35(the amount power that speaker can handle)

	Speaker(String brand,String type,int noOfSpeaker,int watt)
	{
		this.brand = brand;
		this.type = type;
		this.noOfSpeaker = noOfSpeaker;
		this.watt = watt;
	}

	public void displaySpeaker(){
		System.out.println();
		System.out.println("**Speaker Details**");
		System.out.println("Brand : "+brand);
		System.out.println("type : "+type);
		System.out.println("noOfSpeaker : "+noOfSpeaker);
		System.out.println("Watt : "+watt);
	}
}

class Printer
{
	String brand;
	String type;
	int printCapacity;

	Printer(String brand,String type,int printCapacity)
	{
		this.brand = brand;
		this.type = type;
		this.printCapacity = printCapacity;
	}

	public void displayPrinter(){
		System.out.println();
		System.out.println("**Printer Details**");
		System.out.println("Brand : "+brand);
		System.out.println("type : "+type);
		System.out.println("printCapacity : "+printCapacity);
	}
}

class ComputerDriver
{
	public static void main(String[] args) {
		Computer c = new Computer("HP","HP123",70000,"Gaming");
		c.displayComputer();
		c.cpu.displayCPU();
		c.monitor.displayMonitor();
		c.createInstanceOfMouse("Lamzu Atlantis","wireless",3,true);
		c.mouse.displayMouse();
		c.createInstanceOfKeyboard("Logitech","Gaming Keyboard",104,true);
		c.keyboard.displayKeyboard();
		c.createInstanceOfCamera(30,2.07,true);
		c.camera.displayCamera();
		c.createInstanceOfSpeaker("Sonos","Era300",6,35);
		c.sp.displaySpeaker();
		c.createInstanceOfPrinter("Canon","Pixma",3000);
		c.pr.displayPrinter();
	}
}