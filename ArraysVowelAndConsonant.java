//w.j.p to find count of vowels and consonants of given an array
import java.util.*;
class ArraysVowelAndConsonant
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of an array : ");
		int size = sc.nextInt();
		char [] arr = new char[size];
		System.out.println("Enter array elements : ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.next().charAt(0);
		}
		System.out.println("arr is : "+Arrays.toString(arr));

		int vCnt = 0;
		int cCnt = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u' || arr[i]=='A' || arr[i]=='E' || arr[i]=='I' || arr[i]=='O' || arr[i]=='U')
			{
				vCnt++;
			}
			else{
				cCnt++;
			}
		}
		System.out.println("Number of vowels in an array : "+vCnt);
		System.out.println("Number of consonants in an array : "+cCnt);
	}
}

//Steps
// 1. create an array of char data type(dynamically)
// 2. compare each position in an array with vowels 
// 3. if it is vowel increment the count