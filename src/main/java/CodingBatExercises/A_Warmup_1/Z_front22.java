package CodingBatExercises.A_Warmup_1;
/*
Given a string, take the first 2 chars and return the string with the 2 chars
added at both the front and back, so "kitten" yields"kikittenki".
If the string length is less than 2, use whatever chars are there.

front22("kitten") → "kikittenki"
front22("Ha") → "HaHaHa"
front22("abc") → "ababcab"
 */
public class Z_front22 {
    public static void main(String[] args) {
        Z_front22 z_front22 = new Z_front22();

        System.out.println(z_front22.front22("kitten"));
        System.out.println(z_front22.front22("Ha"));
        System.out.println(z_front22.front22("abc"));
    }

    public String front22(String str) {
        if (str.length() <= 2){
            return str + str + str;
        }else {
            String front = str.substring(0,2);
            return front + str + front;
        }
    }

}
