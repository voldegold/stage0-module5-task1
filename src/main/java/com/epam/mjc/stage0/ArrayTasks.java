package com.epam.mjc.stage0;


/**
 * Here are the tasks for working with the arrays.
 * <p>
 * The usage of any additional packages (such as java.util.*) is forbidden.
 */
public class ArrayTasks {

    /**
     * Return a String[] array that will list all the seasons of the year, starting with winter.
     */
    public String[] seasonsArray() {
        String [] seasons = {"winter", "spring", "summer", "autumn"};
        return seasons;

    }

    /**
     * Generate an int[] array of consecutive positive integers
     * starting at 1 of the given length (length parameter > 0).
     * <p>
     * Example:
     * <p>
     * length = 1  -> [1]
     * length = 3  -> [1, 2, 3]
     * length = 5  -> [1, 2, 3, 4, 5]
     */
    public int[] generateNumbers(int length) {
        int [] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = i + 1;

        }

        return array;
    }

    /**
     * Find the sum of all elements of the int[] array.
     * <p>
     * Example:
     * <p>
     * arr = [1, 3, 5]   -> sum = 9
     * arr = [5, -3, -4] -> sum = -2
     */
    public int totalSum(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum += j;

        }

        return sum;
    }

    /**
     * Return the index of the first occurrence of number in the arr array.
     * If there is no such element in the array, return -1.
     * <p>
     * Example:
     * <p>
     * arr = [99, -7, 102], number = -7    ->   2
     * arr = [5, -3, -4],   number = 10    ->  -1
     */
    public int findIndexOfNumber(int[] arr, int number) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (number == arr[i]) {
                temp = i;
                break;

            } else temp = -1;

        }

        return temp;
    }

    /**
     * Return the new String[] array obtained from the arr array
     * by reversing the order of the elements.
     * <p>
     * Example:
     * <p>
     * arr = ["Bob", "Nick"]               -> ["Nick", "Bob"]
     * arr = ["pineapple", "apple", "pen"] -> ["pen", "apple", "pineapple"]
     */
    public String[] reverseArray(String[] arr) {
        String[] arr2 = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[arr.length-i-1];
        }
        return arr2;
    }



    /**
     * Return new int[] array obtained from arr int[] array
     * by choosing positive numbers only.
     * P.S. 0 is not a positive number =)
     * <p>
     * Example:
     * <p>
     * arr = [1,-2, 3]      -> [1, 3]
     * arr = [-1, -2, -3]   -> []
     * arr = [1, 2]         -> [1, 2]
     */
    public int[] getOnlyPositiveNumbers(int[] arr) {

        int [] arr2 = new int[arr.length];
        int neg_counter = 0;

        for (int i = 0, j = 0; i < arr.length ; i++) {
            if (arr[i] > 0) {
                arr2 [j] = arr [i];
                j++;

            } else neg_counter++;
        }

        System.out.println(neg_counter);

        int[] arr3 = new int [arr2.length-neg_counter];

        System.arraycopy(arr2, 0, arr3, 0, arr3.length);

        arr = arr3;



        return arr;
    }



    /**
     * Return a sorted, ragged, two-dimensional int[][] array following these rules:
     * Incoming one-dimensional arrays must be arranged in ascending order of their length;
     * numbers in all one-dimensional arrays must be in ascending order.
     * <p>
     * Example:
     * <p>
     * arr = [[3, 1, 2,], [3,2]] -> [[2, 3], [1, 2, 3]]
     * arr = [[5, 4], [7]]       -> [[7], [4, 5]]
     */
    public int[][] sortRaggedArray(int[][] arr) {

        // number sort

        for (int array_number = 0; array_number < arr.length; array_number++) {
            for (int i = 0; i < arr[array_number].length; i++) {
                for (int j = arr[array_number].length - 1; j > i; j--) {
                    if (arr[array_number][j - 1] > arr[array_number][j]) {
                        int t = arr[array_number][j - 1];
                        arr[array_number][j - 1] = arr[array_number][j];
                        arr[array_number][j] = t;
                    }
                }
            }
        }







        // array sort
        int n = arr.length;
        int [] temp ;
        System.out.println("arr.length=" + arr.length);


        for(int i=0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1].length > arr[j].length) {

                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;


                }
            }
        }



        return arr;
    }
}
