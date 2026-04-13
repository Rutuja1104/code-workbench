package OOPSConcept;

class BankAccount {
    private double balance;   // hidden data

    // setter method
    public void setBalance(double balance) {
        if (balance > 0) {
            this.balance = balance;
        }
    }

    // getter method
    public double getBalance() {
        return balance;
    }
}

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 BankAccount acc = new BankAccount();

	        acc.setBalance(1000);        // controlled access
	        System.out.println(acc.getBalance());

	}

}
