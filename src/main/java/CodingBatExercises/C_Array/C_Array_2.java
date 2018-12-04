package CodingBatExercises.C_Array;

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


}
