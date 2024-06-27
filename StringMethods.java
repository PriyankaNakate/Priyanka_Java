class StringMethods
{
	public static void main(String[] args) {
		String name1 = "Priya";
		String name2 = "Prakriti";
		String name3 = "Prerna";

		System.out.println("Convet name into uppercase : "+name1.toUpperCase());
		System.out.println("Length of name2 : "+name2.length());
		System.out.println("3rd Character in name2 : "+name2.charAt(2));
		System.out.println("Combination of two name : "+name1.concat(name2));
		// String substr = name1.subString(1,4);
		// System.out.println("Multiple characters : "+substr);
		// System.out.println("Single Character : "+name1.subString(0,1));
		System.out.println("isEmpty() : "+name1.isEmpty());
		System.out.println("replace p with r : "+name1.replace('P','R'));

		String str = "playhomesss";
		// System.out.print("Enter character to remove : ");
		// char ch = sc.next().charAt(0);
		System.out.println(str.replace('s',' '));
	}
}