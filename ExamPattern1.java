class ExamPattern1
{
	public static void main(String[] args) {
		for(int i=5;i>=1;i--)
		{
			for(int j=5;j>i;j--)
			{
				System.out.print("  ");
			}
			int num = i;
			char ch = 'c';
			for(int j=1;j<=i;j++)
			{
				if(i==3 || i==2){
					break;
				}
				if(i%2==1)
					System.out.print(num++ +" ");
				else
					System.out.print(ch++ +" ");
			}
			int num1 = 2;
			char c = 'a';
			for(int j=1;j<=i;j++){
				if(i==3)
					System.out.print(num1++ +" ");
				else if(i==2)
					System.out.print(c++ +" ");
				else
					break;
			}
			System.out.println();
		}
	}
}