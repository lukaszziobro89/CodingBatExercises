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



}
