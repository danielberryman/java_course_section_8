public class Main {

//      **** FUNDAMENTALS ****

//    private static Scanner scan = new Scanner(System.in);
//
//    public static int[] getIntegers(int number) {
//        System.out.println("Enter " + number + " integer values.\r");
//        int[] values = new int[number];
//
//        for(int i=0; i<values.length; i++){
//            values[i] = scan.nextInt();
//        }
//
//        return values;
//    }
//
//    public static double getAverage(int[] arr){
//        int sum = 0;
//        for (int i=0; i<arr.length; i++){
//            sum += arr[i];
//        }
//
//        return (double) sum / (double) arr.length;
//    }

    public static void main(String[] args) {

//        **** ARRAYS ****

        int[] array = SortArray.getIntegers();
        array = SortArray.sortArray(array);
        SortArray.printSortedArray(array);

//        USING Integer[] instead of int[]
//        Integer[] array = SortArray.getIntegers();
//        array = SortArray.sortArray(array);
//        SortArray.printSortedArray(array);

//        **** FUNDAMENTALS ****

//        int[] myIntegers = getIntegers(5);
//        for (int i=0; i<myIntegers.length; i++){
//            System.out.println("Element " + i + " = " + myIntegers[i] + ", ");
//        }
//        System.out.println("The average is " + getAverage(myIntegers));

////          INITIALIZATION
//        int[] myIntArr = new int[25];
////          OR
//        int[] myIntArr2 = { 1,2,3,4,5,6,7,8,9,10 };
//        double[] myDoubleArr = new double[10];
//
////          SETTING VALUES
//        myIntArr[0] = 123;
//        myIntArr[5] = 50;
//
//        for(int i=0; i<myIntArr.length; i++){
//            myIntArr[i] = i*10;
//        }
//
////          SENDING ARRAYS INTO METHODS LIKE ANY OTHER VARIABLE
//        printArr(myIntArr);
//    }
//
//    public static void printArr(int[] array) {
//        for(int i=0; i<array.length; i++){
//            System.out.println("Element " + i + ", value is " + array[i]);
//        }
    }
}
