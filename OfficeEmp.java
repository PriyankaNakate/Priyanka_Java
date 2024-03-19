import java.util.Scanner;
class OfficeEmp
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter emp monthly salary : ");
		double sal = sc.nextDouble();
		System.out.print("Enter emp age : ");
		int age = sc.nextInt();
		double gratituty = 0;
		double returnAmount =0;
		if(age>58)
		{
			gratituty = (sal*12)+(sal/2);
			System.out.println("Emp get gratituty of Rs. : "+gratituty+" for his retirement");
		}
		else 
		{
			System.out.print("Emp is on the work (yes/no) : ");
			String onWork = sc.next().toLowerCase();
			if(onWork.equals("yes"))
			{
				System.out.println("Emp is on the work");
			}
			else
			{
				System.out.print("Enter emp leaving status (RESIGN/FIRED) : ");
				String status = sc.next().toUpperCase();
				if(status.equals("RESIGN"))
				{
					returnAmount = sal*3;
					System.out.println("Emp is resigned so emp should pay amount Rs. : "+returnAmount);
				}
				else if(status.equals("FIRED"))
				{
					returnAmount = sal*2;
					System.out.println("Emp is fired so company should pay to the emp amount Rs. : "+returnAmount);
				}
				else{
					System.out.println("Invalid Reason");
				}
			}
			
		}
	}
}