package CodingBatExercises.A_Warmup_1;
/*
Given a string, return a new string where the first and last chars have been exchanged.

frontBack("code") → "eodc"
frontBack("a") → "a"
frontBack("ab") → "ba"
 */
public class O_frontBack {
    public static void main(String[] args) {
        O_frontBack o_frontBack = new O_frontBack();

        System.out.println(o_frontBack.frontBack("code"));
        System.out.println(o_frontBack.frontBack("a"));
        System.out.println(o_frontBack.frontBack("ab"));
    }

    public String frontBack(String str) {
        if (str.length() <= 1){
            return str;
        } else {
            char front = str.charAt(0);
            String end = str.substring(str.length()-1);
            String mid = str.substring(1, str.length()-1);
            return end + mid + front;
        }
    }

}
