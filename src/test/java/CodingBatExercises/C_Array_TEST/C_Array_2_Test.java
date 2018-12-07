package CodingBatExercises.C_Array_TEST;

import CodingBatExercises.C_Array.C_Array_2;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class C_Array_2_Test {

    @Test
    public void TEST_countEvens() {
        C_Array_2 c_array_2_tester = new C_Array_2();
        int[] nums1 = {2,1,2,3,4};
        int[] nums2 = {2,2,0};
        int[] nums3 = {1,3,5};

        assertEquals(3, c_array_2_tester.countEvens(nums1));
        assertEquals(3, c_array_2_tester.countEvens(nums2));
        assertEquals(0, c_array_2_tester.countEvens(nums3));
    }

    @Test
    public void TEST_sum13(){
        C_Array_2 c_array_2_tester = new C_Array_2();

        int[] nums1 = {1,2,2,1};
        int[] nums2 = {1,1};
        int[] nums3 = {1,2,2,1,13};
        int[] nums4 = {1,13,2,1};

        assertEquals(6, c_array_2_tester.sum13(nums1));
        assertEquals(2, c_array_2_tester.sum13(nums2));
        assertEquals(6, c_array_2_tester.sum13(nums3));
        assertEquals(2, c_array_2_tester.sum13(nums4));
    }

    @Test
    public void TEST_lucky13(){
        C_Array_2 c_array_2_tester = new C_Array_2();

        int[] nums1 = {0,2,4};
        int[] nums2 = {1,2,3};
        int[] nums3 = {1,2,4};

        assertTrue(c_array_2_tester.lucky13(nums1));
        assertFalse(c_array_2_tester.lucky13(nums2));
        assertFalse(c_array_2_tester.lucky13(nums3));
    }

    @Test
    public void TEST_fizzArray(){
        C_Array_2 c_array_2_tester = new C_Array_2();

        int[] nums1 = new int[]{0,1,2,3};
        int[] nums2 = new int[]{0};
        int[] nums3 = new int[]{0,1,2,3,4,5,6,7,8,9};

        assertArrayEquals(nums1, c_array_2_tester.fizzArray(4));
        assertArrayEquals(nums2, c_array_2_tester.fizzArray(1));
        assertArrayEquals(nums3, c_array_2_tester.fizzArray(10));
    }

    @Test
    public void TEST_no14(){
        C_Array_2 c_array_2_tester = new C_Array_2();

        int[] nums1 = new int[]{1,2,3};
        int[] nums2 = new int[]{1,2,3,4};
        int[] nums3 = new int[]{2,3,4};

        assertTrue(c_array_2_tester.no14(nums1));
        assertFalse(c_array_2_tester.no14(nums2));
        assertTrue(c_array_2_tester.no14(nums3));
    }

    @Test
    public void TEST_matchUp(){
        C_Array_2 c_array_2_tester = new C_Array_2();

        int[] nums1 = new int[]{1,2,3};
        int[] nums2 = new int[]{2,3,10};
        int[] nums3 = new int[]{1,2,3};
        int[] nums4 = new int[]{2,3,5};
        int[] nums5 = new int[]{1,2,3};
        int[] nums6 = new int[]{2,3,3};

        assertEquals(2, c_array_2_tester.matchUp(nums1, nums2));
        assertEquals(3, c_array_2_tester.matchUp(nums3, nums4));
        assertEquals(2, c_array_2_tester.matchUp(nums5, nums6));
    }

    @Test
    public void TEST_modThree() {
        C_Array_2 c_array_2_tester = new C_Array_2();

        int[] nums1 = new int[]{2, 1, 3, 5};
        int[] nums2 = new int[]{2, 1, 2, 5};
        int[] nums3 = new int[]{2, 4, 2, 5};
        int[] nums4 = new int[]{2, 1, 2, 1, 4, 8, 10};

        assertTrue(c_array_2_tester.modThree(nums1));
        assertFalse(c_array_2_tester.modThree(nums2));
        assertTrue(c_array_2_tester.modThree(nums3));
        assertTrue(c_array_2_tester.modThree(nums4));
    }

    @Test
    public void TEST_sameEnds() {
        C_Array_2 c_array_2_tester = new C_Array_2();

        int[] nums = new int[]{5, 6, 45, 99, 13, 5, 6};

        assertFalse(c_array_2_tester.sameEnds(nums, 1));
        assertTrue(c_array_2_tester.sameEnds(nums, 2));
        assertFalse(c_array_2_tester.sameEnds(nums, 3));
    }

    @Test
    public void TEST_shiftLeft() {
        C_Array_2 c_array_2_tester = new C_Array_2();

        int[] nums1 = new int[]{6, 2, 5, 3};
        int[] nums2 = new int[]{1, 2};
        int[] nums3 = new int[]{1};

        assertArrayEquals(new int[]{2, 5, 3, 6}, c_array_2_tester.shiftLeft(nums1));
        assertArrayEquals(new int[]{2,1}, c_array_2_tester.shiftLeft(nums2));
        assertArrayEquals(new int[]{1}, c_array_2_tester.shiftLeft(nums3));
    }

    @Test
    public void TEST_post4() {
        C_Array_2 c_array_2_tester = new C_Array_2();

        int[] nums1 = new int[]{2,4,1,2};
        int[] nums2 = new int[]{4,1,4,2};
        int[] nums3 = new int[]{4,4,1,2,3};

        assertArrayEquals(new int[]{1,2}, c_array_2_tester.post4(nums1));
        assertArrayEquals(new int[]{2}, c_array_2_tester.post4(nums2));
        assertArrayEquals(new int[]{1,2,3}, c_array_2_tester.post4(nums3));
    }

    @Test
    public void TEST_withoutTen() {
        C_Array_2 c_array_2_tester = new C_Array_2();

        int[] nums1 = new int[]{1,10,10,2};
        int[] nums2 = new int[]{10,2,10};
        int[] nums3 = new int[]{1,99,10};

        assertArrayEquals(new int[]{1,2,0,0}, c_array_2_tester.withoutTen(nums1));
        assertArrayEquals(new int[]{2,0,0}, c_array_2_tester.withoutTen(nums2));
        assertArrayEquals(new int[]{1,99,0}, c_array_2_tester.withoutTen(nums3));
    }

    @Test
    public void TEST_fizzBuzz() {
        C_Array_2 c_array_2_tester = new C_Array_2();

        String[] nums1 = new String[]{"1", "2", "Fizz", "4", "Buzz"};
        String[] nums2 = new String[]{"1", "2", "Fizz", "4", "Buzz", "Fizz", "7"};
        String[] nums3 = new String[]{"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"};

        assertArrayEquals(nums1, c_array_2_tester.fizzBuzz(1, 6));
        assertArrayEquals(nums2, c_array_2_tester.fizzBuzz(1, 8));
        assertArrayEquals(nums3, c_array_2_tester.fizzBuzz(1, 11));
    }

    @Test
    public void TEST_bigDiff() {
        C_Array_2 c_array_2_tester = new C_Array_2();

        int[] nums1 = new int[]{10, 3, 5, 6};
        int[] nums2 = new int[]{7, 2, 10, 9};
        int[] nums3 = new int[]{2, 10, 7, 2};

        assertEquals(7, c_array_2_tester.bigDiff(nums1));
        assertEquals(8, c_array_2_tester.bigDiff(nums2));
        assertEquals(8, c_array_2_tester.bigDiff(nums3));
    }

    @Test
    public void TEST_sum67() {
        C_Array_2 c_array_2_tester = new C_Array_2();

        int[] nums1 = new int[]{1,2,2};
        int[] nums2 = new int[]{1,2,2,6,99,99,7};
        int[] nums3 = new int[]{1,1,6,7,2};

        assertEquals(5, c_array_2_tester.sum67(nums1));
        assertEquals(5, c_array_2_tester.sum67(nums2));
        assertEquals(4, c_array_2_tester.sum67(nums3));
    }

    @Test
    public void TEST_sum28() {
        C_Array_2 c_array_2_tester = new C_Array_2();

        int[] nums1 = new int[]{2,3,2,2,4,2};
        int[] nums2 = new int[]{2,3,2,2,4,2,2};
        int[] nums3 = new int[]{1,2,3,4};

        assertTrue(c_array_2_tester.sum28(nums1));
        assertFalse(c_array_2_tester.sum28(nums2));
        assertFalse(c_array_2_tester.sum28(nums3));
    }

    @Test
    public void TEST_only14() {
        C_Array_2 c_array_2_tester = new C_Array_2();

        int[] nums1 = new int[]{1,4,1,4};
        int[] nums2 = new int[]{1,4,2,4};
        int[] nums3 = new int[]{1,1};
        int[] nums4 = new int[]{4,4};

        assertTrue(c_array_2_tester.only14(nums1));
        assertFalse(c_array_2_tester.only14(nums2));
        assertTrue(c_array_2_tester.only14(nums3));
        assertTrue(c_array_2_tester.only14(nums4));
    }

    @Test
    public void TEST_isEverywhere() {
        C_Array_2 c_array_2_tester = new C_Array_2();

        int[] nums1 = new int[]{1,2,1,3};
        int[] nums2 = new int[]{1,2,1,3};
        int[] nums3 = new int[]{1,2,1,3,4};

        assertTrue(c_array_2_tester.isEverywhere(nums1, 1));
        assertFalse(c_array_2_tester.isEverywhere(nums2, 2));
        assertFalse(c_array_2_tester.isEverywhere(nums3, 1));
    }

    @Test
    public void TEST_has77() {
        C_Array_2 c_array_2_tester = new C_Array_2();

        int[] nums1 = new int[]{1,7,7};
        int[] nums2 = new int[]{1,7,1,7};
        int[] nums3 = new int[]{1,7,1,1,7};

        assertTrue(c_array_2_tester.has77(nums1));
        assertTrue(c_array_2_tester.has77(nums2));
        assertFalse(c_array_2_tester.has77(nums3));
    }

    @Test
    public void TEST_haveThree() {
        C_Array_2 c_array_2_tester = new C_Array_2();

        int[] nums1 = new int[]{3,1,3,1,3};
        int[] nums2 = new int[]{3,1,3,3};
        int[] nums3 = new int[]{3,4,3,3,4};

        assertTrue(c_array_2_tester.haveThree(nums1));
        assertFalse(c_array_2_tester.haveThree(nums2));
        assertFalse(c_array_2_tester.haveThree(nums3));
    }

    @Test
    public void TEST_tripleUp() {
        C_Array_2 c_array_2_tester = new C_Array_2();

        int[] nums1 = new int[]{1,4,5,6,2};
        int[] nums2 = new int[]{1,2,3};
        int[] nums3 = new int[]{1,2,4};

        assertTrue(c_array_2_tester.tripleUp(nums1));
        assertTrue(c_array_2_tester.tripleUp(nums2));
        assertFalse(c_array_2_tester.tripleUp(nums3));
    }

    @Test
    public void TEST_tenRun() {
        C_Array_2 c_array_2_tester = new C_Array_2();


        int[] nums1 = new int[]{2, 10, 3, 4, 20, 5};
        int[] nums2 = new int[]{10, 1, 20, 2};
        int[] nums3 = new int[]{10, 1, 9, 20};

        assertArrayEquals(new int[]{2, 10, 10, 10, 20, 20}, c_array_2_tester.tenRun(nums1));
        assertArrayEquals(new int[]{10, 10, 20, 20}, c_array_2_tester.tenRun(nums2));
        assertArrayEquals(new int[]{10, 10, 10, 20}, c_array_2_tester.tenRun(nums3));
    }

    @Test
    public void TEST_notAlone() {
        C_Array_2 c_array_2_tester = new C_Array_2();

        int[] nums1 = new int[]{1,2,3};
        int[] nums2 = new int[]{1,2,3,2,5,2};
        int[] nums3 = new int[]{3,4};

        assertArrayEquals(new int[]{1,3,3}, c_array_2_tester.notAlone(nums1, 2));
        assertArrayEquals(new int[]{1,3,3,5,5,2}, c_array_2_tester.notAlone(nums2, 2));
        assertArrayEquals(new int[]{3,4}, c_array_2_tester.notAlone(nums3,3 ));
    }

    @Test
    public void TEST_zeroMax() {
        C_Array_2 c_array_2_tester = new C_Array_2();

        int[] nums1 = new int[]{0,5,0,3};
        int[] nums2 = new int[]{0,4,0,3};
        int[] nums3 = new int[]{0,1,0};

        assertArrayEquals(new int[]{5,5,3,3}, c_array_2_tester.zeroMax(nums1));
        assertArrayEquals(new int[]{3,4,3,3}, c_array_2_tester.zeroMax(nums2));
        assertArrayEquals(new int[]{1,1,0}, c_array_2_tester.zeroMax(nums3));
    }

    @Test
    public void TEST_centeredAverage() {
        C_Array_2 c_array_2_tester = new C_Array_2();

        int[] nums1 = new int[]{1,2,3,4,100};
        int[] nums2 = new int[]{1,1,5,5,10,8,7};
        int[] nums3 = new int[]{-10, -4, -2, -4, -2, 0};

        assertEquals(3, c_array_2_tester.centeredAverage(nums1));
        assertEquals(5, c_array_2_tester.centeredAverage(nums2));
        assertEquals(-3, c_array_2_tester.centeredAverage(nums3));
    }

    @Test
    public void TEST_has22() {
        C_Array_2 c_array_2_tester = new C_Array_2();

        int[] nums1 = new int[]{1,2,2};
        int[] nums2 = new int[]{1,2,1,2};
        int[] nums3 = new int[]{2,1,2};

        assertTrue(c_array_2_tester.has22(nums1));
        assertFalse(c_array_2_tester.has22(nums2));
        assertFalse(c_array_2_tester.has22(nums3));
    }

    @Test
    public void TEST_more14() {
        C_Array_2 c_array_2_tester = new C_Array_2();

        int[] nums1 = new int[]{1,4,1};
        int[] nums2 = new int[]{1,4,1,4};
        int[] nums3 = new int[]{1,1};

        assertTrue(c_array_2_tester.more14(nums1));
        assertFalse(c_array_2_tester.more14(nums2));
        assertTrue(c_array_2_tester.more14(nums3));
    }

    @Test
    public void TEST_fizzArray2() {
        C_Array_2 c_array_2_tester = new C_Array_2();

        String[] nums1 = new String[]{"0", "1", "2", "3"};
        String[] nums2 = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] nums3 = new String[]{"0", "1"};

        assertArrayEquals(nums1, c_array_2_tester.fizzArray2(4));
        assertArrayEquals(nums2, c_array_2_tester.fizzArray2(10));
        assertArrayEquals(nums3, c_array_2_tester.fizzArray2(2));
    }

    @Test
    public void TEST_either24() {
        C_Array_2 c_array_2_tester = new C_Array_2();

        int[] nums1 = new int[]{1,2,2};
        int[] nums2 = new int[]{4,4,1};
        int[] nums3 = new int[]{4,4,1,2,2};

        assertTrue(c_array_2_tester.either24(nums1));
        assertTrue(c_array_2_tester.either24(nums2));
        assertFalse(c_array_2_tester.either24(nums3));
    }

    @Test
    public void TEST_has12() {
        C_Array_2 c_array_2_tester = new C_Array_2();

        int[] nums1 = new int[]{1,3,2};
        int[] nums2 = new int[]{3,1,2};
        int[] nums3 = new int[]{3,1,4,5,2};

        assertTrue(c_array_2_tester.has12(nums1));
        assertTrue(c_array_2_tester.has12(nums2));
        assertTrue(c_array_2_tester.has12(nums3));
    }

    @Test
    public void TEST_twoTwo() {
        C_Array_2 c_array_2_tester = new C_Array_2();

        int[] nums1 = new int[]{4,2,2,3};
        int[] nums2 = new int[]{2,2,4};
        int[] nums3 = new int[]{2,2,4,2};

        assertTrue(c_array_2_tester.twoTwo(nums1));
        assertTrue(c_array_2_tester.twoTwo(nums2));
        assertFalse(c_array_2_tester.twoTwo(nums3));
    }

    @Test
    public void TEST_fizzArray3() {
        C_Array_2 c_array_2_tester = new C_Array_2();

        int[] nums1 = new int[]{5,6,7,8,9};
        int[] nums2 = new int[]{11, 12, 13, 14, 15, 16, 17};
        int[] nums3 = new int[]{1,2};

        assertArrayEquals(nums1, c_array_2_tester.fizzArray3(5, 10));
        assertArrayEquals(nums2, c_array_2_tester.fizzArray3(11, 18));
        assertArrayEquals(nums3, c_array_2_tester.fizzArray3(1, 3));
    }


    @Test
    public void TEST_pre4() {
        C_Array_2 c_array_2_tester = new C_Array_2();

        int[] nums1 = new int[]{1,2,4,1};
        int[] nums2 = new int[]{3,1,4};
        int[] nums3 = new int[]{1,4,4};
        int[] nums4 = new int[]{1};

        assertArrayEquals(new int[]{1,2}, c_array_2_tester.pre4(nums1));
        assertArrayEquals(new int[]{3,1}, c_array_2_tester.pre4(nums2));
        assertArrayEquals(new int[]{1}, c_array_2_tester.pre4(nums3));
        assertArrayEquals(new int[]{}, c_array_2_tester.pre4(nums4));
    }

    @Test
    public void TEST_zeroFront() {
        C_Array_2 c_array_2_tester = new C_Array_2();

        int[] nums1 = new int[]{1,0,0,1};
        int[] nums2 = new int[]{0,1,1,0,1};
        int[] nums3 = new int[]{1,0};

        assertArrayEquals(new int[]{0,0,1,1}, c_array_2_tester.zeroFront(nums1));
        assertArrayEquals(new int[]{0,0,1,1,1}, c_array_2_tester.zeroFront(nums2));
        assertArrayEquals(new int[]{0,1}, c_array_2_tester.zeroFront(nums3));
    }

    @Test
    public void TEST_evenOdd() {
        C_Array_2 c_array_2_tester = new C_Array_2();

        int[] nums1 = new int[]{1,0,1,0,0,1,1};
        int[] nums2 = new int[]{3,3,2};
        int[] nums3 = new int[]{2,2,2};

        assertArrayEquals(new int[]{0,0,0,1,1,1,1}, c_array_2_tester.evenOdd(nums1));
        assertArrayEquals(new int[]{2,3,3}, c_array_2_tester.evenOdd(nums2));
        assertArrayEquals(new int[]{2,2,2}, c_array_2_tester.evenOdd(nums3));
    }
}
