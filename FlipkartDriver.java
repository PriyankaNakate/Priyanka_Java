import java.util.Scanner;
class Payment
{
	public void findPayment(Payment obj)
	{
		if(obj instanceof GooglePay)
		{
			GooglePay obj1 = (GooglePay)obj;
			System.out.println(obj1.str);
		}
		else if(obj instanceof PhonePay)
		{
			PhonePay obj1 = (PhonePay)obj;
			System.out.println(obj1.str);
		}
		else{
			AmazonPay obj1 = (AmazonPay)obj;
			System.out.println(obj1.str);
		}
	}
}

class GooglePay extends Payment{
	String str = "GooglePay";
}
class PhonePay extends Payment{
	String str = "PhonePay";
}
class AmazonPay extends Payment{
	String str = "AmazonPay";
}

class Flipkart
{
	public void payment()
	{
		System.out.println("1.GooglePay");
		System.out.println("2.PhonePay");
		System.out.println("3.AmazonPay");
		System.out.println("4.Cash On Delivery");

		Scanner sc = new Scanner(System.in);
		System.out.print("Enetr an option : ");
		int opt = sc.nextInt();
		Payment obj = null;
		switch(opt)
		{
			case 1 : {
				obj = new GooglePay();
				obj.findPayment(obj);
				break;
			}
			case 2 : {
				obj = new PhonePay();
				obj.findPayment(obj);
				break;
			}
			case 3 : {
				obj = new AmazonPay();
				obj.findPayment(obj);
				break;
			}
			case 4 : {
				System.out.println("Keep your cash ready");
				break;
			}
			default : System.out.println("Invalid option");
		}
	}
}

class FlipkartDriver
{
	public static void main(String[] args) {
		Flipkart obj = new Flipkart();
		obj.payment();
	}
}