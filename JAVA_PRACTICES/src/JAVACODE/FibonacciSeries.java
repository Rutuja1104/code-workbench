package JAVACODE;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a=0, b=1, c=0;
//		System.out.println(a);
//		System.out.println(b);
//		for(int i =0; i<=8; i++) {
//			c=a+b;					
//			System.out.println(c);
//			a=b;
//			b=c;
//		
//		}
		
		int n = 10, a = 0, b = 1;

		for(int i=0; i<n; i++){
		    System.out.print(a + " ");
		    int c = a + b;
		    a = b;
		    b = c;
		}
	}

}
