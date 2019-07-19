import java.util.Arrays;
import java.util.Scanner;

public class SortArray {

    public static int[] getIntegers() {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];

        for (int i=0; i<array.length; i++) {
            array[i] = scanner.nextInt();
            scanner.nextLine();
        }

        scanner.close();
        return array;
    }

    public static int[] sortArray(int[] array) {
//        ** COPY THE ARRAY **
//        int[] sortedArray = new int[array.length];
//        for (int i=0; i<array.length; i++) {
//            sortedArray[i] += array[i];
//        }
//        ** OR **
        int[] sortedArray = Arrays.copyOf(array, array.length);

        boolean flag = true;
        int temp;

        while(flag) {
            flag = false;
            for (int i=0; i<sortedArray.length-1; i++) {
                if(sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }

        return sortedArray;
    }

    public static void printSortedArray(int[] array) {
        System.out.println("Sorted array values are:");
        for (int i=0; i<array.length; i++) {
            System.out.println("Element " + i + " = " + array[i]);
        }
    }

//    **** USING Integer[] instead of int[] ****

//    public static Integer[] getIntegers() {
//        Scanner scanner = new Scanner(System.in);
//        Integer[] array = new Integer[5];
//
//        for (int i=0; i<array.length; i++) {
//            array[i] = scanner.nextInt();
//            scanner.nextLine();
//        }
//
//        scanner.close();
//        return array;
//    }
//
//    public static Integer[] sortArray(Integer[] array) {
//        Integer[] newArray = array;
//        Arrays.sort(newArray, Collections.reverseOrder());
//        return newArray;
//    }
//
//    public static void printSortedArray(Integer[] array) {
//        System.out.println("Sorted array values are:");
//        for (int i=0; i<array.length; i++) {
//            System.out.println("Element " + i + " = " + array[i]);
//        }
//    }
}
