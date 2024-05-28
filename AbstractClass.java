abstract class RBI
{
	abstract void rateOfInterst();
	abstract void withdrawLimit();
	abstract void depositeLimit();
}

abstract class SBI extends RBI
{
	String userName;
	String accountType;
	SBI(String userName,String accountType)
	{
		this.userName = userName;
		this.accountType = accountType;
	}

	public void displayAccountDetails(){
		System.out.println();
		System.out.println("**Account Details**");
		System.out.println("Account Type : "+this.accountType);
		System.out.println("userName : "+this.userName);
	}
}

class Saving extends SBI
{
	Saving(String userName,String accountType){
		super(userName,accountType);
	}
	void rateOfInterst(){
		System.out.println("rateOfInterst is 8.5% for saving account");
	}

	void withdrawLimit(){
		System.out.println("withdrawLimit is 50000 for saving account");
	}

	void depositeLimit(){
		System.out.println("deposite limit is 100000 for saving account");
	}
}

class Current extends SBI
{
	Current(String userName,String accountType){
		super(userName,accountType);
	}
	void rateOfInterst(){
		System.out.println("rateOfInterst is 7% for current account");
	}

	void withdrawLimit(){
		System.out.println("withdrawLimit is 500000 for current account");
	}

	void depositeLimit(){
		System.out.println("deposite limit is 1000000 for current account");
	}
}

class AbstractClass
{
	public static void main(String[] args) {
		Saving obj = new Saving("Priyanka","Saving");
		obj.displayAccountDetails();
		obj.rateOfInterst();
		obj.depositeLimit();
		obj.withdrawLimit();

		Current obj1 = new Current("Prakriti","current");
		obj1.displayAccountDetails();
		obj1.rateOfInterst();
		obj1.depositeLimit();
		obj1.withdrawLimit();
	}
}