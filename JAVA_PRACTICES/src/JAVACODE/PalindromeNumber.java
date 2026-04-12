package JAVACODE;

public class PalindromeNumber {
	
	static boolean checkIsPalindrome(int n) {
		int  rev = 0, temp=n;

		while(n>0) {
			int rem =n % 10;
			rev = rev*10+rem;
			n=n/10;
		}
		return temp==rev;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean res = checkIsPalindrome(12321);
		if(res)
			System.out.println("PALINDROME NUMBER");
		else
			System.out.println("NOT A PALINDROME");

	}

}
