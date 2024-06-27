import java.util.*;
class ArrayFruitStore
{
	String fruits[];
	static Scanner sc = new Scanner(System.in);
	public void storeFruits(String fruits[]){
		System.out.print("Enter fruits for storing : ");
		this.fruits = fruits;
		for(int i=0;i<fruits.length;i++)
		{
			fruits[i] = sc.next();
		}
		System.out.println("fruits are stored successfully in array");
	}

	public void displayFruits(){
		System.out.println("fruits are : ");
		System.out.println(Arrays.toString(fruits));
	}

	public void changeFruit(){
		System.out.print("Enter fruit for matches : ");
		String inputFruit = sc.next();
		int frtCnt = 0;
		for(int i=0;i<fruits.length;i++)
		{
			if(inputFruit.equals(fruits[i]))
			{
				System.out.println("Fruit Matches");
				System.out.print("Enter new fruit for update : ");
				String newFruit = sc.next();
				fruits[i] = newFruit;
				frtCnt++;
				System.out.println("fruits are updated");
				break;
			}
		}
		if(frtCnt==0){
			System.out.println("Fruit not present in array so we cannot replace it");
		}
	}

	public static void main(String[] args) {
		System.out.println("You want to create an array to store fruits : 1.yes 2.no");
		int option = sc.nextInt();
		ArrayFruitStore obj = new ArrayFruitStore();
		switch(option)
		{
			case 1 : {
				System.out.print("Enter an array size : ");
				int size = sc.nextInt();
				String fruits[] = new String[size];
				features : 
				for(;;){
					System.out.println();
					System.out.println("***Operations on Array(fruits)***");
				System.out.println("1.Store fruits");
				System.out.println("2.Display fruits");
				System.out.println("3.Change fruit");
				System.out.println("4.Exit");
				System.out.print("Which opration you want to perform : ");
				int operation = sc.nextInt();
				switch(operation)
				{
					case 1 : {
						System.out.println();
						System.out.println("***store fruits***");
						obj.storeFruits(fruits);
						break;
					}
					case 2 : {
						System.out.println();
						System.out.println("***display fruits***");
						if(obj.fruits==null)
						{
							System.out.println("first store the fruits for display");
						}
						else{
							obj.displayFruits();
						}
						break;
					}
					case 3 : {
						System.out.println();
						System.out.println("***update fruits***");
						if(obj.fruits==null)
						{
							System.out.println("first store the fruits for update");
						}
						else{
							obj.changeFruit();
						}
						break;
					}
					case 4 : {
						System.out.println("***Exit successfully***");
						System.exit(0);
					}

					default : System.out.println("Invalid option");
				}
				}
				//break;
			}
			case 2 : {
				System.exit(0);
			}
			default : System.out.println("Invalid option");
		}
		// System.out.print("Enter array size : ");
		// int size = sc.nextInt();

		// String fruits[] = new String[size]; 

		// ArrayFruitStore obj = new ArrayFruitStore();
		// obj.storeFruits(fruits);
		// obj.displayFruits();
		// obj.changeFruit();
		// obj.displayFruits();
	}
}