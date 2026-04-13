package OOPSConcept;

class Animals {
    void eat() {
        System.out.println("Eating...");
    }
}

class Dogs extends Animals {
    void bark() {
        System.out.println("Barking...");
    }
}

class Puppy extends Dogs {
    void weep() {
        System.out.println("Weeping...");
    }
}


public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.weep();


	}

}
