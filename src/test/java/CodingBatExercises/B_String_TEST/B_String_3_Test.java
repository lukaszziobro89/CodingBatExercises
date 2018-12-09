package CodingBatExercises.B_String_TEST;

import CodingBatExercises.B_String.B_String_3;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class B_String_3_Test {

    @Test
    public void TEST_countYZ(){
        B_String_3 b_string_3 = new B_String_3();

        assertEquals(2, b_string_3.countYZ("fez day"));
        assertEquals(2, b_string_3.countYZ("day gez"));
        assertEquals(2, b_string_3.countYZ("day fyyyz"));
    }

    @Test
    public void TEST_gHappy(){
        B_String_3 b_string_3 = new B_String_3();

        assertTrue(b_string_3.gHappy("xxggxx"));
        assertFalse(b_string_3.gHappy("xxgxx"));
        assertFalse(b_string_3.gHappy("xxggyygxx"));
        assertFalse(b_string_3.gHappy("xxggyyxg"));
        assertFalse(b_string_3.gHappy("gxxxx"));
    }

    @Test
    public void TEST_sumNumbers(){
        B_String_3 b_string_3 = new B_String_3();

        assertEquals(123, b_string_3.sumNumbers("abc123xyz"));
        assertEquals(44, b_string_3.sumNumbers("aa11b33"));
        assertEquals(18, b_string_3.sumNumbers("7 11"));
        assertEquals(45, b_string_3.sumNumbers("aa11b33b1"));
    }

    @Test
    public void TEST_withoutString(){
        B_String_3 b_string_3 = new B_String_3();

        assertEquals("x", b_string_3.withoutString("xxx", "xx"));
        assertEquals("He there", b_string_3.withoutString("Hello there", "llo"));
        assertEquals("Hllo thr", b_string_3.withoutString("Hello there", "e"));
        assertEquals("Hello there", b_string_3.withoutString("Hello there", "x"));
    }

    @Test
    public void TEST_countTriple(){
        B_String_3 b_string_3 = new B_String_3();

        assertEquals(1, b_string_3.countTriple("abcXXXabc"));
        assertEquals(3, b_string_3.countTriple("xxxabyyyycd"));
        assertEquals(0, b_string_3.countTriple("a"));
    }

    @Test
    public void TEST_mirrorEnds(){
        B_String_3 b_string_3 = new B_String_3();

        assertEquals("ab", b_string_3.mirrorEnds("abXYZba"));
        assertEquals("a", b_string_3.mirrorEnds("abca"));
        assertEquals("aba", b_string_3.mirrorEnds("aba"));
    }

    @Test
    public void TEST_notReplace(){
        B_String_3 b_string_3 = new B_String_3();

        assertEquals("is not test", b_string_3.notReplace("is test"));
        assertEquals("is not-is not", b_string_3.notReplace("is-is"));
        assertEquals("This is not right", b_string_3.notReplace("This is right"));
    }

    @Test
    public void TEST_equalIsNot(){
        B_String_3 b_string_3 = new B_String_3();

        assertFalse(b_string_3.equalIsNot("This is not"));
        assertTrue(b_string_3.equalIsNot("This is notnot"));
        assertTrue(b_string_3.equalIsNot("noisxxnotyynotxisi"));
    }

    @Test
    public void TEST_sumDigits(){
        B_String_3 b_string_3 = new B_String_3();

        assertEquals(6, b_string_3.sumDigits("aa1bc2d3"));
        assertEquals(8, b_string_3.sumDigits("aa11b33"));
        assertEquals(0, b_string_3.sumDigits("Chocolate"));
    }

    @Test
    public void TEST_maxBlock(){
        B_String_3 b_string_3 = new B_String_3();

        assertEquals(2, b_string_3.maxBlock("hoopla"));
        assertEquals(3, b_string_3.maxBlock("abbCCCddBBBxx"));
        assertEquals(0, b_string_3.maxBlock(""));
    }
}
