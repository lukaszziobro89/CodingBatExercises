package CodingBatExercises.A_Warmup_1;
/*
Given a string, take the last char and return a new string with the last char added at the front and back,
so "cat" yields "tcatt". The original string will be length 1 or more.

backAround("cat") -> "tcatt"
backAround("Hello") -> "oHelloo"
backAround("a") -> "aaa"
 */
public class E_backAround {

    public static void main(String[] args) {
        E_backAround e_backAround = new E_backAround();

        System.out.println(e_backAround.backAround("cat"));
        System.out.println(e_backAround.backAround("Hello"));
        System.out.println(e_backAround.backAround("a"));


    }

    public String backAround(String str) {
        String lastChar = str.substring(str.length()-1);
        StringBuilder newString = new StringBuilder();
        newString.append(lastChar);
        newString.append(str);
        newString.append(lastChar);
        return newString.toString();
    }

}
