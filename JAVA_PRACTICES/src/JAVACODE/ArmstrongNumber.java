package JAVACODE;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 153, temp = n, sum = 0;

		while(n != 0){
		    int rem = n % 10;
		    sum += rem * rem * rem;
		    n /= 10;
		}

		System.out.println(temp == sum ? "Armstrong" : "Not Armstrong");
	}

}
