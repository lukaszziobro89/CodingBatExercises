package CodingBatExercises.B_String;

public class B_String_3 {
    /**
     Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not
     an alphabetic letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
         countYZ("fez day") --> 2
         countYZ("day fez") --> 2
         countYZ("day fyyyz") --> 2
     */
    public int countYZ(String str) {
        int counter = 0;
        StringBuilder word = new StringBuilder();
            for (int i = 0; i < str.length() - 1; i++) {
                 if (!(Character.isLetter(str.charAt(i + 1)))){
                     if (str.charAt(i) == 'y' || str.charAt(i) == 'z') {
                         counter++;
                         word = new StringBuilder();
                         i++;
                     }
                 } else {
                     word.append(str.charAt(i));
                 }
            }
                if (str.charAt(str.length() - 1) == 'y' || str.charAt(str.length() - 1) == 'z') counter++;
        return counter;
    }

    /**
     We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     Return true if all the g's in the given string are happy.
         gHappy("xxggxx") --> true
         gHappy("xxgxx") --> false
         gHappy("xxggyygxx") --> false
     */
    public boolean gHappy(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 && str.charAt(i) == 'g' && str.charAt(i + 1) != 'g') return false;
            if (i > 0 && i < str.length() - 1 && str.charAt(i) == 'g') {
                if (str.charAt(i-1) != 'g' && str.charAt(i+1) != 'g') {
                    return false;
                }
            }
            if (i == str.length() - 1 && str.charAt(i) =='g' && str.charAt(i-1) != 'g') return false;
        }
        return true;
    }

    /**
     Given a string, return the sum of the numbers appearing in the string, ignoring all other characters.
     A number is a series of 1 or more digit chars in a row. (Note: Character.isDigit(char) tests if a char is
     one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)
         sumNumbers("abc123xyz") --> 123
         sumNumbers("aa11b33") --> 44
         sumNumbers("7 11") --> 18
     */
    public int sumNumbers(String str) {
        int sum = 0;
        StringBuilder num = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                 if (Character.isDigit(str.charAt(i))){
                     num.append(str.charAt(i));
                         if(i < str.length() - 1 && (!(Character.isDigit(str.charAt(i+1))))){
                             sum += Integer.parseInt(num.toString());
                             num = new StringBuilder();
                         }
                         if(i==str.length()-1) sum += Integer.parseInt(num.toString());
                 }
            }
        return sum;
    }

    /**
     Given two strings, base and remove, return a version of the base string where all instances of the remove string
     have been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
         withoutString("xxx", "xx") --> "x"
         withoutString("Hello there", "llo") --> "He there"
         withoutString("Hello there", "e") --> "Hllo thr"
         withoutString("Hello there", "x") --> "Hello there"
     */
    public String withoutString(String base, String remove) {
        StringBuilder output = new StringBuilder();
            for (int i = 0; i < base.length(); i++) {
                 if (base.substring(i).length() > remove.length() - 1 && base.substring(i, i + remove.length()).equals(remove)){
                     i += remove.length() - 1;
                 }else {
                     output.append(base.charAt(i));
                 }
            }
        return output.toString();
    }

    /**
     We'll say that a "triple" in a string is a char appearing three times in a row.
     Return the number of triples in the given string. The triples may overlap.
         countTriple("abcXXXabc") --> 1
         countTriple("xxxabyyyycd") --> 3
         countTriple("a") --> 0
     */
    public int countTriple(String str) {
        int counter = 0;
            for (int i = 0; i < str.length() - 2; i++) {
                 if (str.charAt(i) == str.charAt(i+1) && str.charAt(i) == str.charAt(i+2)) counter++;
            }
        return counter;
    }

    /**
     Given a string, look for a mirror image (backwards) string at both the beginning and end of the given string.
     In other words, zero or more characters at the very begining of the given string, and at the very end of the
     string in reverse order (possibly overlapping). For example, the string "abXYZba" has the mirror end "ab".
         mirrorEnds("abXYZba") --> "ab"
         mirrorEnds("abca") --> "a"
         mirrorEnds("aba") --> "aba"
     */
    public String mirrorEnds(String string) {
        StringBuilder output = new StringBuilder();
        // check if string is palindrome
        String reversedString = reverse(string);
        if (string.equals(reversedString)) return string;

            for (int i = 0; i <= string.length() / 2; i++) {
                if (string.substring(0, i + 1).equals(reverse(string.substring(string.length() - i - 1)))) {
                    output.append(string.charAt(i));
                }else{
                    break;
                }
            }
        return output.toString();
    }

    private static String reverse(String string){
        StringBuilder reversed = new StringBuilder();
        reversed.append(string);
        reversed.reverse();
        return reversed.toString();
    }

    /**
     Given a string, return a string where every appearance of the lowercase word "is" has been replaced with "is not".
     The word "is" should not be immediately preceeded or followed by a letter -- so for example the
     "is" in "this" does not count. (Note: Character.isLetter(char) tests if a char is a letter.)
         notReplace("is test") --> "is not test"
         notReplace("is-is") --> "is not-is not"
         notReplace("This is right") --> "This is not right"
     */
    public String notReplace(String str) {
        StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < str.length() - 1; i++) {
                String word = untilNextNonLetter(str.substring(i));
                if(str.substring(i).length() >= 2 && word.equals("is")){
                    stringBuilder.append("is not");
                        if (str.substring(i).length() > 2) stringBuilder.append(str.charAt(i + 2));
                    i += 2;
                } else {
                    stringBuilder.append(word);
                        if (str.substring(i).length() > word.length() && !Character.isLetter(str.charAt(i+word.length()))) {
                            stringBuilder.append(str.charAt(i + word.length()));
                        }
                    i += word.length();
                }
            }
        return stringBuilder.toString();
    }

    private String untilNextNonLetter(String str){
        StringBuilder word = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                if (Character.isLetter(str.charAt(i))){
                    word.append(str.charAt(i));
                } else {
                    break;
                }
            }
        return word.toString();
    }

    /**
     Given a string, return true if the number of appearances of "is" anywhere in the string is equal to the
     number of appearances of "not" anywhere in the string (case sensitive).
         equalIsNot("This is not") --> false
         equalIsNot("This is notnot") --> true
         equalIsNot("noisxxnotyynotxisi") --> true
     */
    public boolean equalIsNot(String str) {
        int isCounter = 0;
        int notCounter = 0;
            for (int i = 0; i < str.length(); i++) {
                if (i < str.length() - 2 && str.substring(i, i + 2).equals("is")) isCounter++;
                if (i <= str.length() - 3 && str.substring(i, i + 3).equals("not")) notCounter++;
            }
        return isCounter == notCounter;
    }

    /**
     Given a string, return the sum of the digits 0-9 that appear in the string, ignoring all other characters.
     Return 0 if there are no digits in the string. (Note: Character.isDigit(char) tests if a char is one
     of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)
         sumDigits("aa1bc2d3") --> 6
         sumDigits("aa11b33") --> 8
         sumDigits("Chocolate") --> 0
     */
    public int sumDigits(String str) {
        int sum = 0;
            for (int i = 0; i < str.length(); i++) {
                 if (Character.isDigit(str.charAt(i))) sum += Integer.parseInt(str.substring(i, i + 1));
            }
        return sum;
    }

    /**
     Given a string, return the length of the largest "block" in the string.
     A block is a run of adjacent chars that are the same.
         maxBlock("hoopla") --> 2
         maxBlock("abbCCCddBBBxx") --> 3
         maxBlock("") --> 0
     */
    public int maxBlock(String str) {
        if (str.length() == 0) return 0;
        int counter = 1;
        int maxCounter = 0;
            for (int i = 0; i < str.length() - 1; i++) {
                if (str.charAt(i) == str.charAt(i+1)) {
                    counter++;
                    if (counter > maxCounter) {
                        maxCounter = counter;
                    }
                }else {
                    counter = 1;
                }
            }
        return maxCounter;
    }
}
