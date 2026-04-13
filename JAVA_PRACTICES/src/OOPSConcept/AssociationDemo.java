package OOPSConcept;

class Address
{
    String city = "Delhi";
    String country = "India";

    void displayAddress()
    {
        System.out.println("City: " + city + ", Country: " + country);
    }
}

class Student
{
    String name = "Deepak";
    int rollno = 101;

    // Direct reference to another class
    Address address = new Address();  // Object created directly inside the class

    void displayInfo()
    {
        System.out.println("Name: " + name + ", Roll No: " + rollno);
        address.displayAddress();
    }
}


public class AssociationDemo {

	public static void main(String[] args) {
		Student s = new Student();
		s.displayInfo();
		// TODO Auto-generated method stub

	}

}


//USE A RELATIOSHIP
//class Engine {
//    void start() {
//        System.out.println("Engine starts");
//    }
//}
//
//class Driver {
//    void drive(Engine engine) {   // USES-A relationship
//        engine.start();
//        System.out.println("Driving...");
//    }
//}
