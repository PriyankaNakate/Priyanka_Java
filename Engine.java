class Engine
{
	double hoursePower;
	double capacityLitre;
	String engineType;
	double mileage;
	int noOfPistom;

	Engine(double hoursePower,double capacityLitre,String engineType,double mileage,int noOfPistom)
	{
		this.hoursePower = hoursePower;
		this.capacityLitre = capacityLitre;
		this.engineType = engineType;
		this.mileage = mileage;
		this.noOfPistom = noOfPistom;
	}

	public void displayEngine(){
		System.out.println();
		System.out.println("**Engine Details**");
		System.out.println("hoursePower : "+ this.hoursePower);
		System.out.println("capacityLitre : "+this.capacityLitre);
		System.out.println("engineType : "+this.engineType);
		System.out.println("mileage : "+this.mileage);
		System.out.println("noOfPistom : "+this.noOfPistom);
	}
}