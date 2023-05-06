package Week1.Day4.Polymorphism;

class A {
    public void print() {
        System.out.println("Hello");
    }
}

class B extends A {
    public void print() {
        System.out.println("Hi");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.print();
        b.print();
    }
}
