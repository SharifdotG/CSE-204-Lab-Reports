package LabReport8.Project3;

import LabReport8.Project2.GetterSetterMethods;

public abstract class Abstraction extends GetterSetterMethods {
    public void isPrime() {
        int number = getNumber1();
        int flag = 0;

        if (number == 0 || number == 1) {
            System.out.println("This Output is from an Concrete Method!"
                    + "\n" + number + " is not a Prime Number! (┬┬﹏┬┬)\n");
        } else {
            for (int i = 2; i < number / 2; i++) {
                if (number % i == 0) {
                    flag = 1;

                    System.out.println("This Output is from an Concrete Method!"
                            + "\n" + number + " is not a Prime Number! ::>_<::\n");

                    break;
                }
            }

            if (flag == 0) {
                System.out.println("This Output is from an Concrete Method!"
                        + "\n" + number + " is not a Prime Number! ○( ＾皿＾)っ Hehehe…\n");
            }
        }
    }

    public abstract void factorial();
}
