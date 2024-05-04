class Mobile
{
	String brand;
	String model;
	int ram;
	int rom;
	double price;

	Mobile(String brand, String model, int ram, int rom, double price){
		this.brand = brand;
		this.model = model;
		this.ram = ram;
		this.rom = rom;
		this.price = price;
	}
	void displayMobile(){
		System.out.println("Brand : "+brand);
		System.out.println("Model : "+model);
		System.out.println("RAM : "+ram);
		System.out.println("ROM : "+rom);
		System.out.println("Price : "+price);
	}
}

class MobileDriver
{
	public static void main(String[] args) {
		Mobile obj1 = new Mobile("Samsung","F14",6,126,13000);
		obj1.displayMobile();

		Mobile obj2 = new Mobile("Vivo","s3",4,64,12000);
		obj2.displayMobile();
	}
}