package CodingBatExercises.A_Warmup_1;

/*
Given a non-empty string and an int n, return a new string where the char at index n has been removed.
The value of n will be a valid index of a char in the original string
(i.e. n will be in the range 0..str.length()-1 inclusive).

missingChar("kitten", 1) -> "ktten"
missingChar("kitten", 0) -> "itten"
missingChar("kitten", 4) -> "kittn"

 */
public class D_missingChar {

    public static void main(String[] args) {
        D_missingChar d_missingChar = new D_missingChar();

        System.out.println(d_missingChar.missingChar("kitten", 1));
        System.out.println(d_missingChar.missingChar("kitten", 0));
        System.out.println(d_missingChar.missingChar("kitten", 4));
        System.out.println(d_missingChar.missingChar("luq", 2));
    }


    public String missingChar(String str, int n) throws IllegalArgumentException{

        if (n < 0 || n >= str.length()){
            throw new IllegalArgumentException("MissingChar is out of range. First char is zero index.");
        } else {
            StringBuilder newString = new StringBuilder();
            newString.append(str, 0, n);
            newString.append(str, n + 1, str.length());
            return newString.toString();
        }
    }

}
