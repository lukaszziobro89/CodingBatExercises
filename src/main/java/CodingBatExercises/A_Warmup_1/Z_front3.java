package CodingBatExercises.A_Warmup_1;
/*
Given a string, we'll say that the front is the first 3 chars of the string.
If the string length is less than 3, the front is whatever is there. Return a new string which is 3 copies of the front.

front3("Java") → "JavJavJav"
front3("Chocolate") → "ChoChoCho"
front3("abc") → "abcabcabc"
 */
public class Z_front3 {
    public static void main(String[] args) {
        Z_front3 z_front3  = new Z_front3();

        System.out.println(z_front3.front3("Java"));
        System.out.println(z_front3.front3("Chocolate"));
        System.out.println(z_front3.front3("abc"));
    }

    public String front3(String str) {
        String front = str.substring(0,3);
        return front + front + front;
    }

}
