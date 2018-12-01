package CodingBatExercises.A_Warmup_1;
/*
Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.

mixStart("mix snacks") → true
mixStart("pix snacks") → true
mixStart("piz snacks") → false
 */
public class H_mixStart {

    public static void main(String[] args) {
        H_mixStart h_mixStart = new H_mixStart();

        System.out.println(h_mixStart.mixStart("mix snacks"));
        System.out.println(h_mixStart.mixStart("pix snacks"));
        System.out.println(h_mixStart.mixStart("piz snacks"));

    }

    public boolean mixStart(String str) {
        return (str.substring(1,3).equals("ix"));
    }

}


