/*
 * @autor: Sharif Md. Yousuf
 * @ID: 22101128
 */

public class StaticVariableExample {
    static int staticVariable; // Static variable

    public static void main(String[] args) {
        StaticVariableExample.staticVariable = 15;
        System.out.println(StaticVariableExample.staticVariable);

        StaticVariableExample obj1 = new StaticVariableExample();
        StaticVariableExample obj2 = new StaticVariableExample();

        obj1.staticVariable = 20; // Modifying staticVar through obj1
        System.out.println(obj2.staticVariable); // Will also print 20
    }
}
