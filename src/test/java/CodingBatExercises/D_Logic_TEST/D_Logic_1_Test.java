package CodingBatExercises.D_Logic_TEST;

import CodingBatExercises.D_Logic.D_Logic_1;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class D_Logic_1_Test {


    @Test
    public void TEST_cigarParty() {
        D_Logic_1 d_logic_1_tester = new D_Logic_1();

        assertFalse(d_logic_1_tester.cigarParty(30, false));
        assertTrue(d_logic_1_tester.cigarParty(50, false));
        assertTrue(d_logic_1_tester.cigarParty(70, true));
    }

    @Test
    public void TEST_caughtSpeeding() {
        D_Logic_1 d_logic_1_tester = new D_Logic_1();

        assertEquals(0, d_logic_1_tester.caughtSpeeding(60, false));
        assertEquals(1, d_logic_1_tester.caughtSpeeding(65, false));
        assertEquals(0, d_logic_1_tester.caughtSpeeding(65, true));
    }

    @Test
    public void TEST_love6() {
        D_Logic_1 d_logic_1_tester = new D_Logic_1();

        assertTrue(d_logic_1_tester.love6(6, 4));
        assertFalse(d_logic_1_tester.love6(4, 5));
        assertTrue(d_logic_1_tester.love6(1, 5));
    }

    @Test
    public void TEST_more20() {
        D_Logic_1 d_logic_1_tester = new D_Logic_1();

        assertFalse(d_logic_1_tester.more20(20));
        assertTrue(d_logic_1_tester.more20(22));
        assertTrue(d_logic_1_tester.more20(22));
    }

    @Test
    public void TEST_nearTen() {
        D_Logic_1 d_logic_1_tester = new D_Logic_1();

        assertTrue(d_logic_1_tester.nearTen(12));
        assertFalse(d_logic_1_tester.nearTen(17));
        assertTrue(d_logic_1_tester.nearTen(19));
    }

    @Test
    public void TEST_teaParty() {
        D_Logic_1 d_logic_1_tester = new D_Logic_1();

        assertEquals(1, d_logic_1_tester.teaParty(6,8));
        assertEquals(0, d_logic_1_tester.teaParty(3,8));
        assertEquals(2, d_logic_1_tester.teaParty(20,6));
    }

    @Test
    public void TEST_twoAsOne() {
        D_Logic_1 d_logic_1_tester = new D_Logic_1();

        assertTrue(d_logic_1_tester.twoAsOne(1,2,3));
        assertTrue(d_logic_1_tester.twoAsOne(3,1,2));
        assertFalse(d_logic_1_tester.twoAsOne(3,2,2));
    }

    @Test
    public void TEST_lastDigit() {
        D_Logic_1 d_logic_1_tester = new D_Logic_1();

        assertTrue(d_logic_1_tester.lastDigit(23,19,13));
        assertFalse(d_logic_1_tester.lastDigit(23,19,12));
        assertTrue(d_logic_1_tester.lastDigit(23,19,3));
    }

    @Test
    public void TEST_maxMod5() {
        D_Logic_1 d_logic_1_tester = new D_Logic_1();

        assertEquals(3, d_logic_1_tester.maxMod5(2,3));
        assertEquals(6, d_logic_1_tester.maxMod5(6,2));
        assertEquals(3, d_logic_1_tester.maxMod5(3,2));
    }

    @Test
    public void TEST_blueTicket() {
        D_Logic_1 d_logic_1_tester = new D_Logic_1();

        assertEquals(10, d_logic_1_tester.blueTicket(9,1,0));
        assertEquals(0, d_logic_1_tester.blueTicket(9,2,0));
        assertEquals(10, d_logic_1_tester.blueTicket(6,1,4));
        assertEquals(5, d_logic_1_tester.blueTicket(6,8,-4));
    }

    @Test
    public void TEST_dateFashion() {
        D_Logic_1 d_logic_1_tester = new D_Logic_1();

        assertEquals(2, d_logic_1_tester.dateFashion(5,10));
        assertEquals(0, d_logic_1_tester.dateFashion(5,2));
        assertEquals(1, d_logic_1_tester.dateFashion(5,5));
    }

    @Test
    public void TEST_shareDigit() {
        D_Logic_1 d_logic_1_tester = new D_Logic_1();

        assertTrue(d_logic_1_tester.shareDigit(12, 23));
        assertFalse(d_logic_1_tester.shareDigit(12, 43));
        assertFalse(d_logic_1_tester.shareDigit(12, 44));
    }

    @Test
    public void TEST_sortaSum() {
        D_Logic_1 d_logic_1_tester = new D_Logic_1();

        assertEquals(7, d_logic_1_tester.sortaSum(3,4));
        assertEquals(20, d_logic_1_tester.sortaSum(9,4));
        assertEquals(21, d_logic_1_tester.sortaSum(10,11));
    }

    @Test
    public void TEST_in1To10() {
        D_Logic_1 d_logic_1_tester = new D_Logic_1();

        assertTrue(d_logic_1_tester.in1To10(5,false));
        assertFalse(d_logic_1_tester.in1To10(11,false));
        assertTrue(d_logic_1_tester.in1To10(11,true));
    }

    @Test
    public void TEST_old35() {
        D_Logic_1 d_logic_1_tester = new D_Logic_1();

        assertTrue(d_logic_1_tester.old35(3));
        assertTrue(d_logic_1_tester.old35(10));
        assertFalse(d_logic_1_tester.old35(15));
    }

    @Test
    public void TEST_teenSum() {
        D_Logic_1 d_logic_1_tester = new D_Logic_1();

        assertEquals(7, d_logic_1_tester.teenSum(3,4));
        assertEquals(19, d_logic_1_tester.teenSum(10,13));
        assertEquals(19, d_logic_1_tester.teenSum(13,2));
    }

    @Test
    public void TEST_fizzString() {
        D_Logic_1 d_logic_1_tester = new D_Logic_1();

        assertEquals("Fizz", d_logic_1_tester.fizzString("fig"));
        assertEquals("Buzz", d_logic_1_tester.fizzString("dib"));
        assertEquals("FizzBuzz", d_logic_1_tester.fizzString("fib"));
    }

    @Test
    public void TEST_inOrder() {
        D_Logic_1 d_logic_1_tester = new D_Logic_1();

        assertTrue(d_logic_1_tester.inOrder(1,2,4, false));
        assertFalse(d_logic_1_tester.inOrder(1,2,1, false));
        assertTrue(d_logic_1_tester.inOrder(1,1,2, true));
    }

    @Test
    public void TEST_redTicket() {
        D_Logic_1 d_logic_1_tester = new D_Logic_1();

        assertEquals(10, d_logic_1_tester.redTicket(2,2,2));
        assertEquals(0, d_logic_1_tester.redTicket(2,2,1));
        assertEquals(5, d_logic_1_tester.redTicket(0,0,0));
    }

    @Test
    public void TEST_squirrelPlay() {
        D_Logic_1 d_logic_1_tester = new D_Logic_1();

        assertTrue(d_logic_1_tester.squirrelPlay(70, false));
        assertFalse(d_logic_1_tester.squirrelPlay(95, false));
        assertTrue(d_logic_1_tester.squirrelPlay(95, true));
    }

    @Test
    public void TEST_alarmClock() {
        D_Logic_1 d_logic_1_tester = new D_Logic_1();

        assertEquals("7:00", d_logic_1_tester.alarmClock(1, false));
        assertEquals("7:00", d_logic_1_tester.alarmClock(5, false));
        assertEquals("10:00", d_logic_1_tester.alarmClock(0, false));
    }

    @Test
    public void TEST_less20() {
        D_Logic_1 d_logic_1_tester = new D_Logic_1();

        assertTrue(d_logic_1_tester.less20(18));
        assertTrue(d_logic_1_tester.less20(19));
        assertFalse(d_logic_1_tester.less20(20));
    }

    @Test
    public void TEST_answerCell() {
        D_Logic_1 d_logic_1_tester = new D_Logic_1();

        assertTrue(d_logic_1_tester.answerCell(false, false,false));
        assertFalse(d_logic_1_tester.answerCell(false, false,true));
        assertFalse(d_logic_1_tester.answerCell(true, false,false));
    }

    @Test
    public void TEST_fizzString2() {
        D_Logic_1 d_logic_1_tester = new D_Logic_1();

        assertEquals("1!", d_logic_1_tester.fizzString2(1));
        assertEquals("2!", d_logic_1_tester.fizzString2(2));
        assertEquals("Fizz!", d_logic_1_tester.fizzString2(3));
    }

    @Test
    public void TEST_inOrderEqual() {
        D_Logic_1 d_logic_1_tester = new D_Logic_1();

        assertTrue(d_logic_1_tester.inOrderEqual(2,5,11,false));
        assertFalse(d_logic_1_tester.inOrderEqual(5,7,6,false));
        assertTrue(d_logic_1_tester.inOrderEqual(5,5,7,true));
    }

    @Test
    public void TEST_withoutDoubles() {
        D_Logic_1 d_logic_1_tester = new D_Logic_1();

        assertEquals(5, d_logic_1_tester.withoutDoubles(2,3,true));
        assertEquals(7, d_logic_1_tester.withoutDoubles(3,3,true));
        assertEquals(6, d_logic_1_tester.withoutDoubles(3,3,false));
    }

    @Test
    public void TEST_greenTicket() {
        D_Logic_1 d_logic_1_tester = new D_Logic_1();

        assertEquals(0, d_logic_1_tester.greenTicket(1,2,3));
        assertEquals(20, d_logic_1_tester.greenTicket(2,2,2));
        assertEquals(10, d_logic_1_tester.greenTicket(1,1,2));
    }

    @Test
    public void TEST_sumLimit() {
        D_Logic_1 d_logic_1_tester = new D_Logic_1();

        assertEquals(5, d_logic_1_tester.sumLimit(2,3));
        assertEquals(8, d_logic_1_tester.sumLimit(8,3));
        assertEquals(9, d_logic_1_tester.sumLimit(8,1));
    }
}
