class Car
{
	String brand;
	String model;
	String type;
	double price;
	int seatingCapacity;
	Engine engine = new Engine(120,1.2,"petrol",16,4);

	Car(String brand,String model,String type,double price,int seatingCapacity)
	{
		this.brand = brand;
		this.model = model;
		this.type = type;
		this.price = price;
		this.seatingCapacity = seatingCapacity;
	}

	public void displayCar(){
		System.out.println();
		System.out.println("**Car Details**");
		System.out.println("brand : "+this.brand);
		System.out.println("model : "+this.model);
		System.out.println("type : "+this.type);
		System.out.println("price : "+this.price);
		System.out.println("seatingCapacity : "+this.seatingCapacity);
	}
}