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

    /**
     Given a list of strings, return a list of the strings, omitting any string that contains a "z".
     (Note: the str.contains(x) method returns a boolean)
         noZ(["aaa", "bbb", "aza"]) → ["aaa", "bbb"]
         noZ(["hziz", "hzello", "hi"]) → ["hi"]
         noZ(["hello", "howz", "are", "youz"]) → ["hello", "are"]
     */
    public List<String> noZ(List<String> strings) {
        return strings.stream()
                .filter(str -> !str.contains("z"))
                .collect(Collectors.toList());
    }


}
