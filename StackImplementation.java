import java.util.*;
class StackArray
{
	int [] a = new int[10];
	int index =0;
	public int push(int i)
	{
		a[index++] = i;
		return i;
	}

	public int pop()
	{
		return a[a.length-1];
	}

	public int peek()
	{
		return a[a.length-1];
	}

	public boolean empty()
	{
		if(a.length==0)
		{
			return true;
		}
		else{
			return false;
		}
	}

	public int search(int i)
	{
		for(int j=a.length-1,offset=1;j>=0;j--,offset++)
		{
			if(i==(a[j]))
				return offset;
		}
		return -1;
	}

	// public String toString()
	// {
	// 	return a.toString();
	// }

}

public class StackImplementation
{
	public static void main(String[] args) {
		UserStack stack = new UserStack();
		StackArray stackArr = new StackArray();
		for(int i=10;i<=50;i+=10)
		{
			stack.push(i);
		}
		System.out.println(stack);
		System.out.println(60);
		System.out.println(70);
		System.out.println(stack);

		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack);
		System.out.print(stack.empty());
		System.out.println(stack.search(70));
		System.out.println(stack.search(10));
	}
}