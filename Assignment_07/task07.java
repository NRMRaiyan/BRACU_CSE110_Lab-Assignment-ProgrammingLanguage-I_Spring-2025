import java.util.Scanner;
public class task07 {

    public static void main(String[] args) {
        // Test Case 1
        int[] arr1 = {23, 100, 23, 56, 100};
        System.out.print("Input array: ");
        printArray(arr1);
        System.out.print("New array: ");
        int[] uniqueArr1 = getUniqueElements(arr1);
        printArray(uniqueArr1);
        System.out.println();

        // Test Case 2
        int[] arr2 = {-5, 10, -7, -5};
        System.out.print("Input array: ");
        printArray(arr2);
        System.out.print("New array: ");
        int[] uniqueArr2 = getUniqueElements(arr2);
        printArray(uniqueArr2);
        System.out.println();

        // Additional Test Case (empty array)
        int[] arr3 = {};
        System.out.print("Input array: ");
        printArray(arr3);
        System.out.print("New array: ");
        int[] uniqueArr3 = getUniqueElements(arr3);
        printArray(uniqueArr3);
        System.out.println();

        // Additional Test Case (all unique)
        int[] arr4 = {1, 2, 3, 4, 5};
        System.out.print("Input array: ");
        printArray(arr4);
        System.out.print("New array: ");
        int[] uniqueArr4 = getUniqueElements(arr4);
        printArray(uniqueArr4);
        System.out.println();

        // Additional Test Case (all duplicates)
        int[] arr5 = {7, 7, 7, 7};
        System.out.print("Input array: ");
        printArray(arr5);
        System.out.print("New array: ");
        int[] uniqueArr5 = getUniqueElements(arr5);
        printArray(uniqueArr5);
        System.out.println();
    }

    // Function to get unique elements from an array without using built-in collection methods
    public static int[] getUniqueElements(int[] originalArray) {
        if (originalArray == null || originalArray.length == 0) {
            return new int[0]; // Return an empty array for null or empty input
        }

        // We can't use dynamic lists, so we first find the count of unique elements
        // to determine the size of the new array.
        int uniqueCount = 0;
        int[] tempUniqueHolder = new int[originalArray.length]; // Temporary array to hold unique elements found so far

        for (int i = 0; i < originalArray.length; i++) {
            boolean isDuplicate = false;
            // Check if the current element is already in our tempUniqueHolder
            for (int j = 0; j < uniqueCount; j++) {
                if (originalArray[i] == tempUniqueHolder[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                tempUniqueHolder[uniqueCount] = originalArray[i];
                uniqueCount++;
            }
        }

        // Now create the final unique array with the determined uniqueCount
        int[] uniqueArray = new int[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueArray[i] = tempUniqueHolder[i];
        }
        return uniqueArray;
    }

    // Custom function to print an array without using Arrays.toString()
    public static void printArray(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("[]");
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
