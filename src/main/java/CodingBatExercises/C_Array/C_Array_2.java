package CodingBatExercises.C_Array;

import java.util.Arrays;

public class C_Array_2 {
    /**
    Return the number of even ints in the given array. Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.
        countEvens([2, 1, 2, 3, 4]) → 3
        countEvens([2, 2, 0]) → 3
        countEvens([1, 3, 5]) → 0
     */
    public int countEvens(int[] nums) {
        int counter = 0;
            for(int num : nums){
                if (num % 2 == 0) counter++;
            }
        return counter;
    }

    /**
    Return the sum of the numbers in the array, returning 0 for an empty array. Except the number 13 is very unlucky,
    so it does not count and numbers that come immediately after a 13 also do not count.
        sum13([1, 2, 2, 1]) → 6
        sum13([1, 1]) → 2
        sum13([1, 2, 2, 1, 13]) → 6
        sum13([1, 13, 2, 1]) → 2
     */
    public int sum13(int[] nums) {
        if (nums.length == 0) return 0;
        int sum = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 13){
                    sum += nums[i];
                } else {
                    i += 1;
                }
            }
        return sum;
    }

    /**
    Given an array of ints, return true if the array contains no 1's and no 3's.
        lucky13([0, 2, 4]) → true
        lucky13([1, 2, 3]) → false
        lucky13([1, 2, 4]) → false
     */
    public boolean lucky13(int[] nums) {
            for (int num : nums) {
                if (num == 1 || num == 3) return false;
            }
        return true;
    }

    /**
     Given a number n, create and return a new int array of length n, containing the numbers 0, 1, 2, ... n-1.
     The given n may be 0, in which case just return a length 0 array. You do not need a separate if-statement for the
     length-0 case; the for-loop should naturally execute 0 times in that case, so it just works. The syntax to make
     a new int array is: new int[desired_length]
         fizzArray(4) --> [0, 1, 2, 3]
         fizzArray(1) --> [0]
         fizzArray(10) --> [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
     */
    public int[] fizzArray(int n) {
        int[] output = new int[n];
        for (int i = 0; i < output.length; i++) {
            output[i] = i;
        }
        return output;
    }

    /**
     Given an array of ints, return true if it contains no 1's or it contains no 4's.
         no14([1, 2, 3]) --> true
         no14([1, 2, 3, 4]) --> false
         no14([2, 3, 4]) --> true
     */
    public boolean no14(int[] nums) {
        int no1s = 0;
        int no4s = 0;
        for (int num : nums) {
            if (num == 1) no1s++;
            if (num == 4) no4s++;
        }
        return (no1s > 0 ^ no4s > 0);
    }

    /**
     Given arrays nums1 and nums2 of the same length, for every element in nums1, consider the corresponding
     element in nums2 (at the same index). Return the count of the number of times that the two elements
     differ by 2 or less, but are not equal.
         matchUp([1, 2, 3], [2, 3, 10]) --> 2
         matchUp([1, 2, 3], [2, 3, 5]) --> 3
         matchUp([1, 2, 3], [2, 3, 3]) --> 2
     */
    public int matchUp(int[] nums1, int[] nums2) {
        int counter = 0;
        for (int i = 0; i < nums1.length; i++) {
            if ((Math.abs(nums1[i] - nums2[i]) <= 2) && nums1[i] != nums2[i]) counter++;
        }
        return counter;
    }

    /**
     Given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other.
         modThree([2, 1, 3, 5]) --> true
         modThree([2, 1, 2, 5]) --> false
         modThree([2, 4, 2, 5]) --> true
         modThree([2, 1, 2, 1, 4, 8, 10]) --> true
     */
    public boolean modThree(int[] nums) {
        int evenCounter = 0;
        int oddCounter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                evenCounter++;
                oddCounter = 0;
                if (evenCounter == 3){
                    return true;
                }
            }
            if (nums[i] % 2 != 0) {
                oddCounter++;
                evenCounter = 0;
                if (oddCounter == 3){
                    return true;
                }
            }
        }
        return (evenCounter >= 3 ^ oddCounter >= 3);
    }

    /**
     Return true if the group of N numbers at the start and end of the array are the same.
     For example, with {5, 6, 45, 99, 13, 5, 6}, the ends are the same for n=0 and n=2, and false for n=1 and n=3.
     You may assume that n is in the range 0..nums.length inclusive.
         sameEnds([5, 6, 45, 99, 13, 5, 6], 1) --> false
         sameEnds([5, 6, 45, 99, 13, 5, 6], 2) --> true
         sameEnds([5, 6, 45, 99, 13, 5, 6], 3) --> false
     */
    public boolean sameEnds(int[] nums, int len) {
        return Arrays.equals(
                Arrays.copyOfRange(nums, 0, len),
                Arrays.copyOfRange(nums, nums.length - len, nums.length));
    }

    /**
     Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}.
     You may modify and return the given array, or return a new array.
         shiftLeft([6, 2, 5, 3]) --> [2, 5, 3, 6]
         shiftLeft([1, 2]) --> [2, 1]
         shiftLeft([1]) --> [1]
     */
    public int[] shiftLeft(int[] nums) {
        int[] output = new int[nums.length];
        for (int i = 0; i < output.length; i++) {
            if (i == output.length - 1){
                output[i] = nums[0];
            }else {
                output[i] = nums[i + 1];
            }
        }
        return output;
    }

    /**
     Given a non-empty array of ints, return a new array containing the elements from the original array that come
     after the last 4 in the original array. The original array will contain at least one 4.
     Note that it is valid in java to create an array of length 0.
         post4([2, 4, 1, 2]) --> [1, 2]
         post4([4, 1, 4, 2]) --> [2]
         post4([4, 4, 1, 2, 3]) --> [1, 2, 3]
     */
    public int[] post4(int[] nums) {
        int last4Index = 0;
        int i = 0;
        for (i = 0; i < nums.length; i++) {
            if (nums[i] == 4) last4Index = i;
        }
        last4Index++;
        int[] output = new int[nums.length - last4Index];
        for (int j = 0; j < output.length; j++) {
            output[j] = nums[last4Index++];
        }
        return output;
    }

    /**
     Return a version of the given array where all the 10's have been removed. The remaining elements should shift left
     towards the start of the array as needed, and the empty spaces a the end of the array should be 0.
     So {1, 10, 10, 2} yields {1, 2, 0, 0}. You may modify and return the given array or make a new array.
         withoutTen([1, 10, 10, 2]) --> [1, 2, 0, 0]
         withoutTen([10, 2, 10]) --> [2, 0, 0]
         withoutTen([1, 99, 10]) --> [1, 99, 0]
     */
    public int[] withoutTen(int[] nums) {
        int[] output = new int[nums.length];
        int i = 0;
        for (int num : nums){
            if (num != 10){
                output[i] = num;
                i++;
            }
        }
        return output;
    }

    /**
     This is slightly more difficult version of the famous FizzBuzz problem which is sometimes given as a first problem
     for job interviews. Consider the series of numbers beginning at start and running up to but not including end,
     so for example start=1 and end=5 gives the series 1, 2, 3, 4. Return a new String[] array containing the string
     form of these numbers, except for multiples of 3, use "Fizz" instead of the number, for multiples of 5 use "Buzz",
     and for multiples of both 3 and 5 use "FizzBuzz". In Java, String.valueOf(xxx) will make the String form of an int
     or other type. This version is a little more complicated than the usual version since you have to allocate and index
     into an array instead of just printing, and we vary the start/end instead of just always doing 1..100.
        fizzBuzz(1, 6) → ["1", "2", "Fizz", "4", "Buzz"]
        fizzBuzz(1, 8) → ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7"]
        fizzBuzz(1, 11) → ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"]
     */
    public String[] fizzBuzz(int start, int end) {
        String[] output = new String[end - start];
            for (int i = 0; i < output.length; i++) {
                    if (start % 3 == 0 && start % 5 == 0){
                        output[i] = "FizzBuzz";
                    }else if (start % 3 == 0){
                        output[i] = "Fizz";
                    }else if (start % 5 == 0) {
                        output[i] = "Buzz";
                    } else {
                        output[i] = String.valueOf(start);
                    }
                start++;
            }
        return output;
    }

    /**
     Given an array length 1 or more of ints, return the difference between the largest and smallest values in the array.
     Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or larger of two values.
         bigDiff([10, 3, 5, 6]) → 7
         bigDiff([7, 2, 10, 9]) → 8
         bigDiff([2, 10, 7, 2]) → 8
     */
    public int bigDiff(int[] nums) {
        int max = nums[0];
        int min = nums[0];
            for (int i = 1; i < nums.length; i++) {
                max = Math.max(max, nums[i]);
                min = Math.min(min, nums[i]);
            }
        return (max - min);
    }

    /**
     Return the sum of the numbers in the array, except ignore sections of numbers starting with a 6 and extending to the
     next 7 (every 6 will be followed by at least one 7). Return 0 for no numbers.
         sum67([1, 2, 2]) → 5
         sum67([1, 2, 2, 6, 99, 99, 7]) → 5
         sum67([1, 1, 6, 7, 2]) → 4
    */
    public int sum67(int[] nums) {
        int sum = 0;
        boolean is6 = false;
        boolean is7 = false;
        for (int num : nums) {
            if (num == 6) is6 = true;
            if (num == 7) is7 = true;
            if (is6) {
                if (is7) {
                    is6 = false;
                }
            } else {
                sum += num;
            }
        }
        return sum;
    }

    /**
     Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.
         sum28([2, 3, 2, 2, 4, 2]) → true
         sum28([2, 3, 2, 2, 4, 2, 2]) → false
         sum28([1, 2, 3, 4]) → false
     */
    public boolean sum28(int[] nums) {
        int sum8 = 0;
            for(int num : nums){
                if (num == 2) sum8+=2;
            }
        return sum8 == 8;
    }

    /**
     Given an array of ints, return true if every element is a 1 or a 4.
         only14([1, 4, 1, 4]) → true
         only14([1, 4, 2, 4]) → false
         only14([1, 1]) → true
     */
    public boolean only14(int[] nums) {
        boolean isOnly14 = true;
            for (int num : nums) {
                if (num != 1 && num != 4) isOnly14 = false;
            }
        return isOnly14;
    }

    /**
     We'll say that a value is "everywhere" in an array if for every pair of adjacent elements in the array,
     at least one of the pair is that value. Return true if the given value is everywhere in the array.
         isEverywhere([1, 2, 1, 3], 1) → true
         isEverywhere([1, 2, 1, 3], 2) → false
         isEverywhere([1, 2, 1, 3, 4], 1) → false
     */
    public boolean isEverywhere(int[] nums, int val) {
        return false;
    }

    /**

     */

    /**

     */


}
