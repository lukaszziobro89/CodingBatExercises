package CodingBatExercises.E_Functional_TEST;

import CodingBatExercises.E_Functional.E_Functional_2;
import org.junit.Test;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class E_Functional_2_Test {

    private E_Functional_2 e_functional_2_tester = new E_Functional_2();

    @Test
    public void TEST_noNeg(){
        assertEquals(Collections.singletonList(1), e_functional_2_tester.noNeg(Arrays.asList(1,-2)));
        assertEquals(Arrays.asList(3,3), e_functional_2_tester.noNeg(Arrays.asList(-3, -3, 3, 3)));
        assertEquals(Collections.emptyList(), e_functional_2_tester.noNeg(Arrays.asList(-1,-1,-1)));
    }

    @Test
    public void TEST_noZ(){
        assertEquals(Arrays.asList("aaa", "bbb"), e_functional_2_tester.noZ(Arrays.asList("aaa", "bbb", "aza")));
        assertEquals(Collections.singletonList("hi"), e_functional_2_tester.noZ(Arrays.asList("hziz", "hzello", "hi")));
        assertEquals(Arrays.asList("hello", "are"), e_functional_2_tester.noZ(Arrays.asList("hello", "howz", "are", "youz")));
    }

    @Test
    public void TEST_noYY(){
        assertEquals(Arrays.asList("ay", "by", "cy"), e_functional_2_tester.noYY(Arrays.asList("a", "b", "c")));
        assertEquals(Arrays.asList("ay", "by"), e_functional_2_tester.noYY(Arrays.asList("a", "b", "cy")));
        assertEquals(Arrays.asList("xxy", "yay", "zzy"), e_functional_2_tester.noYY(Arrays.asList("xx", "ya", "zz")));
    }

    @Test
    public void TEST_no9(){
        assertEquals(Arrays.asList(1,2), e_functional_2_tester.no9(Arrays.asList(1, 2, 19)));
        assertEquals(Collections.singletonList(3), e_functional_2_tester.no9(Arrays.asList(9, 19, 29, 3)));
        assertEquals(Arrays.asList(1,2,3), e_functional_2_tester.no9(Arrays.asList(1, 2, 3)));
    }

    @Test
    public void TEST_noLong(){
        assertEquals(Arrays.asList("not", "too"), e_functional_2_tester.noLong(Arrays.asList("this", "not", "too", "long")));
        assertEquals(Arrays.asList("a", "bbb"), e_functional_2_tester.noLong(Arrays.asList("a", "bbb", "cccc")));
        assertEquals(Collections.emptyList(), e_functional_2_tester.noLong(Arrays.asList("cccc", "cccc", "cccc")));
    }

    @Test
    public void TEST_two2(){
        assertEquals(Arrays.asList(4,6), e_functional_2_tester.two2(Arrays.asList(1,2,3)));
        assertEquals(Collections.singletonList(4), e_functional_2_tester.two2(Arrays.asList(2,6,11)));
        assertEquals(Collections.emptyList(), e_functional_2_tester.two2(Collections.emptyList()));
    }

    @Test
    public void TEST_noTeen(){
        assertEquals(Arrays.asList(12,20), e_functional_2_tester.noTeen(Arrays.asList(12, 13, 19, 20)));
        assertEquals(Arrays.asList(1,1), e_functional_2_tester.noTeen(Arrays.asList(1, 14, 1)));
        assertEquals(Collections.emptyList(), e_functional_2_tester.noTeen(Collections.singletonList(15)));
    }

    @Test
    public void TEST_no34(){
        assertEquals(Arrays.asList("a", "bb"), e_functional_2_tester.no34( Arrays.asList("a", "bb", "ccc")));
        assertEquals(Arrays.asList("a", "bb"), e_functional_2_tester.no34( Arrays.asList("a", "bb", "ccc", "dddd")));
        assertEquals(Collections.singletonList("apple"), e_functional_2_tester.no34( Arrays.asList("ccc", "dddd", "apple")));
    }
}
