import java.util.*;
class LinkedHashSetExample
{
	public static void main(String[] args) {
		LinkedHashSet set = new LinkedHashSet();
		set.add(10);
		set.add(20);
		set.add("hii");
		set.add("hello");
		set.add(30);
		set.add(null);
		set.add(40);
		set.add(50);
		set.add(null);
		set.add(50);

		System.out.println(set);
	}
}