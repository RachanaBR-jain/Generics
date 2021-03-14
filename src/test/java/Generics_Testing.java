import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;

public class Generics_Testing {

    Generics_Main maxOperation;

    @BeforeEach
    void setup() {
        maxOperation = new Generics_Main();
    }

    @Test
    public void findMaxOf_N_Integers() {
        Integer[] intNum = {10, 20, 35, 45, 50};
        Integer maxInteger = maxOperation.findMax_Generics(intNum);
        maxOperation.maxPrint(maxInteger);
        Assertions.assertEquals(Integer.valueOf(50), maxInteger);
    }

    @Test
    public void findMaxOf_N_Float() {
        Float[] intNum = {1.1f, 2.1f, 3.1f, 4.1f, 5.1f};
        Float maxFloat = maxOperation.findMax_Generics(intNum);
        maxOperation.maxPrint(maxFloat);
        Assertions.assertEquals(Float.valueOf(5.1f), maxFloat);
    }

    @Test
    public void findMaxOf_N_Strings() {
        String[] string = {"Orange", "Banana", "Apple", "Goe", "WaterMellon"};
        String  maxString = maxOperation.findMax_Generics(string);
        maxOperation.maxPrint(maxString);
        Assertions.assertEquals("WaterMellon", maxString);
    }
}



