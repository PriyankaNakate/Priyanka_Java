class CarException
{
	boolean key;
	public void startCar(boolean key){
		this.key = key;
		if(key==true)
		{
			System.out.println("car started");
		}
		else{
			System.out.println("car not started");
		}
	}
}