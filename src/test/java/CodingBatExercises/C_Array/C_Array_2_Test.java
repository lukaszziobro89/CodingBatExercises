package CodingBatExercises.C_Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C_Array_2_Test {

    @Test
    void TEST_countEvens() {
        C_Array_2 c_array_2_tester = new C_Array_2();
        int[] nums1 = {2,1,2,3,4};
        int[] nums2 = {2,2,0};
        int[] nums3 = {1,3,5};

        assertEquals(3, c_array_2_tester.countEvens(nums1));
        assertEquals(3, c_array_2_tester.countEvens(nums2));
        assertEquals(0, c_array_2_tester.countEvens(nums3));
    }

    @Test
    void TEST_sum13(){
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
    void TEST_lucky13(){
        C_Array_2 c_array_2_tester = new C_Array_2();

        int[] nums1 = {0,2,4};
        int[] nums2 = {1,2,3};
        int[] nums3 = {1,2,4};

        assertTrue(c_array_2_tester.lucky13(nums1));
        assertFalse(c_array_2_tester.lucky13(nums2));
        assertFalse(c_array_2_tester.lucky13(nums3));
    }

}