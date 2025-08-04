package Assignment5;

//Private method cannot be Overridden
class A {
    private void display() {
        System.out.println("Private method in A");
    }

    public void callDisplay() {
        display(); // Calls A's private method
    }

    A() {
        System.out.println("Constructor A");
    }

    static void greet() {
        System.out.println("Hello from A");
    }
    final void show() {
        System.out.println("Final method in A");
    }
}

class B extends A {
    // This is not an override, it's a new method
    private void display() {
        System.out.println("Private method in B");
    }
    B() {
        System.out.println("Constructor B");
    }

    static void greet() {
        System.out.println("Hello from B");
    }

}



public class Q2 {
    //Can we override private method, constructor, static method, final method? Illustrate with an example.
    public static void main(String[] args) {
        //Privte method, Constructor, Static Method, Final Method can not be overridden in Java.
        B b = new B(); // Both constructors are called, but not overridden
        b.callDisplay(); //Call' A Private method
        A obj = new B(); //Upcasting
        obj.greet(); // Calls A.greet() — not polymorphic
        System.out.println("If i try to override void show() in Class B{ } // ❌ Compile-time error");
    }
}
