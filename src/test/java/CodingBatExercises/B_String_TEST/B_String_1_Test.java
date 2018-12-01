package CodingBatExercises.B_String_TEST;

import CodingBatExercises.B_String.B_String_1;
import org.junit.Test;

import static org.junit.Assert.*;

public class B_String_1_Test {

    @Test
    public void TEST_helloName(){
        B_String_1 b_string_1_tester = new B_String_1();

        assertEquals("Hello Bob!", b_string_1_tester.helloName("Bob"));
        assertEquals("Hello Alice!", b_string_1_tester.helloName("Alice"));
        assertEquals("Hello X!", b_string_1_tester.helloName("X"));
    }

    @Test
    public void TEST_firstHalf(){
        B_String_1 b_string_1_tester = new B_String_1();

        assertEquals("Woo", b_string_1_tester.firstHalf("WooHoo"));
        assertEquals("Hello", b_string_1_tester.firstHalf("HelloThere"));
        assertEquals("abc", b_string_1_tester.firstHalf("abcdef"));
    }

    @Test
    public void TEST_nonStart(){
        B_String_1 b_string_1_tester = new B_String_1();

        assertEquals("ellohere", b_string_1_tester.nonStart("Hello","There"));
        assertEquals("avaode", b_string_1_tester.nonStart("java","code"));
        assertEquals("hotlava", b_string_1_tester.nonStart("shotl","java"));
    }

    @Test
    public void TEST_theEnd(){
        B_String_1 b_string_1_tester = new B_String_1();

        assertEquals("H", b_string_1_tester.theEnd("Hello", true));
        assertEquals("o", b_string_1_tester.theEnd("Hello", false));
        assertEquals("o", b_string_1_tester.theEnd("oh", true));
    }

    @Test
    public void TEST_endsLy(){
        B_String_1 b_string_1_tester = new B_String_1();

        assertTrue(b_string_1_tester.endsLy("oddly"));
        assertFalse(b_string_1_tester.endsLy("y"));
        assertFalse(b_string_1_tester.endsLy("oddy"));
    }

    @Test
    public void TEST_middleThree(){
        B_String_1 b_string_1_tester = new B_String_1();

        assertEquals("and", b_string_1_tester.middleThree("Candy"));
        assertEquals("and", b_string_1_tester.middleThree("and"));
        assertEquals("lvi", b_string_1_tester.middleThree("solving"));
    }

    @Test
    public void TEST_lastChars(){
        B_String_1 b_string_1_tester = new B_String_1();

        assertEquals("ls", b_string_1_tester.lastChars("last", "chars"));
        assertEquals("ya", b_string_1_tester.lastChars("yo", "java"));
        assertEquals("h@", b_string_1_tester.lastChars("hi", ""));
    }

    @Test
    public void TEST_seeColor(){
        B_String_1 b_string_1_tester = new B_String_1();

        assertEquals("red", b_string_1_tester.seeColor("redxx"));
        assertEquals("", b_string_1_tester.seeColor("xxred"));
        assertEquals("blue", b_string_1_tester.seeColor("blueTimes"));
    }

    @Test
    public void TEST_extraFront(){
        B_String_1 b_string_1_tester = new B_String_1();

        assertEquals("HeHeHe", b_string_1_tester.extraFront("Hello"));
        assertEquals("ababab", b_string_1_tester.extraFront("ab"));
        assertEquals("HHH", b_string_1_tester.extraFront("H"));
    }

    @Test
    public void TEST_makeAbba(){
        B_String_1 b_string_1_tester = new B_String_1();

        assertEquals("HiByeByeHi", b_string_1_tester.makeAbba("Hi", "Bye"));
        assertEquals("YoAliceAliceYo", b_string_1_tester.makeAbba("Yo", "Alice"));
        assertEquals("WhatUpUpWhat", b_string_1_tester.makeAbba("What", "Up"));
    }

    @Test
    public void TEST_extraEnd(){
        B_String_1 b_string_1_tester = new B_String_1();

        assertEquals("lololo", b_string_1_tester.extraEnd("Hello"));
        assertEquals("ababab", b_string_1_tester.extraEnd("ab"));
        assertEquals("HiHiHi", b_string_1_tester.extraEnd("Hi"));
    }

    @Test
    public void TEST_withoutEnd(){
        B_String_1 b_string_1_tester = new B_String_1();

        assertEquals("ell", b_string_1_tester.withoutEnd("Hello"));
        assertEquals("av", b_string_1_tester.withoutEnd("java"));
        assertEquals("odin", b_string_1_tester.withoutEnd("coding"));
    }

    @Test
    public void TEST_left2(){
        B_String_1 b_string_1_tester = new B_String_1();

        assertEquals("lloHe", b_string_1_tester.left2("Hello"));
        assertEquals("vaja", b_string_1_tester.left2("java"));
        assertEquals("Hi", b_string_1_tester.left2("Hi"));
    }

    @Test
    public void TEST_withouEnd2(){
        B_String_1 b_string_1_tester = new B_String_1();

        assertEquals("ell", b_string_1_tester.withouEnd2("Hello"));
        assertEquals("b", b_string_1_tester.withouEnd2("abc"));
        assertEquals("", b_string_1_tester.withouEnd2("ab"));
    }

    @Test
    public void TEST_nTwice(){
        B_String_1 b_string_1_tester = new B_String_1();
        assertEquals("Helo", b_string_1_tester.nTwice("Hello", 2));
        assertEquals("Choate", b_string_1_tester.nTwice("Chocolate", 3));
        assertEquals("Ce", b_string_1_tester.nTwice("Chocolate", 1));
    }

    @Test
    public void TEST_hasBad(){
        B_String_1 b_string_1_tester = new B_String_1();

        assertTrue(b_string_1_tester.hasBad("badxx"));
        assertTrue(b_string_1_tester.hasBad("xbadxx"));
        assertFalse(b_string_1_tester.hasBad("xxbadxx"));
        assertFalse(b_string_1_tester.hasBad("x"));
    }

    @Test
    public void TEST_conCat(){
        B_String_1 b_string_1_tester = new B_String_1();

        assertEquals("abcat", b_string_1_tester.conCat("abc", "cat"));
        assertEquals("dogcat", b_string_1_tester.conCat("dog", "cat"));
        assertEquals("abc", b_string_1_tester.conCat("abc", ""));
    }

        @Test
    public void TEST_frontAgain(){
        B_String_1 b_string_1_tester = new B_String_1();

        assertTrue(b_string_1_tester.frontAgain("edited"));
        assertFalse(b_string_1_tester.frontAgain("edit"));
        assertTrue(b_string_1_tester.frontAgain("ed"));
    }

    @Test
    public void TEST_without2(){
        B_String_1 b_string_1_tester = new B_String_1();

        assertEquals("lloHe", b_string_1_tester.without2("HelloHe"));
        assertEquals("HelloHi", b_string_1_tester.without2("HelloHi"));
        assertEquals("", b_string_1_tester.without2("Hi"));
    }

    @Test
    public void TEST_withoutX(){
        B_String_1 b_string_1_tester = new B_String_1();

        assertEquals("Hi", b_string_1_tester.withoutX("xHix"));
        assertEquals("Hi", b_string_1_tester.withoutX("xHi"));
        assertEquals("Hxi", b_string_1_tester.withoutX("Hxix"));
    }

        @Test
    public void TEST_makeTags(){
        B_String_1 b_string_1_tester = new B_String_1();

        assertEquals("<i>Yay</i>", b_string_1_tester.makeTags("i", "Yay"));
        assertEquals("<i>Hello</i>", b_string_1_tester.makeTags("i", "Hello"));
        assertEquals("<cite>Yay</cite>", b_string_1_tester.makeTags("cite", "Yay"));
    }

    @Test
    public void TEST_firstTwo(){
        B_String_1 b_string_1_tester = new B_String_1();

        assertEquals("He", b_string_1_tester.firstTwo("Hello"));
        assertEquals("ab", b_string_1_tester.firstTwo("abcdefg"));
        assertEquals("ab", b_string_1_tester.firstTwo("ab"));
    }

    @Test
    public void TEST_comboString(){
        B_String_1 b_string_1_tester = new B_String_1();

        assertEquals("HiHelloHi", b_string_1_tester.comboString("Hello", "Hi"));
        assertEquals("HiHelloHi", b_string_1_tester.comboString("Hi", "Hello"));
        assertEquals("baaab", b_string_1_tester.comboString("aaa", "b"));
    }

        @Test
    public void TEST_right2(){
        B_String_1 b_string_1_tester = new B_String_1();

        assertEquals("loHel", b_string_1_tester.right2("Hello"));
        assertEquals("vaja", b_string_1_tester.right2("java"));
        assertEquals("Hi", b_string_1_tester.right2("Hi"));
    }

    @Test
    public void TEST_middleTwo(){
        B_String_1 b_string_1_tester = new B_String_1();

        assertEquals("ri", b_string_1_tester.middleTwo("string"));
        assertEquals("od", b_string_1_tester.middleTwo("code"));
        assertEquals("ct", b_string_1_tester.middleTwo("Practice"));
    }

    @Test
    public void TEST_twoChar(){
        B_String_1 b_string_1_tester = new B_String_1();

        assertEquals("ja", b_string_1_tester.twoChar("java",0));
        assertEquals("va", b_string_1_tester.twoChar("java", 2));
        assertEquals("ja", b_string_1_tester.twoChar("java", 3));
    }

    @Test
    public void TEST_minCat(){
        B_String_1 b_string_1_tester = new B_String_1();

        assertEquals("loHi", b_string_1_tester.minCat("Hello", "Hi"));
        assertEquals("ellojava", b_string_1_tester.minCat("Hello", "java"));
        assertEquals("javaello", b_string_1_tester.minCat("java", "Hello"));
    }

    @Test
    public void TEST_deFront() {
        B_String_1 b_string_1_tester = new B_String_1();

        assertEquals("llo", b_string_1_tester.deFront("Hello"));
        assertEquals("va", b_string_1_tester.deFront("java"));
        assertEquals("aay", b_string_1_tester.deFront("away"));
        assertEquals("abwa", b_string_1_tester.deFront("abwa"));
        assertEquals("bwa", b_string_1_tester.deFront("dbwa"));
    }

    @Test
    public void TEST_withoutX2(){
        B_String_1 b_string_1_tester = new B_String_1();

        assertEquals("Hi", b_string_1_tester.withoutX2("xHi"));
        assertEquals("Hi", b_string_1_tester.withoutX2("Hxi"));
        assertEquals("Hi", b_string_1_tester.withoutX2("Hi"));
    }

    @Test
    public void TEST_makeOutWord() {
        B_String_1 b_string_1_tester = new B_String_1();

        assertEquals("<<Yay>>", b_string_1_tester.makeOutWord("<<>>", "Yay"));
        assertEquals("<<WooHoo>>", b_string_1_tester.makeOutWord("<<>>", "WooHoo"));
        assertEquals("[[word]]", b_string_1_tester.makeOutWord("[[]]", "word"));

    }

}