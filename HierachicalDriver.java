class TraditionalWear
{
	String type;
	double price;
	String traditional;
	String color;

	TraditionalWear(String type,double price,String traditional,String color)
	{
		this.type = type;
		this.price = price;
		this.traditional = traditional;
		this.color = color;
	}

	void displayTraditinalWear(){
		System.out.println();
		System.out.println("**TraditionalWear Details**");
		System.out.println("Type : "+type);
		System.out.println("Price : "+price);
		System.out.println("Traditional : "+traditional);
		System.out.println("Color : "+color);
	}
}

class Saree extends TraditionalWear
{
	String category;
	String length;

	Saree(String category,String length,String type,double price,String traditional,String color)
	{
		super(type,price,traditional,color);
		this.category = category;
		this.length = length;
	}

	void displaySaree(){
		System.out.println();
		System.out.println("category : "+category);
		System.out.println("length : ");
	}
}

class Salvaar extends TraditionalWear
{
	String category;
	boolean isStiched;

	Salvaar(String category,boolean isStiched,String type,double price,String traditional,String color)
	{
		super(type,price,traditional,color);
		this.category = category;
		this.isStiched = isStiched;
	}

	void displaySalvaar(){
		System.out.println();
		System.out.println("**Salvaar Details**");
		System.out.println("category : "+category);
		System.out.println("isStiched : "+isStiched);
	}
}

class Lehnga extends TraditionalWear
{
	String category;
	String material;
	String stichType;

	Lehnga(String category,String material,String stichType,String type,double price,String traditional,String color)
	{
		super(type,price,traditional,color);
		this.category = category;
		this.material = material;
		this.stichType = stichType;
	}

	void displayLehnga(){
		System.out.println();
		System.out.println("**Lehnga Details**");
		System.out.println("category : "+category);
		System.out.println("Material : "+material);
		System.out.println("stichType : "+stichType);
	}
}

class HierachicalDriver
{
	public static void main(String[] args) {
		Lehnga l = new Lehnga("Designer","net","semi-stiched","dupta-wear",20000,"Indian","orange");
		l.displayLehnga();
		l.displayTraditinalWear();

		Saree s = new Saree("Paithni","Navvari","bandhani",10000,"Indian","Green");
		s.displaySaree();
		s.displayTraditinalWear();
	}
}