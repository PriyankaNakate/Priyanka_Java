import java.util.Scanner;
class MonthSwitch
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a month number : ");
		int monthNum = sc.nextInt();
		String month = null;
		switch(monthNum)
		{
			case 1 : month = "January";break;
			case 2 : month = "February";break;
			case 3 : month = "March";break;
			case 4 : month = "April";break;
			case 5 : month = "May";break;
			case 6 : month = "June";break;
			case 7 : month = "July";break;
			case 8 : month = "August";break;
			case 9 : month = "Sectember";break;
			case 10 : month = "Octomber";break;
			case 11 : month = "November";break;
			case 12 : month = "December";break;
			default : System.out.println("Invalid input");
		}
		System.out.println((month!=null)?(monthNum+" - "+month):" ");
	}
}