package STRING;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello";
		String rev = "";

		for(int i = str.length()-1; i >= 0; i--){
		    rev += str.charAt(i);
		}
		System.out.println(rev);
		
		String reverse = new StringBuilder(str).reverse().toString();
		System.out.println(reverse);

	}

}
