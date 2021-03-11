import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GenericsTesting {

        GenericsMain maxTest;

        @Before
        public void setup() {
            maxTest = new GenericsMain();
        }

        @Test
        public void firstPositionShouldReturnMaximumValue() {
            Integer maxInteger = maxTest.find_Max(7, 5, 1);
            Assertions.assertEquals( Integer.valueOf(7),  maxInteger);
        }

        @Test
        public void secondPositionShouldReturnMaximumValue() {
            Integer maxInteger = maxTest.find_Max(5, 10, 1);
            Assertions.assertEquals( Integer.valueOf(10),  maxInteger);
        }

        @Test
        public void thirdPositionShouldReturnMaximumValue() {
            Integer maxInteger = maxTest.find_Max(5, 1, 10);
            Assertions.assertEquals( Integer.valueOf(10),  maxInteger);
        }
}


