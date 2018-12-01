package CodingBatExercises.A_Warmup_1;
/*
Given 2 int values, return true if either of them is in the range 10..20 inclusive.

in1020(12, 99) → true
in1020(21, 12) → true
in1020(8, 99) → false
 */
public class Z_in1020 {
    public static void main(String[] args) {
        Z_in1020 z_in1020 = new Z_in1020();

        System.out.println(z_in1020.in1020(12,99));
        System.out.println(z_in1020.in1020(21,12));
        System.out.println(z_in1020.in1020(8,99));
    }

    public boolean in1020(int a, int b) {
        return ((a >= 10 && a <= 20) || (b >= 10 && b <= 20));
    }

}
