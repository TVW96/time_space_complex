//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] intArray = new int[10];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i;
        }

        // instantiating the main instance
        Main mainInstance = new Main();
        // Printing string of arrays to console
        System.out.println(Arrays.toString(intArray));
        // Running the print pairs function and printing all possible unique pairs.
        mainInstance.printPairs(intArray);
    }

    void printPairs ( int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                System.out.println(array[i] + ", " + array[j]);
            }
        }
    }
}

// The outer loop i runs n times
// while the number of iterations in the inner loop depends on the current value of n.
// Total iterations = (n-1) + (n-2) + ... + 1 + 0 = n(n-1)/2

// Time complexity = O(n^2)

// The output of algorithm here uses a fixed amount of space provided to loop variables i and j,
// The output space used to print each pair is not counted in space complexity because it does not grow
// with input size, in terms of storage.

// Space complexity = O(1)

// For the specific use case of printing all unique pairs within an array O(n^2) is inherent
// because we need to consider every combination.

// ** consider possiblities of duplicate numbers in array. In this case a hash set would be needed.
