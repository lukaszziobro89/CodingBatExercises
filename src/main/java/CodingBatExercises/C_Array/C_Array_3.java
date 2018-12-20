package CodingBatExercises.C_Array;

public class C_Array_3 {

    /**
     Consider the leftmost and rightmost appearances of some value in an array. We'll say that the "span"
     is the number of elements between the two inclusive. A single value has a span of 1.
     Returns the largest span found in the given array. (Efficiency is not a priority.)
         maxSpan([1, 2, 1, 1, 3]) → 4
         maxSpan([1, 4, 2, 1, 4, 1, 4]) → 6
         maxSpan([1, 4, 2, 1, 4, 4, 4]) → 6
     */
    public int maxSpan(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return 1;
        int maxSpan = 1;
            for (int i = 0; i < nums.length; i++) {
                int tempSpan = 1;
                    for (int j = i + 1; j < nums.length; j++) {
                        if (nums[i] == nums[j]) tempSpan = j + 1 - i;
                    }
                if (tempSpan > maxSpan) maxSpan = tempSpan;
            }
        return maxSpan;
    }

    /**
     Given a non-empty array, return true if there is a place to split the array so that the sum of the numbers
     on one side is equal to the sum of the numbers on the other side.
         canBalance([1, 1, 1, 2, 1]) → true
         canBalance([2, 1, 1, 2, 1]) → false
         canBalance([10, 10]) → true
     */
    public boolean canBalance(int[] nums) {
        int sumLeft;
        int sumRight;
        int j = 1;
            for (int i = 0; i < nums.length; i++) {
                sumLeft = sumUntil(nums, 0, i);
                sumRight = sumUntil(nums, j, nums.length);
                    if (sumLeft == sumRight) return true;
            }
        return false;
    }

    private int sumUntil(int[] nums, int start, int end){
        int sum = 0;
            for (int i = start; i < end; i++) {
                sum += nums[i];
            }
        return sum;
    }

    /**
     Given n>=0, create an array with the pattern {1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n} (spaces added to show the grouping).
     Note that the length of the array will be 1 + 2 + 3 ... + n, which is known to sum to exactly n*(n + 1)/2.
         seriesUp(3) → [1, 1, 2, 1, 2, 3]
         seriesUp(4) → [1, 1, 2, 1, 2, 3, 1, 2, 3, 4]
         seriesUp(2) → [1, 1, 2]
     */
    public int[] seriesUp(int n) {
        int k = 0;
        int[] output = new int[n*(n + 1)/2];
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    output[k++] = j;
                }
            }
        return output;
    }
}
