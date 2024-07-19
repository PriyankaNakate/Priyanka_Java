import java.util.*;
class UserStack
{
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		System.out.println(s.empty());
		for(int i=1;i<=10;i++)
		{
			s.push(i);
		}
		System.out.println(s);
		System.out.println(s.empty());
		s.push(11);
		s.push(12);
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s);
		s.pop();
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s);
		System.out.println(s.search(50));
		System.out.println(s.search(7));
		int offset= s.search(4);
		System.out.println(offset);

		// Stack<E> s = new Stack<>();
		// System.out.println(s.empty());
		// s.push(10);
		// s.push(20);
		// s.push("Hello");
		// s.push("Hii");
		// s.push("bye");
		// System.out.print(s);
	}
}