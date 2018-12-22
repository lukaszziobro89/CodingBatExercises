package CodingBatExercises.E_Functional_TEST;

import CodingBatExercises.E_Functional.E_Functional_1;
import org.junit.Test;
import java.util.Arrays;
import java.util.Collections;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class E_Functional_1_Test {

    private E_Functional_1 e_functional_1 = new E_Functional_1();

    @Test
    public void TEST_doubling(){
        assertEquals(Arrays.asList(2,4,6), e_functional_1.doubling(Arrays.asList(1,2,3)));
        assertEquals(Arrays.asList(12,16,12,16,-2), e_functional_1.doubling(Arrays.asList(6,8,6,8,-1)));
        assertEquals(Collections.emptyList(), e_functional_1.doubling(Collections.emptyList()));
    }

    @Test
    public void TEST_copies3(){
        assertEquals(Arrays.asList("aaa", "bbbbbb", "ccccccccc"), e_functional_1.copies3(Arrays.asList("a", "bb", "ccc")));
        assertEquals(Arrays.asList("242424", "aaa", ""), e_functional_1.copies3(Arrays.asList("24", "a", "")));
        assertEquals(Arrays.asList("hellohellohello", "theretherethere"), e_functional_1.copies3(Arrays.asList("hello", "there")));
    }

    @Test
    public void TEST_rightDigit(){
        assertEquals(Arrays.asList(1,2,3), e_functional_1.rightDigit(Arrays.asList(1, 22, 93)));
        assertEquals(Arrays.asList(6,8,6,8,1), e_functional_1.rightDigit(Arrays.asList(16, 8, 886, 8, 1)));
        assertEquals(Arrays.asList(0,0), e_functional_1.rightDigit(Arrays.asList(10, 0)));
    }

    @Test
    public void TEST_suqare(){
        assertEquals(Arrays.asList(1,4,9), e_functional_1.square(Arrays.asList(1,2,3)));
        assertEquals(Arrays.asList(36,64,36,64,1), e_functional_1.square(Arrays.asList(6,8,-6,-8,1)));
        assertEquals(Collections.emptyList(), e_functional_1.square(Collections.emptyList()));
    }

    @Test
    public void TEST_moreY(){
        assertEquals(Arrays.asList("yay", "yby", "ycy"), e_functional_1.moreY(Arrays.asList("a", "b", "c")));
        assertEquals(Arrays.asList("yhelloy", "ytherey"), e_functional_1.moreY(Arrays.asList("hello", "there")));
        assertEquals(Collections.singletonList("yyayy"), e_functional_1.moreY(Collections.singletonList("yay")));
    }

    @Test
    public void TEST_lower(){
        assertEquals(Arrays.asList("hello", "hi"), e_functional_1.lower(Arrays.asList("Hello", "Hi")));
        assertEquals(Arrays.asList("aaa", "bbb", "ccc"), e_functional_1.lower(Arrays.asList("AAA", "BBB", "ccc")));
        assertEquals(Arrays.asList("kitten", "chocolate"), e_functional_1.lower(Arrays.asList("KitteN", "ChocolaTE")));
    }
}
