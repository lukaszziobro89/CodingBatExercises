package CodingBatExercises.A_Warmup_1;
/*
We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.

monkeyTrouble(true, true) → true
monkeyTrouble(false, false) → true
monkeyTrouble(true, false) → false
 */
public class L_monkeyTrouble {
    public static void main(String[] args) {
        L_monkeyTrouble l_monkeyTrouble = new L_monkeyTrouble();

        System.out.println(l_monkeyTrouble.monkeyTrouble(true,true));
        System.out.println(l_monkeyTrouble.monkeyTrouble(false,false));
        System.out.println(l_monkeyTrouble.monkeyTrouble(true,false));
    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return aSmile==bSmile;
    }

}
