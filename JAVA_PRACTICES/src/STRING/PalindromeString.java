package STRING;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "madam";
		String rev = new StringBuilder(str).reverse().toString();
		System.out.println(str.equals(rev) ? "Palindrome" : "Not");
	}

}
