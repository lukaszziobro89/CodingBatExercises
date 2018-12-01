package CodingBatExercises.A_Warmup_1;
/*
Given a non-empty string and an int N, return the string made starting with char 0, and then every Nth char of the string.
So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.

everyNth("Miracle", 2) -> "Mrce"
everyNth("abcdefg", 2) -> "aceg"
everyNth("abcdefg", 3) -> "adg"
 */
public class K_everyNth {

    public static void main(String[] args) {
        K_everyNth k_everyNth = new K_everyNth();

        System.out.println(k_everyNth.everyNth("Miracle",2));
        System.out.println(k_everyNth.everyNth("abcdefg",2));
        System.out.println(k_everyNth.everyNth("abcdefg",3));

    }

    public String everyNth(String str, int n) {
        StringBuilder everyNthString = new StringBuilder();
        for (int i = 0; i < str.length(); i = i + n) {
             everyNthString.append(str.charAt(i));
        }
        return everyNthString.toString();
    }

}
