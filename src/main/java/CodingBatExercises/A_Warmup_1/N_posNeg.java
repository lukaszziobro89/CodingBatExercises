package CodingBatExercises.A_Warmup_1;
/*
Given 2 int values, return true if one is negative and one is positive.
Except if the parameter "negative" is true, then return true only if both are negative.

posNeg(1, -1, false) → true
posNeg(-1, 1, false) → true
posNeg(-4, -5, true) → true
 */
public class N_posNeg {
    public static void main(String[] args) {
        N_posNeg n_posNeg = new N_posNeg();
        System.out.println(n_posNeg.posNeg(1,-1,false)); //true
        System.out.println(n_posNeg.posNeg(-1,1,false)); // true
        System.out.println(n_posNeg.posNeg(-4,-4,true)); // true
        System.out.println(n_posNeg.posNeg(-5,-5, false)); // false
        System.out.println(n_posNeg.posNeg(5,5, false)); // false
        System.out.println(n_posNeg.posNeg(-5,-5, true)); // true
        System.out.println(n_posNeg.posNeg(5,5, true)); // false
    }

    public boolean posNeg(int a, int b, boolean negative) {
        if (negative){
            return (a < 0 && b < 0);
        }else {
            return ((a > 0 && b < 0) || (a < 0 && b > 0));
        }
    }

}
