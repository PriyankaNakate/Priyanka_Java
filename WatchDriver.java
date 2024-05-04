class Watch
{
		String brand;
		String modelNumber;
		String quality;
		double price;
		String color;
		String type;
		double weight;

		public void displayWatch()
		{
			System.out.println("**** Watch Details ****");
			System.out.println("Brand : "+brand);
			System.out.println("Model Number : "+modelNumber);
			System.out.println("Price : "+price);
			System.out.println("Quality : "+quality);
			System.out.println("Color : "+color);
			System.out.println("Type :"+type);
			System.out.println("Weight : "+weight+"gm");
		}
}

class WatchDriver
{
	public static void main(String[] args) {
		Watch obj = new Watch();
		obj.brand = "Fastrack";
		obj.modelNumber = "W864b";
		obj.price = 12000;
		obj.quality = "waterProof";
		obj.color = "Silver";
		obj.type = "SmartWatch";
		obj.weight = 500;
		obj.displayWatch();

		Watch obj1 = new Watch();
		obj1.brand = "Titan";
		obj1.modelNumber = "W864b";
		obj1.price = 15000;
		obj1.quality = "waterProof";
		obj1.color = "Golden";
		obj1.type = "SmartWatch";
		obj1.weight = 700;
		obj1.displayWatch();

	}
}