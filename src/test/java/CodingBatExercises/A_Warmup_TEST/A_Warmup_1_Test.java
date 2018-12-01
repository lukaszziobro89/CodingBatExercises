package CodingBatExercises.A_Warmup_TEST;

import CodingBatExercises.A_Warmup_1.*;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class A_Warmup_1_Test {

    @Test
    public void TEST_sleepIn_Test(){
        A_sleepIn a_sleepIn_tester = new A_sleepIn();

        assertTrue(a_sleepIn_tester.sleepIn(false, false));
        assertFalse(a_sleepIn_tester.sleepIn(true, false));
        assertEquals(false, a_sleepIn_tester.sleepIn(true,false));

    }

    @Test
    public void TEST_diff21(){
        B_diff21 b_diff21_tester = new B_diff21();

        assertEquals(2, b_diff21_tester.diff21(19));
        assertEquals(10, b_diff21_tester.diff21(11));
        assertEquals(18, b_diff21_tester.diff21(30));
        assertEquals(58, b_diff21_tester.diff21(50));
    }

    @Test
    public void TEST_C_nearHundred(){
        C_nearHundred c_nearHundred_tester = new C_nearHundred();

        assertTrue(c_nearHundred_tester.nearHundred(90));
        assertTrue(c_nearHundred_tester.nearHundred(110));
        assertTrue(c_nearHundred_tester.nearHundred(190));
        assertTrue(c_nearHundred_tester.nearHundred(210));
        assertFalse(c_nearHundred_tester.nearHundred(89));
        assertFalse(c_nearHundred_tester.nearHundred(111));
        assertFalse(c_nearHundred_tester.nearHundred(189));
        assertFalse(c_nearHundred_tester.nearHundred(211));
    }

    @Test
    public void TEST_D_missingChar(){
        D_missingChar d_missingChar_tester = new D_missingChar();

        assertEquals("ktten",d_missingChar_tester.missingChar("kitten", 1));
        assertEquals("tes",d_missingChar_tester.missingChar("test",3));
        assertEquals("uq", d_missingChar_tester.missingChar("luq",0));
    }

    @Test
    public void TEST_E_backAround(){
        E_backAround e_backAround_tester = new E_backAround();

        assertEquals("tcatt", e_backAround_tester.backAround("cat"));
        assertEquals("oHelloo", e_backAround_tester.backAround("Hello"));
        assertEquals("aaa", e_backAround_tester.backAround("a"));
    }

    @Test
    public void TEST_F_startHi(){
        F_startHi f_startHi_tester = new F_startHi();

        assertTrue(f_startHi_tester.startHi("hi"));
        assertTrue(f_startHi_tester.startHi("hi there"));
        assertFalse(f_startHi_tester.startHi("Hello hi"));
    }

    @Test
    public void TEST_F_hasTeen(){
        G_hasTeen g_hasTeen_tester = new G_hasTeen();

        assertTrue(g_hasTeen_tester.hasTeen(13,29,19));
        assertTrue(g_hasTeen_tester.hasTeen(20,19,10));
        assertTrue(g_hasTeen_tester.hasTeen(20,10,13));
        assertFalse(g_hasTeen_tester.hasTeen(1,2,3));
        assertFalse(g_hasTeen_tester.hasTeen(22,33,44));
        assertFalse(g_hasTeen_tester.hasTeen(1,23,56));

    }

    @Test
    public void TEST_H_mixStart(){
        H_mixStart h_mixStart = new H_mixStart();

        assertTrue(h_mixStart.mixStart("mix snacks"));
        assertTrue(h_mixStart.mixStart("pix snacks"));
        assertFalse(h_mixStart.mixStart("piz snacks"));
    }

    @Test
    public void TEST_I_mixStart(){
        I_close10 i_close10 = new I_close10();

        assertEquals(8,i_close10.close10(8,13));
        assertEquals(8,i_close10.close10(13,8));
        assertEquals(0,i_close10.close10(13,7));
    }

    @Test
    public void TEST_J_stringE(){
        J_stringE j_stringE_tester = new J_stringE();

        assertTrue(j_stringE_tester.stringE("Hello"));
        assertTrue(j_stringE_tester.stringE("Heello"));
        assertTrue(j_stringE_tester.stringE("Heelloe"));
        assertFalse(j_stringE_tester.stringE("Hi"));
        assertFalse(j_stringE_tester.stringE("Heeelleeo"));
        assertFalse(j_stringE_tester.stringE("Heeeel"));
    }

    @Test
    public void TEST_K_everyNth(){
        K_everyNth k_everyNth_tester = new K_everyNth();

        assertEquals("Mrce", k_everyNth_tester.everyNth("Miracle", 2));
        assertEquals("aceg", k_everyNth_tester.everyNth("abcdefg", 2));
        assertEquals("adg", k_everyNth_tester.everyNth("abcdefg",3 ));
    }

    @Test
    public void TEST_L_monkeyTrouble(){
        L_monkeyTrouble l_monkeyTrouble_tester = new L_monkeyTrouble();

        assertTrue(l_monkeyTrouble_tester.monkeyTrouble(true,true));
        assertTrue(l_monkeyTrouble_tester.monkeyTrouble(false,false));
        assertFalse(l_monkeyTrouble_tester.monkeyTrouble(true,false));
        assertFalse(l_monkeyTrouble_tester.monkeyTrouble(false,true));
    }

    @Test
    public void TEST_M_parrotTrouble(){
        M_parrotTrouble m_parrotTrouble_tester = new M_parrotTrouble();

        assertTrue(m_parrotTrouble_tester.parrotTrouble(true,6));
        assertFalse(m_parrotTrouble_tester.parrotTrouble(true, 7));
        assertFalse(m_parrotTrouble_tester.parrotTrouble(false, 6));
    }
    
    @Test
    public void TEST_N_posNeg(){
        N_posNeg n_posNeg_tester = new N_posNeg();

        assertTrue(n_posNeg_tester.posNeg(1,-1,false));
        assertTrue(n_posNeg_tester.posNeg(-1,1,false));
        assertTrue(n_posNeg_tester.posNeg(-4,-4,true));
        assertFalse(n_posNeg_tester.posNeg(-5,-5, false));
        assertFalse(n_posNeg_tester.posNeg(5,5, false));
        assertTrue(n_posNeg_tester.posNeg(-5,-5, true));
        assertFalse(n_posNeg_tester.posNeg(5,5, true));
    }
    
    @Test
    public void TEST_O_frontBack(){
        O_frontBack o_frontBack_tester = new O_frontBack();

        assertEquals("eodc", o_frontBack_tester.frontBack("code"));
        assertEquals("a", o_frontBack_tester.frontBack("a"));
        assertEquals("ba", o_frontBack_tester.frontBack("ab"));
    }

    @Test
    public void TEST_P_frontBack(){
        P_or35 p_or35_tester = new P_or35();

        assertTrue(p_or35_tester.or35(3));
        assertTrue(p_or35_tester.or35(10));
        assertFalse(p_or35_tester.or35(8));
    }

    @Test
    public void TEST_Q_icyHot(){
        Q_icyHot q_icyHot_tester = new Q_icyHot();

        assertTrue(q_icyHot_tester.icyHot(120, -1));
        assertTrue(q_icyHot_tester.icyHot(-1, 120));
        assertFalse(q_icyHot_tester.icyHot(2, 120));
        assertFalse(q_icyHot_tester.icyHot(50, 50));
    }

    @Test
    public void TEST_R_loneTeen(){
        R_loneTeen r_loneTeen_tester = new R_loneTeen();

        assertTrue(r_loneTeen_tester.loneTeen(13,99));
        assertTrue(r_loneTeen_tester.loneTeen(21, 19));
        assertTrue(r_loneTeen_tester.loneTeen(15, 1));
        assertFalse(r_loneTeen_tester.loneTeen(16, 15));
        assertFalse(r_loneTeen_tester.loneTeen(55, 55));
        assertFalse(r_loneTeen_tester.loneTeen(13,13));
    }

    @Test
    public void TEST_S_startOZ(){
        S_startOZ s_startOZ_tester = new S_startOZ();

        assertEquals("oz", s_startOZ_tester.startOz("ozymandias"));
        assertEquals("z", s_startOZ_tester.startOz("bzoo"));
        assertEquals("o", s_startOZ_tester.startOz("oxx"));
    }

    @Test
    public void TEST_T_in3050(){
        T_in3050 t_in3050_tester = new T_in3050();

        assertTrue(t_in3050_tester.in3050(30,31 ));
        assertFalse(t_in3050_tester.in3050(30, 41));
        assertTrue(t_in3050_tester.in3050(40,50));
    }


    @Test
    public void TEST_U_lastDigit(){
        U_lastDigit u_lastDigit_tester = new U_lastDigit();

        assertTrue(u_lastDigit_tester.lastDigit(3,13));
        assertTrue(u_lastDigit_tester.lastDigit(15,115));
        assertTrue(u_lastDigit_tester.lastDigit(7,11117));
        assertFalse(u_lastDigit_tester.lastDigit(5,23));
        assertFalse(u_lastDigit_tester.lastDigit(12, 157));
        assertFalse(u_lastDigit_tester.lastDigit(11,3312));
    }

    @Test
    public void TEST_V_sumDouble(){
        V_sumDouble v_sumDouble_tester = new V_sumDouble();

        assertEquals(3, v_sumDouble_tester.sumDouble(1,2));
        assertEquals(5, v_sumDouble_tester.sumDouble(3,2));
        assertEquals(8, v_sumDouble_tester.sumDouble(2,2));
        assertEquals(20, v_sumDouble_tester.sumDouble(5,5));
    }

    @Test
    public void TEST_W_makes10(){
        W_makes10 w_makes10_tester = new W_makes10();

        assertTrue(w_makes10_tester.makes10(9,10));
        assertTrue(w_makes10_tester.makes10(9,1));
        assertTrue(w_makes10_tester.makes10(2,8));
        assertFalse(w_makes10_tester.makes10(2,2));
        assertFalse(w_makes10_tester.makes10(8,1));
        assertFalse(w_makes10_tester.makes10(9,9));
    }

    @Test
    public void TEST_X_notString(){
        X_notString x_notString_tester = new X_notString();

        assertEquals("not candy", x_notString_tester.notString("candy"));
        assertEquals("not x", x_notString_tester.notString("x"));
        assertEquals("not bad", x_notString_tester.notString("not bad"));
    }

    @Test
    public void TEST_Z_front3(){
        Z_front3 z_front3_tester = new Z_front3();

        assertEquals("JavJavJav", z_front3_tester.front3("Java"));
        assertEquals("ChoChoCho", z_front3_tester.front3("Chocolate"));
        assertEquals("abcabcabc", z_front3_tester.front3("abc"));
    }

    @Test
    public void TEST_Z_front22(){
        Z_front22 z_front22_tester = new Z_front22();

        assertEquals("kikittenki", z_front22_tester.front22("kitten"));
        assertEquals("HaHaHa", z_front22_tester.front22("Ha"));
        assertEquals("ababcab", z_front22_tester.front22("abc"));

    }

    @Test
    public void TEST_Z_in1020(){
        Z_in1020 z_in1020_tester = new Z_in1020();

        assertTrue(z_in1020_tester.in1020(12,99));
        assertTrue(z_in1020_tester.in1020(21,12));
        assertFalse(z_in1020_tester.in1020(8,99));
    }

}
