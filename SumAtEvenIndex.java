class SumAtEvenIndex
{
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,9,4,6,6,4,5,6,3};
		int sum = 0;
		for(int i=0;i<arr.length;i+=2)
		{
			sum+=arr[i];
		}
		System.out.println("Sum of array elements at even indexes : "+sum);

		sum=0;
		for(int i=1;i<arr.length;i+=2)
		{
			sum+=arr[i];
		}
		System.out.println("Sum of array elements at odd indexes : "+sum);
	}
}