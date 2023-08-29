/*
* @autor: Sharif Md. Yousuf
* @ID: 22101128
*/

package AccessModifiers;

public class Main {
public static void main(String[] args) {
    PublicAccessModifier publicObj = new PublicAccessModifier();
    System.out.println(publicObj.publicVariable);
    publicObj.publicMethod();

        /*
        * Cannot access private members outside the class
        */
    PrivateAccessModifier privateObj = new PrivateAccessModifier();

    ProtectedAccessModifier protectedObj = new ProtectedAccessModifier();
    System.out.println(protectedObj.protectedVariable);
    protectedObj.protectedMethod();

    DefaultAccessModifier defaultObj = new DefaultAccessModifier();
    System.out.println(defaultObj.defaultVariable);
    defaultObj.defaultMethod();
}
}