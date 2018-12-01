package CodingBatExercises.A_Warmup_TEST;

import CodingBatExercises.A_Warmup_2.A_Warmup_2;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class B_Warmup_2_Test{

    @Test
    public void TEST_stringTimes(){
        A_Warmup_2 a_warmup_2_tester = new A_Warmup_2();

        assertEquals("HiHi", a_warmup_2_tester.stringTimes("Hi",2));
        assertEquals("HiHiHi", a_warmup_2_tester.stringTimes("Hi", 3));
        assertEquals("Hi", a_warmup_2_tester.stringTimes("Hi", 1));
    }

    @Test
    public void TEST_doubleX(){
        A_Warmup_2 a_warmup_2_testr = new A_Warmup_2();

        assertTrue(a_warmup_2_testr.doubleX("axxbb"));
        assertFalse(a_warmup_2_testr.doubleX("axaxax"));
        assertTrue(a_warmup_2_testr.doubleX("xxxxx"));
    }

    @Test
    public void TEST_array123(){
        A_Warmup_2 a_warmup_2_tester = new A_Warmup_2();

        int[] nums1 = {1, 1, 2, 3, 1};
        int[] nums2 = {1, 1, 2, 4, 1};
        int[] nums3 = {1, 1, 2, 1, 2, 3};

        assertTrue(a_warmup_2_tester.array123(nums1));
        assertFalse(a_warmup_2_tester.array123(nums2));
        assertTrue(a_warmup_2_tester.array123(nums3));

    }

    @Test
    public void TEST_noTriples(){
        A_Warmup_2 a_warmup_2_tester = new A_Warmup_2();

        int[] nums1 = {1, 1, 2, 2, 1}; // → true
        int[] nums2 = {1, 1, 2, 2, 2, 1};// → false
        int[] nums3 = {1, 1, 1, 2, 2, 2, 1};// → false

        assertTrue(a_warmup_2_tester.noTriples(nums1));
        assertFalse(a_warmup_2_tester.noTriples(nums2));
        assertFalse(a_warmup_2_tester.noTriples(nums3));
    }

    @Test
    public void TEST_frontTimes(){
        A_Warmup_2 a_warmup_2_tester = new A_Warmup_2();

        assertEquals("ChoCho", a_warmup_2_tester.frontTimes("Chocolate",2));
        assertEquals("ChoChoCho", a_warmup_2_tester.frontTimes("Chocolate",3));
        assertEquals("AbcAbcAbcAbc", a_warmup_2_tester.frontTimes("Abc",4));
    }

    @Test
    public void TEST_stringBits(){
        A_Warmup_2 a_warmup_2_tester = new A_Warmup_2();

        assertEquals("Hlo", a_warmup_2_tester.stringBits("Hello"));
        assertEquals("H", a_warmup_2_tester.stringBits("Hi"));
        assertEquals("Hello", a_warmup_2_tester.stringBits("Heeololeo"));
    }

    @Test
    public void TEST_arrayCount9(){
        A_Warmup_2 a_warmup_2_tester = new A_Warmup_2();

        int[] nums1 = {1, 2, 9};
        int[] nums2 = {1, 9, 9, 3, 9};
        int[] nums3 = {1, 9, 9};

        assertEquals(1, a_warmup_2_tester.arrayCount9(nums1));
        assertEquals(3, a_warmup_2_tester.arrayCount9(nums2));
        assertEquals(2, a_warmup_2_tester.arrayCount9(nums3));
    }

    @Test
    public void TEST_stringMatch(){
        A_Warmup_2 a_warmup_tester = new A_Warmup_2();

        assertEquals(3, a_warmup_tester.stringMatch("xxcaazz", "xxbaaz"));
        assertEquals(2, a_warmup_tester.stringMatch("abc", "abc"));
        assertEquals(0, a_warmup_tester.stringMatch("abc", "axc"));
    }

    @Test
    public void TEST_stringYak(){
        A_Warmup_2 a_warmup_2_tester = new A_Warmup_2();

        assertEquals("pak", a_warmup_2_tester.stringYak("yakpak"));
        assertEquals("pak", a_warmup_2_tester.stringYak("pakyak"));
        assertEquals("123ya", a_warmup_2_tester.stringYak("yak123ya"));
    }

    @Test
    public void TEST_countXX(){
        A_Warmup_2 a_warmup_2 = new A_Warmup_2();

        assertEquals(1, a_warmup_2.countXX("abcxx"));
        assertEquals(2, a_warmup_2.countXX("xxx"));
        assertEquals(3, a_warmup_2.countXX("xxxx"));
    }

    @Test
    public void TEST_stringSplosion(){
        A_Warmup_2 a_warmup_2 = new A_Warmup_2();

        assertEquals("CCoCodCode", a_warmup_2.stringSplosion("Code"));
        assertEquals("aababc", a_warmup_2.stringSplosion("abc"));
        assertEquals("aab", a_warmup_2.stringSplosion("ab"));
    }

    @Test
    public void TEST_arrayFront9(){

        int nums1[] = {1, 2, 9, 3, 4};
        int nums2[] = {1, 2, 3, 4, 9};
        int nums3[] = {1, 2, 3, 4, 5};

        A_Warmup_2 a_warmup_2 = new A_Warmup_2();

        assertTrue(a_warmup_2.arrayFront9(nums1));
        assertFalse(a_warmup_2.arrayFront9(nums2));
        assertFalse(a_warmup_2.arrayFront9(nums3));
    }

    @Test
    public void TEST_stringX(){
        A_Warmup_2 a_warmup_2 = new A_Warmup_2();

        assertEquals("xHix", a_warmup_2.stringX("xxHxix"));
        assertEquals("abcd", a_warmup_2.stringX("abxxxcd"));
        assertEquals("xabcdx", a_warmup_2.stringX("xabxxxcdx"));
    }

    @Test
    public void TEST_array667(){
        A_Warmup_2 a_warmup_2 = new A_Warmup_2();

        int nums1[] = {6, 6, 2};
        int nums2[] = {6, 6, 2, 6};
        int nums3[] = {6, 7, 2, 6};

        assertEquals(1, a_warmup_2.array667(nums1));
        assertEquals(1, a_warmup_2.array667(nums2));
        assertEquals(1, a_warmup_2.array667(nums3));
    }











}
