package congnizent;
class MyClass {
    // Static variable
    static int staticCounter = 0;

    // Instance variable
    int instanceCounter = 0;

    // Constructor
    MyClass() {
        staticCounter++;    // Increment static variable
        instanceCounter++;  // Increment instance variable
    }

    // Method to display values
    void display() {
        System.out.println("Static counter: " + staticCounter);
      //  System.out.println("Instance counter: " + instanceCounter);
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass obj1 = new MyClass();
        obj1.display();

        MyClass obj2 = new MyClass();
        obj2.display();
        
        MyClass obj = new MyClass();
        obj.display();
    }
}
