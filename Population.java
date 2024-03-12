class Population
{
	public static void main(String[] args)
	{
		long cp = 312032486;
		long secPerYear = 365*24*60*60;
		long birthPerYear = secPerYear/7;
		long deathPerYear = secPerYear/13;
		long immiPerYear = secPerYear/45;
		System.out.println("Current Population : "+cp);
		System.out.println("After 5 years population is : "+(cp+(birthPerYear-deathPerYear+immiPerYear)*5));
	}
}