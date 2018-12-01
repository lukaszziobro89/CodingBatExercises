package CodingBatExercises.A_Warmup_1;

/*
Given a string, return true if the string starts with "hi" and false otherwise.

startHi("hi there") → true
startHi("hi") → true
startHi("hello hi") → false
 */

public class F_startHi {

    public static void main(String[] args) {
        F_startHi f_startHi = new F_startHi();

        System.out.println(f_startHi.startHi("hi there"));
        System.out.println(f_startHi.startHi("hi"));
        System.out.println(f_startHi.startHi("hello hi"));


    }

    public boolean startHi(String str) {
        return str.startsWith("hi");
    }

}
