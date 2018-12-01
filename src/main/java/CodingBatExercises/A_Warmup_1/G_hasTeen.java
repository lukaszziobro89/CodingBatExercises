package CodingBatExercises.A_Warmup_1;
/*
We'll say that a number is "teen" if it is in the range 13..19 inclusive.
Given 3 int values, return true if 1 or more of them are teen.

hasTeen(13, 20, 10) → true
hasTeen(20, 19, 10) → true
hasTeen(20, 10, 13) → true
 */
public class G_hasTeen {
    public static void main(String[] args) {
        G_hasTeen g_hasTeen = new G_hasTeen();

        System.out.println(g_hasTeen.hasTeen(13,29,19));
        System.out.println(g_hasTeen.hasTeen(20,19,10));
        System.out.println(g_hasTeen.hasTeen(20,10,13));
        System.out.println(g_hasTeen.hasTeen(1,2,3));
        System.out.println(g_hasTeen.hasTeen(22,33,44));
        System.out.println(g_hasTeen.hasTeen(1,23,55));

    }

    public boolean hasTeen(int a, int b, int c) {

        return (
                (a>= 13 && a<=19) ||
                (b>= 13 && b<=19) ||
                (c>= 13 && c<=19)
                );
    }

}
