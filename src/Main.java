public class Main {

    public static void main(String[] args) {

//        AUTOBOXING
//        Integer myInteger1 = new Integer(10);
//        Integer myInteger2 = 10;
//
//        System.out.println(myInteger1 + " is the primitive data type equivalent of an int. So is " + myInteger2);
//
//        Double myDouble1 = new Double(20);
//        Double myDouble2 = 20.00;
//
//        System.out.println(myDouble1 + " is the primitive data type equivalent of a double. So is " + myDouble2);
//
//        Boolean myBool1 = new Boolean(true);
//        Boolean myBool2 = true;
//
//        System.out.println(myBool1 + " is the primitive data type equivalent of a boolean. So is " + myBool2);
//
//        Float myFlt1 = new Float(1.1);
//        Float myFlt2 = (float) 1.1;
//
//        System.out.println(myFlt1 + " is the primitive data type equivalent of a float. So is " + myFlt2);
//
//        Short myShort1 = (short) 12;
//        Long myLong1 = (long) 2003;
    }

//      **** FUNDAMENTALS ****
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

//    public static void main(String[] args) {
////        **** ARRAYS ****
//
////        GROCERY LIST
//        ArrayListNotes groceryList = new ArrayListNotes();
//        groceryList.printGroceryList();
//        groceryList.addGroceryItem("Milk");
//        groceryList.addGroceryItem("Bread");
//        groceryList.addGroceryItem("Cheese");
//        groceryList.printGroceryList();
//        groceryList.modifyGroceryItem(1,"Butter");
//        groceryList.removeGroceryItem(2);
//        groceryList.printGroceryList();
//        groceryList.toArray();

//        SORT
//        int[] array = SortArray.getIntegers();
//        array = SortArray.sortArray(array);
//        SortArray.printSortedArray(array);

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
//    }
}
