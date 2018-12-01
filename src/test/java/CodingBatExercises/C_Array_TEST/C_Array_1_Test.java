package CodingBatExercises.C_Array_TEST;

import CodingBatExercises.C_Array.C_Array_1;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class C_Array_1_Test {

    @Test
    public void TEST_firstLast6(){
        C_Array_1 c_array_1_tester = new C_Array_1();

        int[] nums1 = {1, 2, 6};
        int[] nums2 = {6, 1, 2, 3};
        int[] nums3 = {13, 6, 1, 2, 3};

        assertTrue(c_array_1_tester.firstLast6(nums1));
        assertTrue(c_array_1_tester.firstLast6(nums2));
        assertFalse(c_array_1_tester.firstLast6(nums3));
    }

    @Test
    public void TEST_commonEnd(){
        C_Array_1 c_array_1_tester = new C_Array_1();

        int[] nums1 = {1, 2, 3};
        int[] nums2 = {7, 3};
        int[] nums3 = {1, 2, 3};
        int[] nums4 = {7, 3, 2};
        int[] nums5 = {1, 2, 3};
        int[] nums6 = {1, 3};

        assertTrue(c_array_1_tester.commonEnd(nums1, nums2));
        assertFalse(c_array_1_tester.commonEnd(nums3, nums4));
        assertTrue(c_array_1_tester.commonEnd(nums5, nums6));
    }

    @Test
    public void TEST_reverse3(){
        C_Array_1 c_array_1_tester = new C_Array_1();

        int[] nums1 = {1, 2, 3};
        int[] nums2 = {5, 11, 9};
        int[] nums3 = {7, 0, 0};

        assertArrayEquals(new int[]{3, 2, 1}, c_array_1_tester.reverse3(nums1));
        assertArrayEquals(new int[]{9, 11, 5}, c_array_1_tester.reverse3(nums2));
        assertArrayEquals(new int[]{0, 0, 7}, c_array_1_tester.reverse3(nums3));
    }

    @Test
    public void TEST_middleWay(){
        C_Array_1 c_array_1_tester = new C_Array_1();

        int[] nums1 = {1, 2, 3};
        int[] nums2 = {4, 5, 6};
        int[] nums3 = {7, 7, 7};
        int[] nums4 = {3, 8, 0};
        int[] nums5 = {5, 2, 9};
        int[] nums6 = {1, 4, 5};

        assertArrayEquals(new int[]{2, 5}, c_array_1_tester.middleWay(nums1, nums2));
        assertArrayEquals(new int[]{7, 8}, c_array_1_tester.middleWay(nums3, nums4));
        assertArrayEquals(new int[]{2, 4}, c_array_1_tester.middleWay(nums5, nums6));
    }

    @Test
    public void TEST_no23(){
        C_Array_1 c_array_1_tester = new C_Array_1();

        int[] nums1 = {4, 5};
        int[] nums2 = {4, 2};
        int[] nums3 = {3, 5};

        assertTrue(c_array_1_tester.no23(nums1));
        assertFalse(c_array_1_tester.no23(nums2));
        assertFalse(c_array_1_tester.no23(nums3));
    }

    @Test
    public void TEST_fix23(){
        C_Array_1 c_array_1_tester = new C_Array_1();

        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 3, 5};
        int[] nums3 = {1, 2, 1};

        assertArrayEquals(new int[]{1, 2, 0}, c_array_1_tester.fix23(nums1));
        assertArrayEquals(new int[]{2, 0, 5}, c_array_1_tester.fix23(nums2));
        assertArrayEquals(new int[]{1, 2, 1}, c_array_1_tester.fix23(nums3));
    }

    @Test
    public void TEST_makeMiddle(){
        C_Array_1 c_array_1_tester = new C_Array_1();

        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {7, 1, 2, 3, 4, 9};
        int[] nums3 = {1, 2};

        assertArrayEquals(new int[]{2,3}, c_array_1_tester.makeMiddle(nums1));
        assertArrayEquals(new int[]{2,3}, c_array_1_tester.makeMiddle(nums2));
        assertArrayEquals(new int[]{1,2}, c_array_1_tester.makeMiddle(nums3));
    }

    @Test
    public void TEST_midThree(){
        C_Array_1 c_array_1_tester = new C_Array_1();

        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {8, 6, 7, 5, 3, 0, 9};
        int[] nums3 = {1, 2, 3};

        assertArrayEquals(new int[]{2,3,4}, c_array_1_tester.midThree(nums1));
        assertArrayEquals(new int[]{7,5,3}, c_array_1_tester.midThree(nums2));
        assertArrayEquals(new int[]{1,2,3}, c_array_1_tester.midThree(nums3));
    }

    @Test
    public void TEST_unlucky1(){
        C_Array_1 c_array_1_tester = new C_Array_1();

        int[] nums1 = {1, 3, 4, 5};
        int[] nums2 = {2, 1, 3, 4, 5};
        int[] nums3 = {1, 1, 1};

        assertTrue(c_array_1_tester.unlucky1(nums1));
        assertTrue(c_array_1_tester.unlucky1(nums2));
        assertFalse(c_array_1_tester.unlucky1(nums3));
    }

    @Test
    public void TEST_sameFirstLast(){
        C_Array_1 c_array_1_tester = new C_Array_1();

        int[] nums1 = {1, 2, 3};
        int[] nums2 = {1, 2, 3, 1};
        int[] nums3 = {1, 2, 1};

        assertFalse(c_array_1_tester.sameFirstLast(nums1));
        assertTrue(c_array_1_tester.sameFirstLast(nums2));
        assertTrue(c_array_1_tester.sameFirstLast(nums3));
    }

    @Test
    public void TEST_sum3(){
        C_Array_1 c_array_1_tester = new C_Array_1();

        int[] nums1 = {1, 2, 3};
        int[] nums2 = {5, 11, 2};
        int[] nums3 = {7, 0, 0};

        assertEquals(6, c_array_1_tester.sum3(nums1));
        assertEquals(18, c_array_1_tester.sum3(nums2));
        assertEquals(7, c_array_1_tester.sum3(nums3));
    }

    @Test
    public void TEST_maxEnd3(){
        C_Array_1 c_array_1_tester = new C_Array_1();

        int[] nums1 = {1, 2, 3};
        int[] nums2 = {11, 5, 9};
        int[] nums3 = {2, 11, 3};

        assertArrayEquals(new int[]{3,3,3}, c_array_1_tester.maxEnd3(nums1));
        assertArrayEquals(new int[]{11,11,11}, c_array_1_tester.maxEnd3(nums2));
        assertArrayEquals(new int[]{11,11,11}, c_array_1_tester.maxEnd3(nums3));
    }

    @Test
    public void TEST_makeEnds(){
        C_Array_1 c_array_1_tester = new C_Array_1();

        int[] nums1 = {1, 2, 3};
        int[] nums2 = {1, 2, 3, 4};
        int[] nums3 = {7, 4, 6, 2};

        assertArrayEquals(new int[]{1,3}, c_array_1_tester.makeEnds(nums1));
        assertArrayEquals(new int[]{1,4}, c_array_1_tester.makeEnds(nums2));
        assertArrayEquals(new int[]{7,2}, c_array_1_tester.makeEnds(nums3));
    }

    @Test
    public void TEST_makeLast(){
        C_Array_1 c_array_1_tester = new C_Array_1();

        int[] nums1 = {4, 5, 6};
        int[] nums2 = {1, 2};
        int[] nums3 = {3};

        assertArrayEquals(new int[]{0, 0, 0, 0, 0, 6}, c_array_1_tester.makeLast(nums1));
        assertArrayEquals(new int[]{0, 0, 0, 2}, c_array_1_tester.makeLast(nums2));
        assertArrayEquals(new int[]{0, 3}, c_array_1_tester.makeLast(nums3));
    }

    @Test
    public void TEST_start1(){
        C_Array_1 c_array_1_tester = new C_Array_1();

        int[] nums1 = {1, 2, 3};
        int[] nums2 = {1, 3};
        int[] nums3 = {7, 2, 3};
        int[] nums4 = {1};
        int[] nums5 = {1, 2};
        int[] nums6 = {};

        assertEquals(2, c_array_1_tester.start1(nums1, nums2));
        assertEquals(1, c_array_1_tester.start1(nums3, nums4));
        assertEquals(1, c_array_1_tester.start1(nums5, nums6));
    }

    @Test
    public void TEST_plusTwo(){
        C_Array_1 c_array_1_tester = new C_Array_1();

        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        int[] nums3 = {4, 4};
        int[] nums4 = {2, 2};
        int[] nums5 = {9, 2};
        int[] nums6 = {3, 4};

        assertArrayEquals(new int[]{1,2,3,4}, c_array_1_tester.plusTwo(nums1, nums2));
        assertArrayEquals(new int[]{4,4,2,2}, c_array_1_tester.plusTwo(nums3, nums4));
        assertArrayEquals(new int[]{9,2,3,4}, c_array_1_tester.plusTwo(nums5, nums6));
    }

    @Test
    public void TEST_maxTriple(){
        C_Array_1 c_array_1_tester = new C_Array_1();

        int[] nums1 = {1, 2, 3};
        int[] nums2 = {1, 5, 3};
        int[] nums3 = {6, 2, 3};

        assertEquals(3, c_array_1_tester.maxTriple(nums1));
        assertEquals(5, c_array_1_tester.maxTriple(nums2));
        assertEquals(6, c_array_1_tester.maxTriple(nums3));
    }

    @Test
    public void TEST_make2(){
        C_Array_1 c_array_1_tester = new C_Array_1();

        int[] nums1 = {4,5};
        int[] nums2 = {1,2,3};
        int[] nums3 = {4};
        int[] nums4 = {1,2,3};
        int[] nums5 = {};
        int[] nums6 = {1,2};

        assertArrayEquals(new int[]{4,5}, c_array_1_tester.make2(nums1, nums2));
        assertArrayEquals(new int[]{4,1}, c_array_1_tester.make2(nums3, nums4));
        assertArrayEquals(new int[]{1,2}, c_array_1_tester.make2(nums5, nums6));
    }

    @Test
    public void TEST_makePi(){
        C_Array_1 c_array_1_tester = new C_Array_1();
        assertArrayEquals(new int[]{3,1,4}, c_array_1_tester.makePi());
    }

    @Test
    public void TEST_rotateLeft3(){
        C_Array_1 c_array_1_tester = new C_Array_1();

        int[] nums1 = {1,2,3};
        int[] nums2 = {5,11,9};
        int[] nums3 = {7,0,0};

        assertArrayEquals(new int[]{2,3,1}, c_array_1_tester.rotateLeft3(nums1));
        assertArrayEquals(new int[]{11,9,5}, c_array_1_tester.rotateLeft3(nums2));
        assertArrayEquals(new int[]{0,0,7}, c_array_1_tester.rotateLeft3(nums3));
    }

    @Test
    public void TEST_sum2(){
        C_Array_1 c_array_1_tester = new C_Array_1();

        int[] nums1 = {1,2,3};
        int[] nums2 = {1,1};
        int[] nums3 = {1,1,1,1};

        assertEquals(3, c_array_1_tester.sum2(nums1));
        assertEquals(2, c_array_1_tester.sum2(nums2));
        assertEquals(2, c_array_1_tester.sum2(nums3));
    }

    @Test
    public void TEST_has23(){
        C_Array_1 c_array_1_tester = new C_Array_1();

        int[] nums1 = {2,5};
        int[] nums2 = {4,3};
        int[] nums3 = {4,5};

        assertTrue(c_array_1_tester.has23(nums1));
        assertTrue(c_array_1_tester.has23(nums2));
        assertFalse(c_array_1_tester.has23(nums3));
    }

    @Test
    public void TEST_double23(){
        C_Array_1 c_array_1_tester = new C_Array_1();

        int[] nums1 = {2,2};
        int[] nums2 = {3,3};
        int[] nums3 = {2,3};

        assertTrue(c_array_1_tester.double23(nums1));
        assertTrue(c_array_1_tester.double23(nums2));
        assertFalse(c_array_1_tester.double23(nums3));
    }

    @Test
    public void TEST_biggerTwo(){
        C_Array_1 c_array_1_tester = new C_Array_1();

        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        int[] nums3 = {3,4};
        int[] nums4 = {1,2};
        int[] nums5 = {1,1};
        int[] nums6 = {1,2};

        assertArrayEquals(new int[]{3,4}, c_array_1_tester.biggerTwo(nums1, nums2));
        assertArrayEquals(new int[]{3,4}, c_array_1_tester.biggerTwo(nums3, nums4));
        assertArrayEquals(new int[]{1,2}, c_array_1_tester.biggerTwo(nums5, nums6));
    }

    @Test
    public void TEST_swapEnds(){
        C_Array_1 c_array_1_tester = new C_Array_1();

        int[] nums1 = {1,2,3,4};
        int[] nums2 = {1,2,3};
        int[] nums3 = {8,6,7,9,5};

        assertArrayEquals(new int[]{4,2,3,1}, c_array_1_tester.swapEnds(nums1));
        assertArrayEquals(new int[]{3,2,1}, c_array_1_tester.swapEnds(nums2));
        assertArrayEquals(new int[]{5,6,7,9,8}, c_array_1_tester.swapEnds(nums3));
    }

    @Test
    public void TEST_frontPiece(){
        C_Array_1 c_array_1_tester = new C_Array_1();

        int[] nums1 = {1,2,3};
        int[] nums2 = {1,2};
        int[] nums3 = {1};

        assertArrayEquals(new int[]{1,2}, c_array_1_tester.frontPiece(nums1));
        assertArrayEquals(new int[]{1,2}, c_array_1_tester.frontPiece(nums2));
        assertArrayEquals(new int[]{1}, c_array_1_tester.frontPiece(nums3));
    }

    @Test
    public void TEST_front11(){
        C_Array_1 c_array_1_tester = new C_Array_1();

        int[] nums1 = {1,2,3};
        int[] nums2 = {7,9,8};
        int[] nums3 = {1};
        int[] nums4 = {2};
        int[] nums5 = {1,7};
        int[] nums6 = {};

        assertArrayEquals(new int[]{1,7}, c_array_1_tester.front11(nums1, nums2));
        assertArrayEquals(new int[]{1,2}, c_array_1_tester.front11(nums3, nums4));
        assertArrayEquals(new int[]{1}, c_array_1_tester.front11(nums5, nums6));
    }
}
