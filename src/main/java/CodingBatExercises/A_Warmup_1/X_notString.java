package CodingBatExercises.A_Warmup_1;
/*
Given a string, return a new string where "not " has been added to the front.
However, if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.

notString("candy") → "not candy"
notString("x") → "not x"
notString("not bad") → "not bad"
 */
public class X_notString {
    public static void main(String[] args) {
        X_notString x_notString = new X_notString();
        System.out.println(x_notString.notString("candy"));
        System.out.println(x_notString.notString("x"));
        System.out.println(x_notString.notString("not bad"));
    }

    public String notString(String str) {
        if (str.length() >=3 && str.substring(0,3).equals("not")){
            return str;
        }else {
            return "not " + str;
        }
    }

}
