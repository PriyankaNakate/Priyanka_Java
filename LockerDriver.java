import  java.util.Scanner;
class LockerDriver
{
	static Locker l;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("want to open door ?");
		boolean key = sc.nextBoolean();
		try{
			Locker l = new Locker();
			if(key==true){
				l.unlock();
			}
			else if(key==false){
				l.lock();
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}