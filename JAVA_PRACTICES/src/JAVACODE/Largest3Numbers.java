package JAVACODE;

public class Largest3Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1200, b=13, c = 450;
		
		if(a >= b && a >= c)
		    System.out.println("Largest: " + a);
		else if(b >= c)
		    System.out.println("Largest: " + b);
		else
		    System.out.println("Largest: " + c);
	}

}
