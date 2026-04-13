package OOPSConcept;

class MathOperations {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class CompiletimePolymorphism {
    public static void main(String[] args) {
        MathOperations obj = new MathOperations();

        System.out.println(obj.add(5, 10));       // 2 arguments
        System.out.println(obj.add(5, 10, 15));   // 3 arguments
    }
}