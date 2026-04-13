package OOPSConcept;

//Parent class
class Animal {
	Animal(){
		System.out.println("ANIMAL CLASS INTIALIZED");
	};
	
 void eat() {
     System.out.println("This animal eats food");
 }
}

//Child class
class Dog extends Animal {
	Dog(){
		System.out.println("DOG CLASS INTIALIZED");
	}
 void bark() {
     System.out.println("Dog barks");
 }
}

//Main class
public class InheritanceDemo {
 public static void main(String[] args) {
     Dog d = new Dog();
     d.eat();   // inherited method
     d.bark();  // own method
 }
}
