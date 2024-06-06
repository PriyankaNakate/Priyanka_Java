class CarDriverException
{
	static CarException c;
	public static void main(String[] args) {
		System.out.println("main starts");
		try{
			CarDriverException.c.key = true;
			CarDriverException.c.startCar(CarDriverException.c.key);
		}
		catch(Exception e){
			e.printStackTrace();

			try{
				CarException c = new CarException();
				c.key=true;
				c.startCar(c.key);
			}
			catch(Exception e2){
				e2.printStackTrace();
			}
		}
		System.out.println("main ends");
	}
}