package CodingBatExercises.B_String_TEST;

import CodingBatExercises.B_String.B_String_2;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class B_String_2_Test {
    @Test
    public void TEST_doubleChar() {
        B_String_2 b_string_2_tester = new B_String_2();

        assertEquals("TThhee", b_string_2_tester.doubleChar("The"));
        assertEquals("AAAAbbbb", b_string_2_tester.doubleChar("AAbb"));
        assertEquals("HHii--TThheerree", b_string_2_tester.doubleChar("Hi-There"));
    }

    @Test
    public void TEST_countCode() {
        B_String_2 b_string_2_tester = new B_String_2();

        assertEquals(1, b_string_2_tester.countCode("aaacodebbb"));
        assertEquals(2, b_string_2_tester.countCode("codexxcode"));
        assertEquals(2, b_string_2_tester.countCode("cozexxcope"));
        assertEquals(1, b_string_2_tester.countCode("coze"));
    }

    @Test
    public void TEST_bobThere() {
        B_String_2 b_string_2_tester = new B_String_2();

        assertTrue(b_string_2_tester.bobThere("abcbob"));
        assertTrue(b_string_2_tester.bobThere("b9b"));
        assertFalse(b_string_2_tester.bobThere("bac"));
    }

    @Test
    public void TEST_repeatEnd() {
        B_String_2 b_string_2_tester = new B_String_2();

        assertEquals("llollollo", b_string_2_tester.repeatEnd("Hello", 3));
        assertEquals("lolo", b_string_2_tester.repeatEnd("Hello", 2));
        assertEquals("o", b_string_2_tester.repeatEnd("Hello", 1));
    }

    @Test
    public void TEST_prefixAgain() {
        B_String_2 b_string_2_tester = new B_String_2();

        assertTrue( b_string_2_tester.prefixAgain("abXYabc",1));
        assertTrue( b_string_2_tester.prefixAgain("abXYabc",2));
        assertFalse( b_string_2_tester.prefixAgain("abcXYabc",3));
    }

    @Test
    public void TEST_sameStarChar() {
        B_String_2 b_string_2_tester = new B_String_2();

        assertTrue(b_string_2_tester.sameStarChar("xy*yzz"));
        assertFalse(b_string_2_tester.sameStarChar("xy*zzz"));
        assertTrue(b_string_2_tester.sameStarChar("xa*az"));
        assertFalse(b_string_2_tester.sameStarChar("*xaaz"));
        assertFalse(b_string_2_tester.sameStarChar("xaaz*"));
    }

    @Test
    public void TEST_starOut() {
        B_String_2 b_string_2_tester = new B_String_2();

        assertEquals("ad", b_string_2_tester.starOut("ab*cd"));
        assertEquals("ad", b_string_2_tester.starOut("ab**cd"));
        assertEquals("silly", b_string_2_tester.starOut("sm*eilly"));
    }

    @Test
    public void TEST_countHi() {
        B_String_2 b_string_2_tester = new B_String_2();

        assertEquals(1, b_string_2_tester.countHi("abc hi ho"));
        assertEquals(2, b_string_2_tester.countHi("ABChi hi"));
        assertEquals(2, b_string_2_tester.countHi("hihi"));
    }

    @Test
    public void TEST_endOther() {
        B_String_2 b_string_2_tester = new B_String_2();

        assertTrue(b_string_2_tester.endOther("Hiabc", "abc"));
        assertTrue(b_string_2_tester.endOther("AbC", "HiaBc"));
        assertTrue(b_string_2_tester.endOther("abc", "abXabc"));
        assertFalse(b_string_2_tester.endOther("abcde", "bc"));
    }

    @Test
    public void TEST_xyBalance() {
        B_String_2 b_string_2_tester = new B_String_2();

        assertTrue(b_string_2_tester.xyBalance("aaxbby"));
        assertFalse(b_string_2_tester.xyBalance("aaxbb"));
        assertFalse(b_string_2_tester.xyBalance("yaaxbb"));
    }

    @Test
    public void TEST_repeatFront() {
        B_String_2 b_string_2_tester = new B_String_2();

        assertEquals("ChocChoChC", b_string_2_tester.repeatFront("Chocolate", 4));
        assertEquals("ChoChC", b_string_2_tester.repeatFront("Chocolate", 3));
        assertEquals("IcI", b_string_2_tester.repeatFront("Ice Cream", 2));
    }

    @Test
    public void TEST_xyzMiddle() {
        B_String_2 b_string_2_tester = new B_String_2();

        assertTrue(b_string_2_tester.xyzMiddle("AAxyzBB"));
        assertTrue(b_string_2_tester.xyzMiddle("AxyzBB"));
        assertFalse(b_string_2_tester.xyzMiddle("AxyzBBB"));
    }

    @Test
    public void TEST_oneTwo() {
        B_String_2 b_string_2_tester = new B_String_2();

        assertEquals("bca", b_string_2_tester.oneTwo("abc"));
        assertEquals("cat", b_string_2_tester.oneTwo("tca"));
        assertEquals("catdog", b_string_2_tester.oneTwo("tcagdo"));
    }

    @Test
    public void TEST_plusOut() {
        B_String_2 b_string_2_tester = new B_String_2();

        assertEquals("++xy++", b_string_2_tester.plusOut("12xy34", "xy"));
        assertEquals("1+++++", b_string_2_tester.plusOut("12xy34", "1"));
        assertEquals("++xy++xy+++xy", b_string_2_tester.plusOut("12xy34xyabcxy", "xy"));
    }

    @Test
    public void TEST_catDog() {
        B_String_2 b_string_2_tester = new B_String_2();

        assertTrue(b_string_2_tester.catDog("catdog"));
        assertFalse(b_string_2_tester.catDog("catcat"));
        assertTrue(b_string_2_tester.catDog("1cat1cadodog"));
    }

    @Test
    public void TEST_xyzThere() {
        B_String_2 b_string_2_tester = new B_String_2();

        assertTrue(b_string_2_tester.xyzThere("abcxyz"));
        assertFalse(b_string_2_tester.xyzThere("abc.xyz"));
        assertTrue(b_string_2_tester.xyzThere("xyz.abc"));
    }

    @Test
    public void TEST_mixString() {
        B_String_2 b_string_2_tester = new B_String_2();

        assertEquals("axbycz",b_string_2_tester.mixString("abc", "xyz"));
        assertEquals("HTihere",b_string_2_tester.mixString("Hi", "There"));
        assertEquals("xTxhxexre",b_string_2_tester.mixString("xxxx", "There"));
    }

    @Test
    public void TEST_repeatSeparator() {
        B_String_2 b_string_2_tester = new B_String_2();

        assertEquals("WordXWordXWord", b_string_2_tester.repeatSeparator("Word", "X", 3));
        assertEquals("ThisAndThis", b_string_2_tester.repeatSeparator("This", "And", 2));
        assertEquals("This", b_string_2_tester.repeatSeparator("This", "And", 1));
    }

    @Test
    public void TEST_getSandwich() {
        B_String_2 b_string_2_tester = new B_String_2();

        assertEquals("jam", b_string_2_tester.getSandwich("breadjambread"));
        assertEquals("jam", b_string_2_tester.getSandwich("xxbreadjambreadyy"));
        assertEquals("", b_string_2_tester.getSandwich("xxbreadyy"));
        assertEquals("yy", b_string_2_tester.getSandwich("breadyybread"));
    }

    @Test
    public void TEST_zipZap() {
        B_String_2 b_string_2_tester = new B_String_2();

        assertEquals("zpXzp", b_string_2_tester.zipZap("zipXzap"));
        assertEquals("zpzp", b_string_2_tester.zipZap("zopzop"));
        assertEquals("zzzpzp", b_string_2_tester.zipZap("zzzopzop"));
    }
}
