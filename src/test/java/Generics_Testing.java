import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Generics_Testing {

    Generics_Main maxOperation;

    @BeforeEach
    void setup() {
        maxOperation = new Generics_Main();
    }

    @Test
    public void findMaxOf_N_Integers() {
        Integer[] intNum = {1, 2, 3, 4, 5};
        Integer maxInteger = maxOperation.findMax_Generics(intNum);
        maxOperation.maxPrint(maxInteger);
        Assertions.assertEquals(Integer.valueOf(5), maxInteger);
    }

    @Test
    public void findMaxOf_N_Float() {
        Float[] intNum = {1.0f, 2.0f, 3.0f, 4.0f, 5.0f};
        Float maxFloat = maxOperation.findMax_Generics(intNum);
        maxOperation.maxPrint(maxFloat);
        Assertions.assertEquals(Float.valueOf(5.0f), maxFloat);
    }

    @Test
    public void findMaxOf_N_Strings() {
        String[] string = {"Orange", "Banana", "Apple", "Goe", "WaterMellon"};
        String  maxString = maxOperation.findMax_Generics(string);
        maxOperation.maxPrint(maxString);
        Assertions.assertEquals("WaterMellon", maxString);
    }
}



