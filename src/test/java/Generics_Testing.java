import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Generics_Testing {

        Generics_Main maxOperation;

        @BeforeEach
        public void setup() {
            maxOperation = new Generics_Main();
        }

        @Test
        public void givenThreeIntegers_AtFirstPosition_ShouldReturnMaximumValue() {
            Integer maxInteger = maxOperation.findMaxInt(10, 7, 1);
            Assertions.assertEquals(Integer.valueOf(10), maxInteger);
        }

        @Test
        public void givenThreeIntegers_AtSecondPosition_ShouldReturnMaximumValue() {
            Integer maxInteger = maxOperation.findMaxInt(5, 10, 2);
            Assertions.assertEquals(Integer.valueOf(10), maxInteger);
        }

        @Test
        public void givenThreeIntegers_AtThirdPosition_ShouldReturnMaximumValue() {
            Integer maxInteger = maxOperation.findMaxInt(5, 2, 10);
            Assertions.assertEquals(Integer.valueOf(10), maxInteger);
        }

        @Test
        public void givenThreeFloats_AtFirstPosition_ShouldReturnMaximumValue() {
            Float maxFloat = maxOperation.findMaxFloat(10.33f, 1.2f, 5.7f);
            Assertions.assertEquals(Float.valueOf(10.33f), maxFloat);
        }

        @Test
        public void givenThreeFloats_AtSecondPosition_ShouldReturnMaximumValue() {
            Float maxFloat = maxOperation.findMaxFloat(1.2f, 10.33f, 5.8f);
            Assertions.assertEquals(Float.valueOf(10.33f), maxFloat);
        }

        @Test
        public void givenThreeFloats_AtThirdPosition_ShouldReturnMaximumValue() {
            Float maxFloat = maxOperation.findMaxFloat(5.5f, 3.2f, 10.33f);
            Assertions.assertEquals(Float.valueOf(10.33f), maxFloat);
        }


    @Test
    public void givenThreeString_AtFirstPosition_ShouldReturnMaximumValue() {
        String maxString = maxOperation.findMaxString("Orange", "Apple", "Banana");
        Assertions.assertEquals("Orange", maxString);
    }

    @Test
    public void givenThreeString_AtSecondPosition_ShouldReturnMaximumValue() {
        String maxString = maxOperation.findMaxString("Apple", "Orange", "Banana");
        Assertions.assertEquals("Orange", maxString);
    }

    @Test
    public void givenThreeString_AtThirdPosition_ShouldReturnMaximumValue() {
        String maxString = maxOperation.findMaxString("Apple", "Banana", "Orange");
        Assertions.assertEquals("Orange", maxString);
    }



}



