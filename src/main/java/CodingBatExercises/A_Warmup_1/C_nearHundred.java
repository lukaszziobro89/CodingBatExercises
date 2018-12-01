package CodingBatExercises.A_Warmup_1;

/*
Given an int n, return true if it is within 10 of 100 or 200.
Note: Math.abs(num) computes the absolute value of a number.

nearHundred(93) → true
nearHundred(90) → true
nearHundred(89) → false
 */

public class C_nearHundred {

    public static void main(String[] args) {
        C_nearHundred c_nearHundred = new C_nearHundred();
        System.out.println(c_nearHundred.nearHundred(190));
        System.out.println(c_nearHundred.nearHundred(189));
        System.out.println(c_nearHundred.nearHundred(210));
        System.out.println(c_nearHundred.nearHundred(211));
        System.out.println(c_nearHundred.nearHundred(90));
        System.out.println(c_nearHundred.nearHundred(89));
        System.out.println(c_nearHundred.nearHundred(110));
        System.out.println(c_nearHundred.nearHundred(111));

    }

    public boolean nearHundred(int n) {
        return ((Math.abs(200-n) <= 10) ||(Math.abs(100-n)) <=10);
    }

}
