package CodingBatExercises.B_String;

public class B_String_2 {
    /**
     Given a string, return a string where for every char in the original, there are two chars.
         doubleChar("The") --> "TThhee"
         doubleChar("AAbb") --> "AAAAbbbb"
         doubleChar("Hi-There") --> "HHii--TThheerree"
     */
    public String doubleChar(String str) {
        StringBuilder output = new StringBuilder();
        for(char letter : str.toCharArray()){
            output.append(letter).append(letter);
        }
        return output.toString();
    }

    /**
     Return the number of times that the string "code" appears anywhere in the given string, except we'll accept
     any letter for the 'd', so "cope" and "cooe" count.
         countCode("aaacodebbb") --> 1
         countCode("codexxcode") --> 2
         countCode("cozexxcope") --> 2
     */
    public int countCode(String str) {
        int counter = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.substring(i, i + 2).equals("co") && str.charAt(i + 3)=='e'){
                counter++;
            }
        }
        return counter;
    }

    /**
     Return true if the given string containsChar a "bob" string, but where the middle 'o' char can be any char.
         bobThere("abcbob") --> true
         bobThere("b9b") --> true
         bobThere("bac") --> false
     */
    public boolean bobThere(String str) {
        int counter = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b'){
                counter++;
            }
        }
        return counter > 0;
    }

    /**
     Given a string and an int n, return a string made of n repetitions of the last n characters of the string.
     You may assume that n is between 0 and the length of the string, inclusive.
         repeatEnd("Hello", 3) --> "llollollo"
         repeatEnd("Hello", 2) --> "lolo"
         repeatEnd("Hello", 1) --> "o"
     */
    public String repeatEnd(String str, int n) {
        String end = str.substring(str.length() - n);
        if (n == 0){
            return "";
        }else if (n == str.length()){
            return str;
        }else {
            StringBuilder outputString = new StringBuilder();
            for (int i = 0; i < n; i++) {
                outputString.append(end);
            }
            return outputString.toString();
        }
    }

    /**
     Given a string, consider the prefix string made of the first N chars of the string.
     Does that prefix string appear somewhere else in the string--> Assume that the string is not empty
     and that N is in the range 1..str.length().
         prefixAgain("abXYabc", 1) --> true
         prefixAgain("abXYabc", 2) --> true
         prefixAgain("abXYabc", 3) --> false
     */
    public boolean prefixAgain(String str, int n) {
        String nCharsString = str.substring(0, n);
        for (int i = n; i < str.length() - n; i++) {
            if (str.substring(i, i + n).equals(nCharsString)){
                return true;
            }
        }
        return false;
    }

    /**
     Returns true if for every '*' (star) in the string, if there are chars both immediately before and after the star,
     they are the same.
         sameStarChar("xy*yzz") --> true
         sameStarChar("xy*zzz") --> false
         sameStarChar("*xa*az") --> true
         sameStarChar("*xaaz") --> false
         sameStarChar("xaaz*") --> false
     */
    public boolean sameStarChar(String str) {
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == '*' && str.charAt(i - 1) == str.charAt(i + 1)){
                return true;
            }
        }
        return false;
    }

    /**
     Return a version of the given string, where for every star (*) in the string the star and
     the chars immediately to its left and right are gone. So "ab*cd" yields "ad" and "ab**cd" also yields "ad".
         starOut("ab*cd") --> "ad"
         starOut("ab**cd") --> "ad"
         starOut("sm*eilly") --> "silly"
     */
    public String starOut(String str) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
             if (str.charAt(i) == '*') continue;
             if (i > 0 && str.charAt(i - 1) =='*') continue;
             if (i < str.length() - 1 && str.charAt(i + 1) =='*') continue;
                output.append(str.charAt(i));
        }
        return output.toString();
    }

    /**
     Return the number of times that the string "hi" appears anywhere in the given string.
         countHi("abc hi ho") --> 1
         countHi("ABChi hi") --> 2
         countHi("hihi") --> 2
     */
    public int countHi(String str) {
        int counter = 0;
        for (int i = 0; i < str.length() - 1; i++) {
             if (str.substring(i, i + 2).equals("hi")){
                 counter++;
             }
        }
        return counter;
    }

    /**
     Given two strings, return true if either of the strings appears at the very end of the other string,
     ignoring upper/lower case differences (in other words, the computation should not be "case sensitive").
     Note: str.toLowerCase() returns the lowercase version of a string.
         endOther("Hiabc", "abc") --> true
         endOther("AbC", "HiaBc") --> true
         endOther("abc", "abXabc") --> true
         endOther("abcde", "bc") --> false
     */
    public boolean endOther(String a, String b) {
        return a.toLowerCase().endsWith(b.toLowerCase()) || b.toLowerCase().endsWith(a.toLowerCase());
    }

    /**
     We'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a 'y' char
     somewhere later in the string. So "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's.
     Return true if the given string is xy-balanced.
         xyBalance("aaxbby") --> true
         xyBalance("aaxbb") --> false
         xyBalance("yaaxbb") --> false
     */
    public boolean xyBalance(String str) {
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'x'){
                if (containsChar(str.substring(0, i), 'x')){
                    return false;
                }else if (containsChar(str.substring(i, str.length()), 'y')){
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean containsChar(String str, char character){
        return (str.indexOf(character) >= 0);
    }

    /**
     Given a string and an int n, return a string made of the first n characters of the string, followed by the first n-1
     characters of the string, and so on. You may assume that n is between 0 and the length of the string, inclusive
     (i.e. n >= 0 and n <= str.length()).
         repeatFront("Chocolate", 4) --> "ChocChoChC"
         repeatFront("Chocolate", 3) --> "ChoChC"
         repeatFront("Ice Cream", 2) --> "IcI"
     */
    public String repeatFront(String str, int n) {
        StringBuilder output = new StringBuilder();
        int k = n;
            if (n >= 0 && n <= str.length()){
                for (int i = 0; i < n; i++) {
                     output.append(str, 0, k);
                     k--;
                }
            }
            return output.toString();
    }

    /**
     Given a string, does "xyz" appear in the middle of the string--> To define middle, we'll say that the number of chars
     to the left and right of the "xyz" must differ by at most one. This problem is harder than it looks.
         xyzMiddle("AAxyzBB") --> true
         xyzMiddle("AxyzBB") --> true
         xyzMiddle("AxyzBBB") --> false
     */
    public boolean xyzMiddle(String str) {
        int beginIndex = 0;
        int endIndex = 0;
            for (int i = 0; i < str.length() - 2; i++) {
                 if (str.substring(i, i + 3).equals("xyz")){
                     beginIndex = i;
                     endIndex = i + 3;
                 }
            }
        return Math.abs(str.substring(0, beginIndex).length() - str.substring(endIndex).length()) <= 1;
    }

    /**
     Given a string, compute a new string by moving the first char to come after the next two chars, so "abc" yields "bca".
     Repeat this process for each subsequent group of 3 chars, so "abcdef" yields "bcaefd". Ignore any group of fewer
     than 3 chars at the end.
         oneTwo("abc") --> "bca"
         oneTwo("tca") --> "cat"
         oneTwo("tcagdo") --> "catdog"
     */
    public String oneTwo(String str) {
        StringBuilder output = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                 if (i <= str.length() - 3){
                     output.append(str, i + 1, i + 3);
                     output.append(str, i, i + 1);
                     i += 2;
                 }
            }
        return output.toString();
    }

    /**
     Given a string and a non-empty word string, return a version of the original String where all chars have been
     replaced by pluses ("+"), except for appearances of the word string which are preserved unchanged.
         plusOut("12xy34", "xy") --> "++xy++"
         plusOut("12xy34", "1") --> "1+++++"
         plusOut("12xy34xyabcxy", "xy") --> "++xy++xy+++xy"
     */
    public String plusOut(String str, String word) {
        str = str.replace(word, "@@");
            for (int i = 0; i < str.length(); i++) {
                 if (str.charAt(i) != '@'){
                     str = str.replace(str.substring(i, i + 1), "+");
                 }
            }
        str = str.replace("@@", word);
        return str;
    }

    /**
     Return true if the string "cat" and "dog" appear the same number of times in the given string.
         catDog("catdog") --> true
         catDog("catcat") --> false
         catDog("1cat1cadodog") --> true
     */
    public boolean catDog(String str) {
        int cat = 0;
        int dog = 0;
        for (int i = 0; i <= str.length() -3; i++) {
             if (str.substring(i, i + 3).equals("cat")){
                 cat++;
             }else if (str.substring(i, i + 3).equals("dog")){
                dog++;
            }
        }
        return cat == dog;
    }

    /**
     Return true if the given string containsChar an appearance of "xyz" where the xyz is not directly
     preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.
         xyzThere("abcxyz") --> true
         xyzThere("abc.xyz") --> false
         xyzThere("xyz.abc") --> true
     */
    public boolean  xyzThere(String str) {
        if (str.startsWith("xyz")){
            return true;
        }
            for (int i = 0; i < str.length() - 2; i++) {
                if (str.substring(i, i + 3).equals("xyz") && str.charAt(i - 1) != '.'){
                         return true;
                }
            }
        return false;
    }

    /**
     Given two strings, a and b, create a bigger string made of the first char of a, the first char of b,
     the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.
         mixString("abc", "xyz") --> "axbycz"
         mixString("Hi", "There") --> "HTihere"
         mixString("xxxx", "There") --> "xTxhxexre"
     */
    public String mixString(String a, String b) {
        int start = 0;
        int longerIndex;
        int shorterIndex;
        String longerString;
        StringBuilder output = new StringBuilder();
            if (a.length() >= b.length()){
                longerIndex = a.length();
                longerString = a;
                shorterIndex = b.length();
            } else {
                longerIndex = b.length();
                longerString = b;
                shorterIndex = a.length();
            }
                for (int i = 0; i < shorterIndex; i++) {
                    output.append(a.charAt(i));
                    output.append(b.charAt(i));
                    start++;
                }

                for (int i = start; i < longerIndex; i++) {
                    output.append(longerString.charAt(i));

                }
        return output.toString();
    }

    /**
     Given two strings, word and a separator sep, return a big string made of count occurrences of the word,
     separated by the separator string.
         repeatSeparator("Word", "X", 3) --> "WordXWordXWord"
         repeatSeparator("This", "And", 2) --> "ThisAndThis"
         repeatSeparator("This", "And", 1) --> "This"
     */
    public String repeatSeparator(String word, String sep, int count) {
        StringBuilder output = new StringBuilder();
            for (int i = 0; i < count; i++) {
                if (i == count - 1){
                    output.append(word);
                } else {
                    output.append(word).append(sep);
                }
            }
        return output.toString();
    }

    /**
     A sandwich is two pieces of bread with something in between. Return the string that is between the first and last
     appearance of "bread" in the given string, or return the empty string "" if there are not two pieces of bread.
         getSandwich("breadjambread") --> "jam"
         getSandwich("xxbreadjambreadyy") --> "jam"
         getSandwich("xxbreadyy") --> ""
         getSandwich("breadyybread") --> "yy"
     */
    public String getSandwich(String str) {
        if(str.length() <= 10) return "";
        StringBuilder output = new StringBuilder();
        int beginIndex=0;
        int endIndex=0;
        int bread = 0;
            for (int i = 0; i < str.length() - 4; i++) {
                 if (str.substring(i, i + 5).equals("bread")){
                     bread++;
                         if(bread == 1){
                             beginIndex = i + 5;
                             i+=5;
                         } else if (bread == 2){
                             endIndex = i;
                         }
                 }
            }
        output.append(str, beginIndex, endIndex);
        return output.toString();
    }

    /**
     Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'.
     Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".
         zipZap("zipXzap") --> "zpXzp"
         zipZap("zopzop") --> "zpzp"
         zipZap("zzzopzop") --> "zzzpzp"
     */
    public String zipZap(String str) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
             if (str.substring(i).length() >= 2 && str.charAt(i)=='z' && str.charAt(i + 2)=='p'){
                 output.append(str.charAt(i)).append(str.charAt(i + 2));
                 i += 2;
             }else {
                 output.append(str.charAt(i));
             }
        }
        return output.toString();
    }

    /**
     Given a string and a non-empty word string, return a string made of each char just before and just after
     every appearance of the word in the string. Ignore cases where there is no char before or after the word,
     and a char may be included twice if it is between two words.
         wordEnds("abcXY123XYijk", "XY") --> "c13i"
         wordEnds("XY123XY", "XY") --> "13"
         wordEnds("XY1XY", "XY") --> "11"
     */
    public String wordEnds(String str, String word) {
        return "";
    }
}
