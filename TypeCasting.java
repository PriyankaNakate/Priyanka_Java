class TypeCasting
{
	public static void main(String[] args) {
		//byte
		// byte b = 1;
		// short c = b;
		// int a = b;
		// long l = b;
		// float f = b;
		// double d = b;
		// char g = b;  //incompatible types: Possible lossy conversion from byte to char

		//short
		// short b = 1;
		// byte c = b;  //PLC from short to byte
		// int a = b;
		// long l = b;
		// float f = b;
		// double d = b;
		// char g = b;  //PLC from short to byte

		//int
		// int a = 1;
		// short b = a; //PLC from int to short
		// byte c = a;  //PLC from int to byte
		// long l = a;
		// float f = a;
		// double d = a;
		// char g = a; //PLC from int to char

		//long
		// long l = 1;
		// int a = l; //PLC from long to int
		// short b = l; //PLC from long to short
		// byte c = l;  //PLC from long to byte
		// float f = l;
		// double d = l;
		// char g = l; //PLC from long to char

		//float
		// float f = 1.1f;
		// long l = f; //PLC from float to long
		// int a = f; //PLC from float to int
		// short b = f; //PLC from float to short
		// byte c = f;  //PLC from float to byte
		// double d = f; 
		// char g = f; //PLC from float to char 

		//double
		// double f = 1.1;
		// long l = f; //PLC from double to long
		// int a = f; //PLC from double to int
		// short b = f; //PLC from double to short
		// byte c = f;  //PLC from double to byte
		// float d = f; //PLC from double to float
		// char g = f; //PLC from double to char

		//char
		char c = 'a';
		byte b = c; //PLC from char to byte
		short s = c; //PLC from char to short
		int a = c;
		long l = c;
		float f = c;
		double d = c;
	}
}