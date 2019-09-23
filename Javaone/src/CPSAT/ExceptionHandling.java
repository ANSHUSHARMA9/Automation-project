package CPSAT;

public class ExceptionHandling {


	public static void main(String[] args) {
		System.out.println("Start");
		try {
			int a[]=new int[10];
			a[11]=9;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
		
//		try {
//			String str=null;
//			System.out.println(str.length());
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();

//		try {
//			int a=14/0;
//			System.out.println("Result is pass");
//		} catch (ArithmeticException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
		
	
	


