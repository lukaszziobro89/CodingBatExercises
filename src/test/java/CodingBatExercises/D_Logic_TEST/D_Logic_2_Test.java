package CodingBatExercises.D_Logic_TEST;

import CodingBatExercises.D_Logic.D_Logic_2;

import org.junit.Test;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class D_Logic_2_Test {
    @Test
    public void TEST_makeBricks() {
        D_Logic_2 d_logic_2_tester = new D_Logic_2();

        assertTrue(d_logic_2_tester.makeBricks(3,1,8));
        assertFalse(d_logic_2_tester.makeBricks(3,1,9));
        assertTrue(d_logic_2_tester.makeBricks(3,2,10));
    }

    @Test
    public void TEST_noTeenSum() {
        D_Logic_2 d_logic_2_tester = new D_Logic_2();

        assertEquals(6, d_logic_2_tester.noTeenSum(1,2,3));
        assertEquals(3, d_logic_2_tester.noTeenSum(2,13,1));
        assertEquals(3, d_logic_2_tester.noTeenSum(2,1,14));
    }

    @Test
    public void TEST_blackjack() {
        D_Logic_2 d_logic_2_tester = new D_Logic_2();

        assertEquals(21, d_logic_2_tester.blackjack(19,21));
        assertEquals(21, d_logic_2_tester.blackjack(21,19));
        assertEquals(19, d_logic_2_tester.blackjack(19,22));
    }

    @Test
    public void TEST_loneSum() {
        D_Logic_2 d_logic_2_tester = new D_Logic_2();

        assertEquals(6, d_logic_2_tester.loneSum(1,2,3));
        assertEquals(2, d_logic_2_tester.loneSum(3,2,3));
        assertEquals(0, d_logic_2_tester.loneSum(3,3,3));
    }

    @Test
    public void TEST_roundSum() {
        D_Logic_2 d_logic_2_tester = new D_Logic_2();

        assertEquals(60, d_logic_2_tester.roundSum(16,17,18));
        assertEquals(30, d_logic_2_tester.roundSum(12,13,14));
        assertEquals(10, d_logic_2_tester.roundSum(6,4,4));
    }

    @Test
    public void TEST_evenlySpaced() {
        D_Logic_2 d_logic_2_tester = new D_Logic_2();

        assertTrue(d_logic_2_tester.evenlySpaced(2,4,6));
        assertTrue(d_logic_2_tester.evenlySpaced(4,6,2));
        assertFalse(d_logic_2_tester.evenlySpaced(4,6,3));

    }

    @Test
    public void TEST_luckySum() {
        D_Logic_2 d_logic_2_tester = new D_Logic_2();

        assertEquals(6, d_logic_2_tester.luckySum(1,2,3));
        assertEquals(3, d_logic_2_tester.luckySum(1,2,13));
        assertEquals(1, d_logic_2_tester.luckySum(1,13,3));
    }

    @Test
    public void TEST_closeFar() {
        D_Logic_2 d_logic_2_tester = new D_Logic_2();

        assertTrue(d_logic_2_tester.closeFar(1,2,10));
        assertFalse(d_logic_2_tester.closeFar(1,2,3));
        assertTrue(d_logic_2_tester.closeFar(4,1,3));
    }

    @Test
    public void TEST_makeChocolate() {
        D_Logic_2 d_logic_2_tester = new D_Logic_2();

        assertEquals(4, d_logic_2_tester.makeChocolate(4,1,9));
        assertEquals(-1, d_logic_2_tester.makeChocolate(4,1,10));
        assertEquals(2, d_logic_2_tester.makeChocolate(4,1,7));
    }

}
