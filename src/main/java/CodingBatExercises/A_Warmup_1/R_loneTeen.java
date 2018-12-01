package CodingBatExercises.A_Warmup_1;
/*
We'll say that a number is "teen" if it is in the range 13..19 inclusive.
Given 2 int values, return true if one or the other is teen, but not both.

loneTeen(13, 99) → true
loneTeen(21, 19) → true
loneTeen(13, 13) → false
 */
public class R_loneTeen {
    public static void main(String[] args) {
        R_loneTeen r_loneTeen = new R_loneTeen();

        System.out.println(r_loneTeen.loneTeen(13,99));
        System.out.println(r_loneTeen.loneTeen(21,19));
        System.out.println(r_loneTeen.loneTeen(13,13));

    }

    public boolean loneTeen(int a, int b) {
            boolean aIsTeen = (a >= 13 && a <= 19);
            boolean bIsTeen = (b >= 13 && b <= 19);
        return (aIsTeen ^ bIsTeen);
    }

}
