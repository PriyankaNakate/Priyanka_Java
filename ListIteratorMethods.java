import java.util.*;
class ListIteratorMethods
{
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i=10;i<=15;i++)
		{
			arr.add(i);
		}
		System.out.println("ArrayList : "+arr);

		ListIterator<Integer> iter = arr.listIterator();

		int nextNumber = iter.next();
		System.out.println("Next ele is  : "+nextNumber);

		int nextIndex = iter.nextIndex();
		System.out.println("Index of next ele  : "+nextIndex);

		boolean hasNext  = iter.hasNext();
		System.out.println("Does the array have any next element? "+hasNext);

		iter.next();
		iter.next();
		iter.next();

		int preNumber = iter.previous();
		System.out.println("Previous ele is : "+preNumber);

		int preIndex = iter.previousIndex();
		System.out.println("Index of previous ele : "+preIndex);

		boolean hasPre = iter.hasPrevious();
		System.out.println("Does the array have any previous element? "+hasPre);
	}
}