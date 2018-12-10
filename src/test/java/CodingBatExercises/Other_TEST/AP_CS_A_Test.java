package CodingBatExercises.Other_TEST;

import CodingBatExercises.Other.AP_CS_A;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertArrayEquals;

public class AP_CS_A_Test {
    @Test
    public void TEST_scoresIncreasing(){
        AP_CS_A ap_cs_a = new AP_CS_A();

        int[] nums1 = new int[]{1,3,4};
        int[] nums2 = new int[]{1,3,2};
        int[] nums3 = new int[]{1,1,4};

        assertTrue(ap_cs_a.scoresIncreasing(nums1));
        assertFalse(ap_cs_a.scoresIncreasing(nums2));
        assertTrue(ap_cs_a.scoresIncreasing(nums3));
    }

    @Test
    public void TEST_scoresAverage(){
        AP_CS_A ap_cs_a = new AP_CS_A();

        int[] nums1 = new int[]{2,2,4,4};
        int[] nums2 = new int[]{4,4,4,2,2,2};
        int[] nums3 = new int[]{3,4,5,1,2,3};

        assertEquals(4, ap_cs_a.scoresAverage(nums1));
        assertEquals(4, ap_cs_a.scoresAverage(nums2));
        assertEquals(4, ap_cs_a.scoresAverage(nums3));
    }

    @Test
    public void TEST_wordsWithoutList(){
        AP_CS_A ap_cs_a = new AP_CS_A();

        String[] words1 = new String[]{"a", "bb", "b", "ccc"};

        assertArrayEquals(new String[]{"bb", "ccc"}, ap_cs_a.wordsWithoutList(words1, 1).toArray());
        assertArrayEquals(new String[]{"a", "bb", "b"}, ap_cs_a.wordsWithoutList(words1, 3).toArray());
        assertArrayEquals(new String[]{"a", "bb", "b", "ccc"}, ap_cs_a.wordsWithoutList(words1, 4).toArray());
    }

    @Test
    public void TEST_copyEvens(){
        AP_CS_A ap_cs_a = new AP_CS_A();

        int[] nums1 = new int[]{3,2,4,5,8};
        int[] nums2 = new int[]{3,2,4,5,8};
        int[] nums3 = new int[]{6,1,2,4,5,8};

        assertArrayEquals(new int[]{2,4}, ap_cs_a.copyEvens(nums1, 2));
        assertArrayEquals(new int[]{2,4,8}, ap_cs_a.copyEvens(nums2, 3));
        assertArrayEquals(new int[]{6,2,4}, ap_cs_a.copyEvens(nums3, 3));
    }


//    @Test
//    public void TEST_scoreUp(){
//        AP_CS_A ap_cs_a = new AP_CS_A();
//
//    }
//
//    @Test
//    public void TEST_sumHeights(){
//        AP_CS_A ap_cs_a = new AP_CS_A();
//
//    }
//
//    @Test
//    public void TEST_userCompare(){
//        AP_CS_A ap_cs_a = new AP_CS_A();
//
//    }
//
//    @Test
//    public void TEST_scores100(){
//        AP_CS_A ap_cs_a = new AP_CS_A();
//
//    }
//
//    @Test
//    public void TEST_wordsCount(){
//        AP_CS_A ap_cs_a = new AP_CS_A();
//
//    }
//
//    @Test
//    public void TEST_hasOne(){
//        AP_CS_A ap_cs_a = new AP_CS_A();
//
//    }
//
//    @Test
//    public void TEST_copyEndy(){
//        AP_CS_A ap_cs_a = new AP_CS_A();
//
//    }

    @Test
    public void TEST_wordsWithout(){
        AP_CS_A ap_cs_a = new AP_CS_A();

        String[] words1 = new String[]{"a","b","c","a"};

        assertArrayEquals(new String[]{"b","c"}, ap_cs_a.wordsWithout(words1, "a"));
        assertArrayEquals(new String[]{"a","c","a"}, ap_cs_a.wordsWithout(words1, "b"));
        assertArrayEquals(new String[]{"a","b","a"}, ap_cs_a.wordsWithout(words1, "c"));
    }

//    @Test
//    public void TEST_sumHeights2(){
//        AP_CS_A ap_cs_a = new AP_CS_A();
//
//    }
//
//    @Test
//    public void TEST_mergeTwo(){
//        AP_CS_A ap_cs_a = new AP_CS_A();
//
//    }
//
//    @Test
//    public void TEST_scoresClump(){
//        AP_CS_A ap_cs_a = new AP_CS_A();
//
//    }
//
//    @Test
//    public void TEST_wordsFront(){
//        AP_CS_A ap_cs_a = new AP_CS_A();
//
//    }
//
//    @Test
//    public void TEST_dividesSelf(){
//        AP_CS_A ap_cs_a = new AP_CS_A();
//
//    }
//
//    @Test
//    public void TEST_matchUp(){
//        AP_CS_A ap_cs_a = new AP_CS_A();
//
//    }
//
//    @Test
//    public void TEST_scoresSpecial(){
//        AP_CS_A ap_cs_a = new AP_CS_A();
//
//    }
//
//    @Test
//    public void TEST_bigHeights(){
//        AP_CS_A ap_cs_a = new AP_CS_A();
//
//    }
//
//    @Test
//    public void TEST_commonTwo(){
//        AP_CS_A ap_cs_a = new AP_CS_A();
//
//    }
}
