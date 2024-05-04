class Laptop
{
		String brand;
		String modelNumber;
		double price;
		int ram;
		int rom;
		String processor;
		String type;

		public void displayLaptop()
		{
			System.out.println("**** Laptop Details ****");
			System.out.println("Brand : "+brand);
			System.out.println("Model Number : "+modelNumber);
			System.out.println("Price : "+price);
			System.out.println("RAM : "+ram+"gb");
			System.out.println("ROM : "+rom+"gb");
			System.out.println("Processor : "+processor);
			System.out.println("Type :"+type);
		}
}

class LaptopDriver
{
	public static void main(String[] args) {
		Laptop obj = new Laptop();
		obj.brand = "HP";
		obj.modelNumber = "HP1234i";
		obj.price = 50000;
		obj.ram = 8;
		obj.rom = 512;
		obj.processor = "i7";
		obj.type = "Gaming";
		obj.displayLaptop();

		Laptop obj1 = new Laptop();
		obj1.brand = "HP";
		obj1.modelNumber = "HP1234i";
		obj1.price = 70000;
		obj1.ram = 16;
		obj1.rom = 1024;
		obj1.processor = "i9";
		obj1.type = "Gaming";
		obj1.displayLaptop();

	}
}