package CodingBatExercises.Other;

import java.util.ArrayList;
import java.util.List;

public class AP_CS_A {
    /**
     Given an array of scores, return true if each score is equal or greater than the one before.
     The array will be length 2 or more.
         scoresIncreasing([1, 3, 4]) → true
         scoresIncreasing([1, 3, 2]) → false
         scoresIncreasing([1, 1, 4]) → true
     */
    public boolean scoresIncreasing(int[] scores) {
        for (int i = 0; i < scores.length - 1; i++) {
            if (scores[i + 1] < scores[i]) return false;
        }
        return true;
    }

    /**
     Given an array of scores, compute the int average of the first half and the second half,
     and return whichever is larger. We'll say that the second half begins at index length/2.
     The array length will be at least 2. To practice decomposition, write a separate helper method
     int average(int[] scores, int start, int end) { which computes the average of the elements
     between indexes start..end. Call your helper method twice to implement scoresAverage().
     Write your helper method after your scoresAverage() method in the JavaBat text area.
     Normally you would compute averages with doubles, but here we use ints so the expected results are exact.
         scoresAverage([2, 2, 4, 4]) → 4
         scoresAverage([4, 4, 4, 2, 2, 2]) → 4
         scoresAverage([3, 4, 5, 1, 2, 3]) → 4
     */
    public int scoresAverage(int[] scores) {
            int leftSum = average(scores, 0, scores.length/2);
            int rightSum = average(scores, scores.length/2, scores.length);
        return leftSum > rightSum ? leftSum : rightSum;
    }

    private int average(int[] scores, int start, int end){
        int sum = 0;
            for (int i = start; i < end ; i++) {
                sum += scores[i];
            }
        return (sum / (end-start));
    }

    /**
     Given an array of strings, return a new List (e.g. an ArrayList) where all the strings of the given
     length are omitted. See wordsWithout() below which is more difficult because it uses arrays.
         wordsWithoutList(["a", "bb", "b", "ccc"], 1) → ["bb", "ccc"]
         wordsWithoutList(["a", "bb", "b", "ccc"], 3) → ["a", "bb", "b"]
         wordsWithoutList(["a", "bb", "b", "ccc"], 4) → ["a", "bb", "b", "ccc"]
     */

    public List wordsWithoutList(String[] words, int len) {
        ArrayList<String> output = new ArrayList<>();
            for (String word : words){
                if (word.length() != len) output.add(word);
            }
        return output;
    }

    /**
     Given an array of positive ints, return a new array of length "count" containing the first even
     numbers from the original array. The original array will contain at least "count" even numbers.
         copyEvens([3, 2, 4, 5, 8], 2) → [2, 4]
         copyEvens([3, 2, 4, 5, 8], 3) → [2, 4, 8]
         copyEvens([6, 1, 2, 4, 5, 8], 3) → [6, 2, 4]
     */
    public int[] copyEvens(int[] nums, int count) {
        int[] output = new int[count];
        int j = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] % 2 == 0) {
                    output[j++] = nums[i];
                    if (i == count) break;
                }
            }
        return output;
    }

    /**
     The "key" array is an array containing the correct answers to an exam, like {"a", "a", "b", "b"}.
     The "answers" array contains a student's answers, with "?" representing a question left blank.
     The two arrays are not empty and are the same length. Return the score for this array of answers,
     giving +4 for each correct answer, -1 for each incorrect answer, and +0 for each blank answer.
         scoreUp(["a", "a", "b", "b"], ["a", "c", "b", "c"]) → 6
         scoreUp(["a", "a", "b", "b"], ["a", "a", "b", "c"]) → 11
         scoreUp(["a", "a", "b", "b"], ["a", "a", "b", "b"]) → 16
         scoreUp(["a", "a", "b", "b"], ["a", "?", "c", "?"]) → 3
     */
    public int scoreUp(String[] key, String[] answers) {
        int score = 0;
        int i = 0;
            for (String answer : answers){
                if (answer.equals("?")) continue;
                if (answer.equals(key[i])) score += 4;
                if (!(answer.equals(key[i]))) score -= 1;
                i++;
            }
        return score;
    }

    /**
     We have an array of heights, representing the altitude along a walking trail. Given start/end indexes into
     the array, return the sum of the changes for a walk beginning at the start index and ending at the end index.
     For example, with the heights {5, 3, 6, 7, 2} and start=2, end=4 yields a sum of 1 + 5 = 6.
     The start and end index will both be valid indexes into the array with start <= end.
         sumHeights([5, 3, 6, 7, 2], 2, 4) → 6
         sumHeights([5, 3, 6, 7, 2], 0, 1) → 2
         sumHeights([5, 3, 6, 7, 2], 0, 4) → 11
     */
    public int sumHeights(int[] heights, int start, int end) {
        int sum = 0;
            for (int i = start; i < end; i++) {
                sum += Math.abs(heights[i + 1] - heights[i]);
            }
        return sum;
    }

    /**
     We have data for two users, A and B, each with a String name and an int id. The goal is to order the users
     such as for sorting. Return -1 if A comes before B, 1 if A comes after B, and 0 if they are the same.
     Order first by the string names, and then by the id numbers if the names are the same.
     Note: with Strings str1.compareTo(str2) returns an int value which is negative/0/positive to indicate
     how str1 is ordered to str2 (the value is not limited to -1/0/1).
     (On the AP, there would be two User objects, but here the code simply takes the two strings and two ints directly.
     The code logic is the same.)
         userCompare("bb", 1, "zz", 2) → -1
         userCompare("bb", 1, "aa", 2) → 1
         userCompare("bb", 1, "bb", 1) → 0
     */
    public int userCompare(String aName, int aId, String bName, int bId) {
        if(aName.compareTo(bName) < 0) return -1;
        if (aName.compareTo(bName) > 0) return 1;
        if (aName.compareTo(bName) == 0){
            if (aId > bId) return -1;
            if (aId < bId) return 1;
        }
        return 0;
    }

    /**
     Given an array of scores, return true if there are scores of 100 next to each other in the array.
     The array length will be at least 2.
         scores100([1, 100, 100]) → true
         scores100([1, 100, 99, 100]) → false
         scores100([100, 1, 100, 100]) → true
     */
    public boolean scores100(int[] scores) {
            for (int i = 0; i < scores.length - 1; i++) {
                if (scores[i] == 100 && scores[i + 1]==100) return true;
            }
        return false;
    }

    /**
     Given an array of strings, return the count of the number of strings with the given length
         wordsCount(["a", "bb", "b", "ccc"], 1) → 2
         wordsCount(["a", "bb", "b", "ccc"], 3) → 1
         wordsCount(["a", "bb", "b", "ccc"], 4) → 0
     */
    public int wordsCount(String[] words, int len) {
        int counter = 0;
            for (String word : words) {
                if (word.length() == len) counter++;
            }
        return counter;
    }

    /**
     Given a positive int n, return true if it contains a 1 digit. Note: use % to get the rightmost digit,
     and / to discard the rightmost digit.
         hasOne(10) → true
         hasOne(22) → false
         hasOne(220) → false
     */
    public boolean hasOne(int n) {
        String num = Integer.toString(n);
            for (int i = 0; i < num.length(); i++) {
                 int lastDigit = n % 10;
                 if (lastDigit == 1) return true;
                 n /= 10;
            }
        return false;
    }

    /**
     We'll say that a positive int n is "endy" if it is in the range 0..10 or 90..100 (inclusive).
     Given an array of positive ints, return a new array of length "count" containing the first endy numbers from
     the original array. Decompose out a separate isEndy(int n) method to test if a number is endy.
     The original array will contain at least "count" endy numbers.
         copyEndy([9, 11, 90, 22, 6], 2) → [9, 90]
         copyEndy([9, 11, 90, 22, 6], 3) → [9, 90, 6]
         copyEndy([12, 1, 1, 13, 0, 20], 2) → [1, 1]
     */
    public int[] copyEndy(int[] nums, int count) {
        int[] output = new int[count];
        int i = 0;
            for (int num : nums) {
                if (isEndy(num)) {
                    output[i++] = num;
                    if (i == count) break;
                }
            }
        return output;
    }

    private boolean isEndy(int n){
        return (n >= 0 && n <= 10) || (n >= 90 && n <= 100);
    }

    /**
     Given an array of strings, return a new array without the strings that are equal to the target string.
     One approach is to count the occurrences of the target string, make a new array of the correct length,
     and then copy over the correct strings.
         wordsWithout(["a", "b", "c", "a"], "a") → ["b", "c"]
         wordsWithout(["a", "b", "c", "a"], "b") → ["a", "c", "a"]
         wordsWithout(["a", "b", "c", "a"], "c") → ["a", "b", "a"]
     */
    public String[] wordsWithout(String[] words, String target) {
        int countTarget = 0;
            for (String word : words) {
                if (word.equals(target)) countTarget++;
            }
        String[] output = new String[words.length - countTarget];
            int i = 0;
            for (String word : words) {
                if (!(word.equals(target))) {
                    output[i] = word;
                    i++;
                }
            }
        return output;
    }

    /**
     (A variation on the sumHeights problem.) We have an array of heights, representing the altitude along
     a walking trail. Given start/end indexes into the array, return the sum of the changes for a walk beginning
     at the start index and ending at the end index, however increases in height count double.
     For example, with the heights {5, 3, 6, 7, 2} and start=2, end=4 yields a sum of 1*2 + 5 = 7.
     The start end end index will both be valid indexes into the array with start <= end.
         sumHeights2([5, 3, 6, 7, 2], 2, 4) → 7
         sumHeights2([5, 3, 6, 7, 2], 0, 1) → 2
         sumHeights2([5, 3, 6, 7, 2], 0, 4) → 15
     */
    public int sumHeights2(int[] heights, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            if(heights[i + 1] - heights[i] > 0){
                sum += 2*(Math.abs(heights[i + 1] - heights[i]));
            }else{
                sum += Math.abs(heights[i + 1] - heights[i]);
            }
        }
        return sum;
    }

    /**
     Given an array of scores sorted in increasing order, return true if the array contains 3 adjacent scores
     that differ from each other by at most 2, such as with {3, 4, 5} or {3, 5, 5}.
         scoresClump([3, 4, 5]) → true
         scoresClump([3, 4, 6]) → false
         scoresClump([1, 3, 5, 5]) → true
     */
    public boolean scoresClump(int[] scores) {
            for (int i = 0; i < scores.length - 2; i++) {
                if (Math.abs(scores[i + 1] - scores[i]) <= 2 &&
                        Math.abs(scores[i + 2] - scores[i + 1]) <= 2 &&
                        Math.abs(scores[i + 2] - scores[i]) <= 2) return true;
            }
        return false;
    }

    /**
     Given an array of strings, return a new array containing the first N strings. N will be in the range 1..length.
         wordsFront(["a", "b", "c", "d"], 1) → ["a"]
         wordsFront(["a", "b", "c", "d"], 2) → ["a", "b"]
         wordsFront(["a", "b", "c", "d"], 3) → ["a", "b", "c"]
     */
    public String[] wordsFront(String[] words, int n) {
        String[] output = new String[n];
            for (int i = 0; i < n; i++) {
                output[i] = words[i];
            }
        return output;
    }

    /**
     Given 2 arrays that are the same length containing strings, compare the 1st string in one array to the 1st string
     in the other array, the 2nd to the 2nd and so on. Count the number of times that the 2 strings are non-empty and
     start with the same char. The strings may be any length, including 0.
         matchUp(["aa", "bb", "cc"], ["aaa", "xx", "bb"]) → 1
         matchUp(["aa", "bb", "cc"], ["aaa", "b", "bb"]) → 2
         matchUp(["aa", "bb", "cc"], ["", "", "ccc"]) → 1
     */
    public int matchUp(String[] a, String[] b) {
        int counter = 0;
            for (int i = 0; i < a.length; i++) {
                if (a[i].length() > 0 && b[i].length() > 0 && a[i].charAt(0) == b[i].charAt(0)) counter++;
            }
        return counter;
    }
}
