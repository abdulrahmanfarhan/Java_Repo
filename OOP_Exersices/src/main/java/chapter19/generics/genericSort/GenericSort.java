package chapter19.generics.genericSort;

public class GenericSort {
    public static void main(String[] args) {
        Integer[] intArray = {2, 4, 3};
        Double[] doubleArray = {3.4, 1.3, -22.1};
        Character[] charArray = {'a', 'J', 'r'};
        String[] stringArray = {"Tom", "Susan", "Kim"};

        sort(intArray);
        sort(doubleArray);
        sort(charArray);
        sort(stringArray);

        System.out.print("Sorted Integer objects: ");
        printList(intArray);
        System.out.print("Sorted Double objects: ");
        printList(doubleArray);
        System.out.print("Sorted Character objects: ");
        printList(charArray);
        System.out.print("Sorted String objects: ");
        printList(stringArray);
    }

    //Generic Selection Sort Method...
    public static <E extends Comparable<E>> void sort(E[] arr) {
        E currentMin;
        int currentMinIndex;

        for (int i = 0; i < arr.length - 1; i++) {
            currentMin = arr[i];
            currentMinIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (currentMin.compareTo(arr[j]) > 0) {
                    currentMin = arr[j];
                    currentMinIndex = j;
                }
            }

            if (currentMinIndex != i) {
                arr[currentMinIndex] = arr[i];
                arr[i] = currentMin;
            }
        }
    }

    public static <E> void printList(E[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
