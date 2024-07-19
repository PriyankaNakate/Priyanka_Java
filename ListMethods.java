import java.util.*;
class ListMethods
{
	public static void main(String[] args) {
		// List<Integer> list = Arrays.asList(10,20,30,40,50);
		// System.out.println(list);
		// list.add(3,60);
		// list.add(4,70);
		// System.out.println(list);

		ArrayList list = new ArrayList();
		Scanner sc = new Scanner(System.in);
		for(int i=1;i<=5;i++)
		{
			list.add(sc.nextInt());
		}

		// for(int i=0;i<al.size();i++)
		// {
		// 	System.out.print(al.get(i)+" ");
		// }

		System.out.println(list);
	}
}