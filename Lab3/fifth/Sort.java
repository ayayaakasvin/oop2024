package Lab3.fifth;

public class Sort {
    public static <E> void swap (E[] array, int i, int j) {
        E temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static <E extends Comparable<E>> void bubbleSort (E[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    swap(array, j, j + 1);
                }
            }
        }
    }
}
