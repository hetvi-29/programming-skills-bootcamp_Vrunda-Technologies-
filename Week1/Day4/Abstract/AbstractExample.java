package Week1.Day4.Abstract;

abstract class A {
    abstract void display();

    void show() {// normal method
        System.out.println("Hello");
    }

}

class B extends A {

    void display() {
        System.out.println("Hi");

    }

    void print() {
        System.out.println("Hey");
    }
}

public class AbstractExample {
    public static void main(String[] args) {
        B b = new B();
        b.show();
        b.display();
        b.print();
    }
}
