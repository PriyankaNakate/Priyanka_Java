import java.util.*;
class LinkedListMethods
{
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		for(int i=10;i<50;i+=10)
		{
			list.add(i);
		}
		System.out.println(list);
		System.out.println("First Element : "+list.getFirst());
		System.out.println("Last Element : "+list.getLast());
		System.out.println("Remove 1st Element : "+list.removeFirst());
		System.out.println("remove last Element : "+list.removeLast());
		list.addFirst(100);
		System.out.println(list);
		list.addLast(100);
		System.out.println(list);
		System.out.println(list.removeFirstOccuence(20));
		System.out.println(list.removeLastOccurence(100));
	}
}