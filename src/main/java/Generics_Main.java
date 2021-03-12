class Generics_Main {
    public static <E> E maxPrint(E max) {
        System.out.println("Maximum Value is:" + max);
        return max;
    }
    public static <E extends Comparable<E>> E findMax_Generics(E... num) {
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
        E temp;
        for (int i = 0; i < (num.length - 1); i++) {
            for (int j = 0; j < (num.length - 1); j++) {
                if (num[j].compareTo(num[j + 1]) < 0) {
                    temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }
        E max = num[0];
        return max;
    }

}
