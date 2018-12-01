package CodingBatExercises.A_Warmup_1;
/*
Given two int values, return their sum. Unless the two values are the same, then return double their sum.

sumDouble(1, 2) → 3
sumDouble(3, 2) → 5
sumDouble(2, 2) → 8
 */
public class V_sumDouble {
    public static void main(String[] args) {
        V_sumDouble v_sumDouble = new V_sumDouble();

        System.out.println(v_sumDouble.sumDouble(1,2));
        System.out.println(v_sumDouble.sumDouble(3,2));
        System.out.println(v_sumDouble.sumDouble(2,2));

    }

    public int sumDouble(int a, int b) {
        if (a==b){
            return ((a + b) * 2);
        } else {
            return (a + b);
        }
    }

}
