// class ExceptionExample2
// {
// 	public static void main(String[] args) {
// 		try{
// 			System.out.println("hii from try");
// 			System.out.println(10/0);
// 			try{
// 				System.out.println("inner try");
// 				System.out.println(10/0);
// 			}
// 			catch(NullPointerException a){
// 				System.out.println("inner ae handled");
// 			}
// 		}
// 		catch(ArithmeticException ae){
// 			System.out.println("hii from catch");
// 		}
// 	}
// }

// class ExceptionExample2
// {
// 	public static void main(String[] args) {
// 		try{
// 			System.out.println("Hii from try");
// 			try{
// 				System.out.println("inner try");
// 				System.out.println(10/0);
// 			}
// 			catch(NullPointerException a){
// 				System.out.println("inner ae handled");
// 			}
// 		}
// 		catch(ArithmeticException ae){
// 			System.out.println("Hii from catch");
// 		}
// 	}
// }

// class ExceptionExample2
// {
// 	public static void main(String[] args) {
// 		try{
// 			System.out.println("Hii from try");
// 			String str = null;
// 			System.out.println(str.isEmpty());
// 			}
// 		catch(ArithmeticException ae){
// 				System.out.println("ArithmeticException handled");
// 			}
// 		catch(RuntimeException ae){
// 			System.out.println("RuntimeException handled");
// 		}
// 		catch(NullPointerException npe){
// 			System.out.println("NullPointerException handled");
// 		}
// 	}
// }

// class ExceptionExample2
// {
// 	public static void main(String[] args) {
// 		System.out.println("hello starts");
// 		try{
// 			Thread.sleep(2000);
// 		}
// 		catch(RuntimeException re){
// 			System.out.println("RuntimeException handled");
// 		}
// 		catch(InterruptedException ie){
// 			System.out.println("InterruptedException handled");
// 		}
// 		System.out.println("hello ends");
// 	}
// }

// class ExceptionExample2
// {
// 	public static void main(String[] args) {
// 		try{
// 			System.out.println("hii from try");
// 			Thread.sleep(1000);
// 		}
// 		catch(InterruptedException ie){
// 			System.out.println("InterruptedException handles");
// 		}
// 		catch(Exception e){
// 			System.out.println("Exception handled");
// 		}
// 		// catch(RuntimeException re){
// 		// 	System.out.println("RuntimeException handled");
// 		// }
// 	}
// }

// class ExceptionExample2
// {
// 	public static void main(String[] args) {
// 		System.out.println("Execution starts");
// 		for( ; ; ){
// 			System.out.println("hello hello");
// 		}
// 		System.out.println(10/0);
// 	}
// }

// class ExceptionExample2
// {
// 	public static void main(String[] args) {
// 		System.out.println("Execution Starts");
// 		m1();
// 		System.out.println("Execution Ends");
// 	}
// 	static void m1(){
// 		System.out.println("m1()");
// 		try{
// 			System.out.println("try");
// 			System.out.println(10/0);
// 		}
// 		catch(ArithmeticException ae){
// 			System.out.println("ArithmeticException handled");
// 		}
// 		finally{
// 			System.out.println("hello finally");
// 		}
// 		System.out.println("m1()");
// 	}
// }


// class ExceptionExample2
// {
// 	public static void main(String[] args) {
// 		System.out.println("Execution Starts");
// 		m1();
// 		System.out.println("Execution Ends");
// 	}
// 	static void m1(){
// 		System.out.println("m1() starts");
// 		try{
// 			System.out.println("try");
// 			System.out.println(10/0);
// 		}
// 		catch(ArithmeticException ae){
// 			System.out.println("ArithmeticException handled");
// 			return;
// 		}
// 		finally{
// 			System.out.println("hello finally");
// 		}
// 		System.out.println("m1() ends");
// 	}
// }

// class ExceptionExample2
// {
// 	public static void main(String[] args) {
// 		System.out.println("Execution Starts");
// 		m1();
// 		System.out.println("Execution Ends");
// 	}
// 	static void m1(){
// 		System.out.println("m1() starts");
// 		try{
// 			System.out.println("try");
// 			return;
// 		}
// 		catch(ArithmeticException ae){
// 			System.out.println("ArithmeticException handled");
// 		}
// 		finally{
// 			System.out.println("hello finally");
// 		}
// 		System.out.println("m1() ends");
// 	}
// }

// class ExceptionExample2
// {
// 	public static void main(String[] args) {
// 		try{
// 			System.out.println("outer try");
// 			System.out.println(10/0);
// 		}
// 		catch(ArithmeticException ae){
// 			System.out.println("outer catch 1");

// 			try{
// 				System.out.println("inner try");
// 				System.out.println(10/0);
// 			}
// 			catch(NullPointerException npe){
// 				System.out.println("inner catch");
// 			}
// 			finally{
// 				System.out.println("inner finally");
// 			}
// 		}
// 		catch(Exception e){
// 			System.out.println("outer catch 2");
// 		}
// 		finally{
// 			System.out.println("outer finally");
// 		}
// 	}
// }

// class ExceptionExample2
// {
// 	public static void main(String[] args) {
// 		try{
// 			System.out.println("outer try");

// 			try{
// 				System.out.println("inner try");
// 			}
// 			catch(NullPointerException npe){
// 				System.out.println("inner catch");
// 			}

// 			finally{
// 				System.out.println("inner finally");
// 				System.out.println(10/0);
// 			}
// 		}
// 		catch(ArithmeticException ae){
// 			System.out.println("outer catch 1");
// 			}
// 		catch(Exception e){
// 				System.out.println("outer catch 2");
// 			}
// 		finally{
// 				System.out.println("outer finally");
// 			}
// 	}
// }

// class  ExceptionExample2
// {
// 	public static void main(String[] args) {
// 		System.out.println("Execution starts");

// 		int i = 1;
// 		while(i<=10);
// 		{
// 			System.out.println(i);
// 			i++;
// 		}
// 		try{
// 			System.out.println("try bye");
// 			System.out.println(10/0);
// 		}
// 		finally{
// 			System.out.println("hello from finally");
// 		}
// 	}
// }

// class ExceptionExample2
// {
// 	public static void main(String[] args) {
// 		try{
// 			System.out.println("outer try");

// 			try{
// 				System.out.println("inner try");
// 			}
// 			finally{
// 				System.out.println("inner finally");
// 			}
// 		}
// 		catch(ArithmeticException ae){
// 			System.out.println("Outer catch 1");
// 		}

// 		catch(Exception e){
// 			System.out.println("outer catch 2");
// 		}
// 		finally{
// 			System.out.println("outer finally");
// 			System.out.println(10/0);
// 		}
// 	}
// }

// class ExceptionExample2
// {
// 	public static void main(String[] args) {
// 		System.out.println("Execution Starts");
// 		try{
// 			Thread.currentThread().join();
// 		}
// 		catch(InterruptedException i){
// 			System.out.println("InterruptedException handled");
// 		}
// 		finally
// 		{
// 			System.out.println("hello from finally");
// 		}
// 		System.out.println("Execution ends");
// 	}
// }

// class ExceptionExample2
// {
// 	public static void main(String[] args) {
// 		System.out.println("Execution Starts");
// 		try{
// 			System.out.println("try");
// 			Thread.sleep(1000);
// 		}
// 		catch(InterruptedException i){
// 			System.out.println("InterruptedException handled");
// 			System.exit(0);
// 		}
// 		finally
// 		{
// 			System.out.println("hello from finally");
// 		}
// 		System.out.println("Execution ends");
// 	}
// }

class ExceptionExample2
{
	public static void main(String[] args) {
		System.out.println("Execution Starts");
		try{
			System.out.println("try");
			System.out.println(10/0);
		}
		catch(ArithmeticException i){
			System.out.println("ArithmeticException handled");
			System.exit(0);
		}
		finally
		{
			System.out.println("hello from finally");
		}
		System.out.println("Execution ends");
	}
}
