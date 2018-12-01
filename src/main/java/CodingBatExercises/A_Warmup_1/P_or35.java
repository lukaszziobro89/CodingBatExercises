package CodingBatExercises.A_Warmup_1;
/*
Return true if the given non-negative number is a multiple of 3 or a multiple of 5. Use the % "mod" operator

or35(3) → true
or35(10) → true
or35(8) → false
 */
public class P_or35 {
    public static void main(String[] args) {
        P_or35 p_or35 = new P_or35();

        System.out.println(p_or35.or35(3));
        System.out.println(p_or35.or35(10));
        System.out.println(p_or35.or35(8));

    }

    public boolean or35(int n) {
        return ((n % 3 == 0) || (n % 5 == 0));
    }

}
