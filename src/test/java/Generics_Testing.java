import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Generics_Testing {

        Generics_Main maxOperation;

        @Test
        public void givenThreeIntegers_AtFirstPosition_ShouldReturnMaximumValue() {
            maxOperation = new Generics_Main(10,7,1);
            Integer maxInteger = maxOperation.findMax_Generics(10, 7, 1);
            Assertions.assertEquals(Integer.valueOf(10), maxInteger);
        }

        @Test
        public void givenThreeIntegers_AtSecondPosition_ShouldReturnMaximumValue() {
            maxOperation = new Generics_Main(5,10,2);

            Integer maxInteger = maxOperation.findMax_Generics(5, 10, 2);
            Assertions.assertEquals(Integer.valueOf(10), maxInteger);
        }

        @Test
        public void givenThreeIntegers_AtThirdPosition_ShouldReturnMaximumValue() {
            maxOperation = new Generics_Main(5,2,10);

            Integer maxInteger = maxOperation.findMax_Generics(5, 2, 10);
            Assertions.assertEquals(Integer.valueOf(10), maxInteger);
        }

        @Test
        public void givenThreeFloats_AtFirstPosition_ShouldReturnMaximumValue() {
            maxOperation = new Generics_Main(10.33f, 1.2f, 5.7f);

            Float maxFloat = maxOperation.findMax_Generics(10.33f, 1.2f, 5.7f);
            Assertions.assertEquals(Float.valueOf(10.33f), maxFloat);
        }

        @Test
        public void givenThreeFloats_AtSecondPosition_ShouldReturnMaximumValue() {
            maxOperation = new Generics_Main(1.2f, 10.33f, 5.8f);

            Float maxFloat = maxOperation.findMax_Generics(1.2f, 10.33f, 5.8f);
            Assertions.assertEquals(Float.valueOf(10.33f), maxFloat);
        }

        @Test
        public void givenThreeFloats_AtThirdPosition_ShouldReturnMaximumValue() {
            maxOperation = new Generics_Main(5.5f, 3.2f, 10.33f);

            Float maxFloat = maxOperation.findMax_Generics(5.5f, 3.2f, 10.33f);
            Assertions.assertEquals(Float.valueOf(10.33f), maxFloat);
        }


    @Test
    public void givenThreeString_AtFirstPosition_ShouldReturnMaximumValue() {
        maxOperation = new Generics_Main("Orange", "Apple", "Banana");

        String maxString = maxOperation.findMax_Generics("Orange", "Apple", "Banana");
        Assertions.assertEquals("Orange", maxString);
    }

    @Test
    public void givenThreeString_AtSecondPosition_ShouldReturnMaximumValue() {
        maxOperation = new Generics_Main("Apple", "Orange", "Banana");
        String maxString = maxOperation.findMax_Generics("Apple", "Orange", "Banana");
        Assertions.assertEquals("Orange", maxString);
    }

    @Test
    public void givenThreeString_AtThirdPosition_ShouldReturnMaximumValue() {
        maxOperation = new Generics_Main("Apple", "Banana", "Orange");

        String maxString = maxOperation.findMax_Generics("Apple", "Banana", "Orange");
        Assertions.assertEquals("Orange", maxString);
    }



}



