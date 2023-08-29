/*
 * @autor: Sharif Md. Yousuf
 * @ID: 22101128
 */

public class InstanceVariableExample {
    String name; // Instance variable
    int age;

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        InstanceVariableExample obj1 = new InstanceVariableExample();
        obj1.name = "Alice";
        obj1.age = 20;
        obj1.displayInfo();

        InstanceVariableExample obj2 = new InstanceVariableExample();
        obj2.name = "Bob";
        obj2.age = 22;
        obj2.displayInfo();
    }
}
