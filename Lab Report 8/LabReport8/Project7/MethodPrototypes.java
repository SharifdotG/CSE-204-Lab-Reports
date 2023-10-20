package LabReport8.Project7;

public class MethodPrototypes {
    public void thisOrThat(int number) {
        if (number > 0) {
            System.out.println(number + " is Positive! Σ(っ °Д °;)っ");
        } else if (number < 0) {
            System.out.println(number + " is Negative! φ(゜▽゜*)♪");
        } else {
            System.out.println(number + " is Zero! ✪ ω ✪");
        }
    }

    public double thisOrThat(double number1, double number2, double number3) {
        return Math.max(number1, Math.max(number2, number3));
    }

    public String thisOrThat(String weekName) {
        return switch (weekName) {
            case "Sunday" -> weekName + " is a Correct Week Name! (⓿_⓿))";
            case "Monday" -> weekName + " is a Correct Week Name! φ(*￣0￣)";
            case "Tuesday" -> weekName + " is a Correct Week Name! ( •̀ ω •́ )✧)";
            case "Wednesday" -> weekName + " is a Correct Week Name! (○´･д･)ﾉ)";
            case "Thursday" -> weekName + " is a Correct Week Name! (＠_＠;))";
            case "Friday" -> weekName + " is a Correct Week Name! Σ(っ °Д °;)っ";
            default -> weekName + " is an Incorrect Week Name! .·´¯`(>▂<)´¯`·. ";
        };
    }
}
