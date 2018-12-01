package CodingBatExercises.A_Warmup_1;
/*
Given 2 int values, return true if they are both in the range 30..40 inclusive,
or they are both in the range 40..50 inclusive.

in3050(30, 31) → true
in3050(30, 41) → false
in3050(40, 50) → true
 */
public class T_in3050 {
    public static void main(String[] args) {
        T_in3050 t_in3050 = new T_in3050();

        System.out.println(t_in3050.in3050(30,31));
        System.out.println(t_in3050.in3050(30,41));
        System.out.println(t_in3050.in3050(40,50));

    }

    public boolean in3050(int a, int b) {
            boolean in3040 = ((a >=30 && a <= 40) && (b >=30 && b <= 40));
            boolean in4050 = ((a >=40 && a <= 50) && (b >=40 && b <= 50));
        return in3040 || in4050;
    }

}
