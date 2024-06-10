class ArrayUsingLoop
{
	public static void main(String[] args) {
		int a [] = {10,20,30,40,50};
		System.out.println("Using for loop : ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("Using while loop : ");
		int i = 0;
		while(i<=a.length-1)
		{
			System.out.println(a[i++]);
		}
		
		System.out.println("Using do while loop : ");
		i=0;
		do
		{
			System.out.println(a[i]);
			i++;
		}while(i<a.length);

		System.out.println("Using Foreach : ");
		for(int j : a){
			System.out.println(j);
		}
	}
}