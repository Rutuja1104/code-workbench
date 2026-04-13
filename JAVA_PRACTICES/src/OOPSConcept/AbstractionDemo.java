package OOPSConcept;

//Abstract class
abstract class Payment {
 abstract void pay(double amount);  // abstract method

 void receipt() {
     System.out.println("Payment processed successfully.");
 }
}

//Subclass 1
class CreditCardPayment extends Payment {
    void pay(double amount) {
        validateCard();
        checkBalance();
        connectToBankServer();
        processTransaction(amount);
        System.out.println("Paid " + amount + " using Credit Card.");
    }

    private void validateCard() {
        System.out.println("Validating card...");
    }

    private void checkBalance() {
        System.out.println("Checking balance...");
    }

    private void connectToBankServer() {
        System.out.println("Connecting to bank server...");
    }

    private void processTransaction(double amount) {
        System.out.println("Processing transaction...");
    }
}

//Subclass 2
class UpiPayment extends Payment {
 void pay(double amount) {
     System.out.println("Paid " + amount + " using UPI.");
 }
}

//Main class
public class AbstractionDemo {
 public static void main(String[] args) {
     Payment p1 = new CreditCardPayment();
     p1.pay(1000);
     p1.receipt();

     Payment p2 = new UpiPayment();
     p2.pay(500);
     p2.receipt();
 }
}