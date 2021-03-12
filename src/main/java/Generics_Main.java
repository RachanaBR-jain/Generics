public class Generics_Main <E extends Comparable<E>>{
        E value1, value2, value3;

        public Generics_Main(E value1, E value2, E value3) {
            this.value1 = value1;
            this.value2 = value2;
            this.value3 = value3;
        }

        public E maxFind() {
            return Generics_Main.findMax_Generics(value1, value2, value3);
        }

        public static <E extends Comparable<E>> E findMax_Generics(E value1, E value2, E value3) {
            E max = value1;
            if (value2.compareTo(max) > 0) {
                max = value2;
            }
            if (value3.compareTo(max) > 0) {
                max = value3;
            }
            return max;
        }
    }

