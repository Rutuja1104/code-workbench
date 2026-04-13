package OOPSConcept;

//Parent class
class Animall {
 void sound() {
     System.out.println("Animal makes sound");
 }
}

//Child class
class Dogis extends Animall {
 void sound() {
     System.out.println("Dog barks");
 }
}

//Main class
public class RuntimePolymorphism {
 public static void main(String[] args) {
     Animall a = new Dogis();  // parent reference, child object
     a.sound();             // calls Dog's method
 }
}