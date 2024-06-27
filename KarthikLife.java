class KarthikGfException extends Exception
{
	KarthikGfException(String message)
	{
		super(message);
	}
}
class KarthikLife
{
	public static void main(String[] args) {
		String gf = "";
		String wife = "kartiki";

		// if(gf.isEmpty())
		// {
		// 	try{
		// 		throw new KarthikGfException("Karthik not have a girl frd");
		// 	} 
		// 	catch(KarthikGfException k)
		// 	{
		// 		k.printStackTrace();
		// 	}
		// }
		// else{
		// 	System.out.println("Karthik wife name is : "+wife);
		// }

		if(gf.isEmpty())
		{
			try{
				throw new KarthikGfException("Karthik not have a girl frd");
			} 
			catch(KarthikGfException k)
			{
				k.printStackTrace();
				if(wife.isEmpty())
				{
					System.out.println("karthik does not have wife");
				}
				else{
					System.out.println("Karthik wife name is : "+wife);
				}
			}
		}
	}
}