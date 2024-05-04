import java.util.Scanner;
class Account
{
	private String accountHolderName;
	private String address;
	private long phoneNumber;
	private long aadharNumber;
	private String panNumber;
	private int upiPin;
	private double balance;

	Account(String accountHolderName,String address,long phoneNumber,long aadharNumber,String panNumber,int upiPin,double balance)
	{
		this.accountHolderName = accountHolderName;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.aadharNumber = aadharNumber;
		this.panNumber = panNumber;
		this.upiPin = upiPin;
		this.balance = balance;
	}

	void displayDetails(){
		System.out.println("**Account Details**");
		System.out.println("Name : "+accountHolderName);
		System.out.println("address : "+address);
		System.out.println("phoneNumber : "+phoneNumber);
		System.out.println("aadharNumber : "+aadharNumber);
		System.out.println("panNumber : "+panNumber);
		System.out.println("upiPin: "+upiPin);
		System.out.println("balance : "+balance);
	}
	
	public String getAccountHolderName(){
		return accountHolderName;
	}

	public void setAccountHolderName(String name){
		accountHolderName = name;
	}

	public String getAddress(){
		return address;
	}

	public void setAddress(String updateAddress){
		address = updateAddress;
	}

	public long getPhoneNumber(){
		return phoneNumber;
	}

	public void setPhoneNumber(long mobileNo){
		phoneNumber = mobileNo;
	}

	public long getAdharNumber(){
		return aadharNumber;
	}

	public String getPanNumber(){
		return panNumber;
	}

	public int getUpiPin(){
		return upiPin;
	}

	public void setUpiPin(int updatePin){
		upiPin = updatePin;
	}

	public double getBalance(){
		return balance;
	}

	public void setBalance(double updateBalance){
		balance = updateBalance;
	}
}
 
class BankService
{
	static String accountHolderName;
	static String address;
	static long phoneNumber;
	static long aadharNumber;
	static String panNumber;
	static int upiPin;
	static double balance;
	Account obj = null;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for( ; ; )
		{
			System.out.println();
			System.out.println("***WELCOME TO BANKSERVICE***");
			System.out.println("1.Create Account");
			System.out.println("2.Exiting User");
			System.out.print("Enter a option : ");
			int option = sc.nextInt();
			switch(option)
			{
				case 1 : {
					BankService obj = new BankService();
					obj.createAccount();
					break;
				}

				case 2 : {
					BankService obj = new BankService();
					obj.existingUser();
					break;
				}

				default : System.out.println("Invalid option");
			}
		}
	}

	public static void acceptAccountantDetails(){
		System.out.println();
		System.out.println("***Create New Account***");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name : ");
		accountHolderName = sc.nextLine();
		System.out.print("Enter address : ");
		address = sc.nextLine();
		System.out.print("Enter phoneNumber : ");
		phoneNumber = sc.nextLong();
		System.out.print("Enter aadharNumber : ");
		aadharNumber = sc.nextLong();
		System.out.print("Enter panNumber : ");
		panNumber = sc.nextLine();
		sc.nextLine();
		System.out.print("Enter upiPin : ");
		upiPin = sc.nextInt();
		System.out.print("Enter balance : ");
		balance = sc.nextDouble();
	}

	public void createAccount(){
		acceptAccountantDetails();
		obj = new Account(accountHolderName,address,phoneNumber,aadharNumber,panNumber,upiPin,balance);
		System.out.println("Account Created successfully");
		System.out.println();
		// obj.displayDetails();
	}

	public void existingUser(){
		for( ; ;)
		{
			System.out.println();
			Scanner sc = new Scanner(System.in);
			System.out.println("*** Bank Services***");
			System.out.println("1.Check Balance");
			System.out.println("2.Deposite Amount");
			System.out.println("3.Withdraw Amount");
			System.out.println("4.Update Account");
			System.out.println("5.User Info");
			System.out.println("6.Logout");
			System.out.print("Enter option : ");
			int option = sc.nextInt();
			switch(option)
			{
				case 1 : {
					System.out.println("**check balance**");
					BankService obj = new BankService();
					obj.checkBalace();
					break;
				}

				case 2 : {
					System.out.println("**Deposite amount**");
					BankService obj = new BankService();
					obj.depositeAmount();
					break;
				}

				case 3 : {
					System.out.println("**Withdraw amount**");
					BankService obj = new BankService();
					obj.withdrawAmount();
					break;
				}

				case 4 : {
					System.out.println();
					System.out.println("**Update Account**");
					System.out.println("1.AccountHolderName");
					System.out.println("2.Address");
					System.out.println("3.upiPin");
					System.out.println("4.phoneNumber");
					// Scanner sc = new Scanner(System.in);
					System.out.print("Enter a option : ");
					int opt = sc.nextInt();
					switch(opt)
					{
						case 1 :{
							System.out.println();
							System.out.println("**update AccountHolderName**");
							obj = new Account(accountHolderName,address,phoneNumber,aadharNumber,panNumber,upiPin,balance);
							sc.nextLine();
							System.out.print("Enter correct name for update : ");
							String updateName = sc.nextLine();
							obj.setAccountHolderName(updateName);
							System.out.println(obj.getAccountHolderName());
							break;
						} 
						case 2 :{
							System.out.println();
							System.out.println("**update Address**");
							obj = new Account(accountHolderName,address,phoneNumber,aadharNumber,panNumber,upiPin,balance);
							sc.nextLine();
							System.out.print("Enter updated address : ");
							String address = sc.nextLine();
							obj.setAddress(address);
							System.out.println(obj.getAddress());
							break;
						} 
						case 3 :{
							System.out.println();
							System.out.println("**update upiPin**");
							obj = new Account(accountHolderName,address,phoneNumber,aadharNumber,panNumber,upiPin,balance);
							sc.nextLine();
							System.out.print("Enter upiPin for update : ");
							int pin = sc.nextInt();
							obj.setUpiPin(pin);
							System.out.println(obj.getUpiPin());
							break;
						} 
						case 4 :{
							System.out.println();
							System.out.println("**update phoneNumber**");
							obj = new Account(accountHolderName,address,phoneNumber,aadharNumber,panNumber,upiPin,balance);
							sc.nextLine();
							System.out.print("Enter updated phoneNumber : ");
							long mobileNo = sc.nextLong();
							obj.setPhoneNumber(mobileNo);
							System.out.println(obj.getPhoneNumber());
							break;
						}
						default : System.out.println("Invalid option");
					}
					break;
				}

				case 5 : {
					System.out.println();
					System.out.println("**User Info**");
					// obj = new Account(accountHolderName,address,phoneNumber,aadharNumber,panNumber,upiPin,balance);
					obj.displayDetails();
					break;
				}

			case 6 : {
					System.out.println("**logout successfully**");
					System.exit(0);
					break;
				}

				default : System.out.println("Invalid user");
			}
		}
	}

	void checkBalace(){
		obj = new Account(accountHolderName,address,phoneNumber,aadharNumber,panNumber,upiPin,balance);
		// System.out.println(obj.getBalance());
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a upiPin : ");
		int pin = sc.nextInt();
		if(obj.getUpiPin() == pin)
			System.out.println("Your account balance is : "+obj.getBalance());
		else
			System.out.println("You entered wrong pin");
	}

	void depositeAmount(){
		obj = new Account(accountHolderName,address,phoneNumber,aadharNumber,panNumber,upiPin,balance);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Deposite Amount : ");
		double depoAmount = sc.nextDouble();
		balance = obj.getBalance() + depoAmount; 
		System.out.println("Total amount after deposite : "+ balance);
	}

	void withdrawAmount(){
		obj = new Account(accountHolderName,address,phoneNumber,aadharNumber,panNumber,upiPin,balance);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a withdrawAmount Amount : ");
		double withdrawAmount = sc.nextDouble();
		balance = obj.getBalance() - withdrawAmount;
		System.out.println("Total amount after deposite : "+ balance);
	}
}