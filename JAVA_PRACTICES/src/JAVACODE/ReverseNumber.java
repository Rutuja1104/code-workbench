package JAVACODE;

public class ReverseNumber {
	
	static int reverseNumber(int n) {
		int  rev = 0;

		while(n>0) {
			int rem =n % 10;
			rev = rev*10+rem;
			n=n/10;
		}
		return rev;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res = reverseNumber(12345);
		System.out.println(res);
	}

}
