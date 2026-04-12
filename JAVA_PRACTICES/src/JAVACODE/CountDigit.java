package JAVACODE;

public class CountDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 12345, count = 0;

		while(n != 0){
		    n /= 10;
		    count++;
		}
		System.out.println(count);
	}

}
