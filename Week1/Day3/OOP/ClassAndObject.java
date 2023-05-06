package Week1.Day3.OOP;

import java.util.Scanner;

class Student {
    String name = "Hello";
    Scanner sc = new Scanner(System.in);

    void getName() {
        System.out.println("Enter Name");
        name = sc.nextLine();
    }

    void print() {
        System.out.println("Your name is : " + name);
    }
}

public class ClassAndObject {
    public static void main(String[] args) {
        Student st = new Student();
        Student s2 = new Student();
        st.getName();
        st.print();
        s2.print();
    }
}
