import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = { 3, 1, 5, 99, 3, 12 };
        System.out.println("Smallest: " + MainProgram.smallest(array));
        System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(array));
        int[] numbers = { -1, 6, 9, 8, 12 };
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 0));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 1));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 2));

        int[] numbers2 = { 3, 2, 5, 4, 8 };

        System.out.println(Arrays.toString(numbers2));

        MainProgram.swap(numbers2, 1, 0);
        System.out.println(Arrays.toString(numbers2));

        int[] numbers3 = { 8, 3, 7, 9, 1, 2, 4 };
        MainProgram.sort(numbers3);
    }

    public static int smallest(int[] array) {
        int smallest = array[0];

        for (int i : array) {
            if(smallest >= i){
                smallest = i;
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int smallest = Integer.MAX_VALUE;
        int index = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                index = i;
            }
        }
        return (index);
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int small = startIndex;
        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < table[small]) {
                small = i;
            }
        }
        return small;
    }

    public static void swap(int[] array, int index1, int index2) {
        int swap1 = array[index1];
        int swap2 = array[index2];

        array[index1] = swap2;
        array[index2] = swap1;
    }

    public static void sort(int[] array) {
        // for (int i = 0; i < array.length; i++) {
        //     for (int j = i + 1; j < array.length; j++) {
        //         int temp = 0;
        //         if (array[i] > array[j]) {
        //             temp = array[i];
        //             array[i] = array[j];
        //             array[j] = temp;
        //         }
        //     }
        //     System.out.print(array[i]);
        // }
        for(int i = 0; i < array.length;i++){
            System.out.println(Arrays.toString(array));
            swap(array, indexOfSmallestFrom(array, i), i);
        }
    }
}
