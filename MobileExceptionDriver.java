class MobileExceptionDriver
{
	static MobileException m;
	public static void main(String[] args) {
		System.out.println("main starts");
		try{
			MobileExceptionDriver.m.playGames = true;
			MobileExceptionDriver.m.playGames(MobileExceptionDriver.m.playGames);
		}
		catch(Exception e){
			// e.printStackTrace();
			System.out.println("exception handled");

			try{
				MobileException m = new MobileException();
				m.playGames=true;
				m.playGames(m.playGames);
			}
			catch(Exception e2){
				// e2.printStackTrace();
				System.out.println("exception handled");
			}
		}
		System.out.println("main ends");
	}
}

//finally block it will execute any irrespective of any exception