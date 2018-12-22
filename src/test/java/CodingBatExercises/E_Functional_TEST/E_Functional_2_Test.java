package CodingBatExercises.E_Functional_TEST;

import CodingBatExercises.E_Functional.E_Functional_2;
import org.junit.Test;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class E_Functional_2_Test {

    private E_Functional_2 e_functional_2_tester = new E_Functional_2();

    @Test
    public void TEST_noNeg(){
        assertEquals(Collections.singletonList(1), e_functional_2_tester.noNeg(Arrays.asList(1,-2)));
        assertEquals(Arrays.asList(3,3), e_functional_2_tester.noNeg(Arrays.asList(-3, -3, 3, 3)));
        assertEquals(Collections.emptyList(), e_functional_2_tester.noNeg(Arrays.asList(-1,-1,-1)));
    }
}
