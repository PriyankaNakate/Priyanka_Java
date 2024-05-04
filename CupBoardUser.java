class CupBoard
{
	double height;
	double width;
	String doorType;
	double price;
	String color;
	double weight;
	String furniture;
	double coverArea;

	public void displayCupBoard()
	{
		System.out.println("**** Watch Details ****");
		System.out.println("height : "+height+"mm");
		System.out.println("width : "+width+"mm");
		System.out.println("Door Type : "+doorType);
		System.out.println("Price : "+price);
		System.out.println("Color : "+color);
		System.out.println("furniture :"+furniture);
		System.out.println("Weight : "+weight+"kg");
		System.out.println("Cover Area : "+coverArea+"m");
	}
}

class CupBoardUser
{
	public static void main(String[] args) {
		CupBoard obj = new CupBoard();
		obj.height = 800;
		obj.width = 1500;
		obj.price = 12000;
		obj.doorType = "DoubleDoor";
		obj.color = "gray";
		obj.furniture = "iron";
		obj.weight = 30;
		obj.coverArea = 2;
		obj.displayCupBoard();

		CupBoard obj1 = new CupBoard();
		obj1.height = 1000;
		obj1.width = 2000;
		obj1.price = 17000;
		obj1.doorType = "DoubleDoor";
		obj1.color = "brown";
		obj1.furniture = "wood";
		obj1.weight = 20;
		obj1.coverArea = 2;
		obj1.displayCupBoard();

	}
}