// class Vehical
// {
// 	String vehicalCategory; 
// 	String transportationType;
// 	double price;
// 	boolean isFuelType;
// 	String typeOfTransmission; //automatic transmission,maual,semi-automatic
// 	int noOfWheels;

// 	Vehical(String vehicalCategory,String transportationType,double price,boolean isFuelType,String typeOfTransmission,int noOfWheels)
// 	{
// 		this.vehicalCategory = vehicalCategory;
// 		this.transportationType = transportationType;
// 		this.price = price;
// 		this.isFuelType = isFuelType;
// 		this.typeOfTransmission = typeOfTransmission;
// 		this.noOfWheels = noOfWheels;
// 	}

// 	public void displayVehical(){
// 		System.out.println();
// 		System.out.println("**Vehical Details**");
// 		System.out.println("Vehical Category : "+vehicalCategory);
// 		System.out.println("Transportation Type : "+transportationType);
// 		System.out.println("Price : "+price);
// 		System.out.println("isFuelType : "+isFuelType);
// 		System.out.println("typeOfTransmission : "+typeOfTransmission);
// 		System.out.println("noOfWheels : "+noOfWheels);
// 	}
// }

// class Car extends Vehical
// {
// 	String brand;
// 	String model;
// 	String type;
// 	int seatingCapacity;

// 	Car(String brand,String model,String type,int seatingCapacity,String vehicalCategory,String transportationType,double price,boolean isFuelType,String typeOfTransmission,int noOfWheels)
// 	{
// 		super(vehicalCategory,transportationType,price,isFuelType,typeOfTransmission,noOfWheels);
// 		this.brand = brand;
// 		this.model = model;
// 		this.type = type;
// 		this.seatingCapacity = seatingCapacity;
// 	}

// 	public void displayCar(){
// 		System.out.println();
// 		System.out.println("**Car Details**");
// 		System.out.println("Brand : "+brand);
// 		System.out.println("Model : "+model);
// 		System.out.println("Type : "+type);
// 		System.out.println("seatingCapacity : "+seatingCapacity);
// 	}
// }

// class VehicalDriver
// {
// 	public static void main(String[] args) {
// 		Car c = new Car("Tata","nexon","suv",5,"Car","Private",900000,false,"semi-automatic",4);
// 		c.displayCar();
// 		c.displayVehical();
// 	}
// }



