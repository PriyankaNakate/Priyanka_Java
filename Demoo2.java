import java.util.Scanner;
class Demo1
{
	int num;
}

class Demoo2
{
	static Demo1 d;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try{
			System.out.println("Enter a number : ");
			Demo1 d = new Demo1();
			d.num = sc.nextInt();
			try{
				System.out.println(d.num/0);
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
		catch(Exception e1){
			e1.printStackTrace();
		}
	}
}