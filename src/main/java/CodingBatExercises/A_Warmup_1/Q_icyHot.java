package CodingBatExercises.A_Warmup_1;
/*
Given two temperatures, return true if one is less than 0 and the other is greater than 100.

icyHot(120, -1) → true
icyHot(-1, 120) → true
icyHot(2, 120) → false
 */
public class Q_icyHot {

    public static void main(String[] args) {
        Q_icyHot q_icyHot = new Q_icyHot();

        System.out.println(q_icyHot.icyHot(120, -1));
        System.out.println(q_icyHot.icyHot(-1, 120));
        System.out.println(q_icyHot.icyHot(2, 120));

    }

    public boolean icyHot(int temp1, int temp2) {
        return (temp1 > 100 && temp2 < 0) || (temp1 < 0 && temp2 > 100);
    }

}
