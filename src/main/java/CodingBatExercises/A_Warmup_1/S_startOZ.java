package CodingBatExercises.A_Warmup_1;
/*
Given a string, return a string made of the first 2 chars (if present),
however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".

startOz("ozymandias") → "oz"
startOz("bzoo") → "z"
startOz("oxx") → "o"
 */
public class S_startOZ {
    public static void main(String[] args) {
        S_startOZ s_startOZ = new S_startOZ();

        System.out.println(s_startOZ.startOz("ozymandias"));
        System.out.println(s_startOZ.startOz("bzoo"));
        System.out.println(s_startOZ.startOz("oxx"));

    }

    public String startOz(String str) {
        StringBuilder ozString = new StringBuilder();

        if (str.length()>0){
            if (str.charAt(0) == 'o') {ozString.append('o');}
            if (str.charAt(1) == 'z'){ozString.append('z');}
        }
        return ozString.toString();
    }

}
