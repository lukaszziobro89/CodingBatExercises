package CodingBatExercises.E_Functional_TEST;

import CodingBatExercises.E_Functional.E_Functional_1;
import org.junit.Test;
import java.util.Arrays;
import java.util.Collections;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class E_Functional_1_Test {

    private E_Functional_1 e_functional_1 = new E_Functional_1();

    @Test
    public void TEST_doubling(){
        assertEquals(Arrays.asList(2,4,6), e_functional_1.doubling(Arrays.asList(1,2,3)));
        assertEquals(Arrays.asList(12,16,12,16,-2), e_functional_1.doubling(Arrays.asList(6,8,6,8,-1)));
        assertEquals(Collections.emptyList(), e_functional_1.doubling(Collections.emptyList()));
    }
}
