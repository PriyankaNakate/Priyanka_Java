import java.util.*;
class SetExample
{
	public static void main(String[] args) {
		HashSet hs =new HashSet();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(50);
		System.out.println(hs);

		HashSet hs1 = new HashSet();
		hs1.add(10);
		hs1.add(null);
		hs1.add("Hello");
		hs1.add(20);
		hs1.add(40);
		hs1.add(30);
		System.out.print(hs1);
	}
}