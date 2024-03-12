import java.util.Scanner;
class MinuteToYear
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of minutes : ");
		long minutes = sc.nextLong();
		long minutesInDay = 24*60l;
		// long minutesInYear = 365*24*60l;
		System.out.println("Total days in entered minutes : "+minutes/minutesInDay);
		long year = (minutes/minutesInDay)/365;
		System.out.println(minutes+" minutes is approximately "+year+" years and "+(minutes/minutesInDay)%365+" days");
	}
}