package CodingBatExercises.A_Warmup_1;
/*
Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie.
Note that Math.abs(n) returns the absolute value of a number.

close10(8, 13) → 8
close10(13, 8) → 8
close10(13, 7) → 0
 */
public class I_close10 {
    public static void main(String[] args) {
        I_close10 i_close10 = new I_close10();

        System.out.println(i_close10.close10(8,13));
        System.out.println(i_close10.close10(13,8));
        System.out.println(i_close10.close10(13,7));

    }

    public int close10(int a, int b) {
        if(Math.abs(a-10) < Math.abs(b-10)){
            return a;
        } else if (Math.abs(a-10) > Math.abs(b-10)){
            return b;
        } else {
            return 0;
        }
    }

}
