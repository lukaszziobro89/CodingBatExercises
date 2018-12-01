package CodingBatExercises.A_Warmup_1;
/*
Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.

makes10(9, 10) → true
makes10(9, 9) → false
makes10(1, 9) → true
 */
public class W_makes10 {
    public static void main(String[] args) {
        W_makes10 w_makes10 = new W_makes10();

        System.out.println(w_makes10.makes10(9,10));
        System.out.println(w_makes10.makes10(9,9));
        System.out.println(w_makes10.makes10(9,1));
        System.out.println(w_makes10.makes10(2,8));

    }

    public boolean makes10(int a, int b){
        return (a == 10 || b == 10 || a + b == 10);
    }
}
