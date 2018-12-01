package CodingBatExercises.A_Warmup_1;
/*
Return true if the given string contains between 1 and 3 'e' chars.

stringE("Hello") → true
stringE("Heelle") → true
stringE("Heelele") → false
 */
public class J_stringE {

    public static void main(String[] args) {

        J_stringE j_stringE = new J_stringE();
        System.out.println(j_stringE.stringE("Hello"));
        System.out.println(j_stringE.stringE("Heelle"));
        System.out.println(j_stringE.stringE("Heelele"));

    }

    public boolean stringE(String str) {
        int count = 0;
            for (int i = 0; i < str.length(); i++) {
                 if (str.charAt(i) == 'e'){count++;}
            }
        return (count >= 1 && count <= 3);
    }

}
