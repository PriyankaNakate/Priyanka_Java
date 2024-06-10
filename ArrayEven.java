class ArrayEven
{
	public static void main(String[] args) {
		int [] numbers = {2,5,4,6,7,8,9,5,6,10,21,22};
		System.out.println("Even Numbers in given array : ");
		int i;
		int count = 0;
		for(i=0;i<numbers.length;i++)
		{
			if(numbers[i]%2==0){
				System.out.println(numbers[i]);
				count++;
			}
		}
		System.out.println("Length : "+i);
		System.out.println("Number of even numbers : "+count);
	}
}