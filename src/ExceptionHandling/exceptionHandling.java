package ExceptionHandling;

public class exceptionHandling {

	public static void main(String[] args)
		{
		int[] array = {3, 4, 5};
		int num=10;
		
		try {
			System.out.println(array[5]);
			int res = num/0;
			
		} catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
		} catch(ArithmeticException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Inside finally");
		}

		System.out.println("End of Code");
		
		}	
}
