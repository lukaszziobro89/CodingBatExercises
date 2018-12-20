package CodingBatExercises.C_Array_TEST;

import CodingBatExercises.C_Array.C_Array_3;
import org.junit.Test;

import static org.junit.Assert.*;

public class C_Array_3_Test {

    @Test
    public void TEST_maxSpan(){
        C_Array_3 c_array_3_tester = new C_Array_3();

        int[] nums1 = new int[]{1,2,1,1,3};
        int[] nums2 = new int[]{1,4,2,1,4,1,4};
        int[] nums3 = new int[]{1,4,2,1,4,4,4};

        assertEquals(4, c_array_3_tester.maxSpan(nums1));
        assertEquals(6, c_array_3_tester.maxSpan(nums2));
        assertEquals(6, c_array_3_tester.maxSpan(nums3));
    }

    @Test
    public void TEST_canBalance(){
        C_Array_3 c_array_3_tester = new C_Array_3();

        int[] nums1 = new int[]{1,1,1,2,1};
        int[] nums2 = new int[]{2,1,1,2,1};
        int[] nums3 = new int[]{10,10};

        assertTrue(c_array_3_tester.canBalance(nums1));
        assertFalse(c_array_3_tester.canBalance(nums2));
        assertTrue(c_array_3_tester.canBalance(nums3));
    }

    @Test
    public void TEST_seriesUp(){
        C_Array_3 c_array_3_tester = new C_Array_3();

        int[] nums1 = new int[]{1, 1, 2, 1, 2, 3};
        int[] nums2 = new int[]{1, 1, 2, 1, 2, 3, 1, 2, 3, 4};
        int[] nums3 = new int[]{1, 1, 2};

        assertArrayEquals(nums1, c_array_3_tester.seriesUp(3));
        assertArrayEquals(nums2, c_array_3_tester.seriesUp(4));
        assertArrayEquals(nums3, c_array_3_tester.seriesUp(2));
    }
}
