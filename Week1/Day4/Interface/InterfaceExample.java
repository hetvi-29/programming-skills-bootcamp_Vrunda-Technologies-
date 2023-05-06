package Week1.Day4.Interface;

interface A {
    public void display();
}

class B implements A {
    public void display() {
        System.out.println("Hello");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        B b = new B();
        b.display();
    }
}
