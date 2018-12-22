package CodingBatExercises.E_Functional;

import java.util.List;
import java.util.stream.Collectors;

public class E_Functional_2 {
    /**
    Given a list of integers, return a list of the integers, omitting any that are less than 0.
        noNeg([1, -2]) → [1]
        noNeg([-3, -3, 3, 3]) → [3, 3]
        noNeg([-1, -1, -1]) → []
     */
    public List<Integer> noNeg(List<Integer> nums) {
        return nums.stream()
                .filter(num -> num >= 0)
                .collect(Collectors.toList());
    }

}
