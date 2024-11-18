//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        // generate integer array {1, 2, 3}
        int[] intArray = new int[3];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i+1;
        }
        // Run the code snippet printPairs
        // int intArray = {1, 2, 3}
        Main main = new Main();
        main.printPairs(intArray);
        // prints value pairs:
        // 1, 2
        // 1, 3
        // 2, 3

        // Time Complexity:
        // O(n^2)
        // (n * (n-1)) / 2
        // (3 * (2)) / 2 = 3

        // Space Complexity:
        // O(1)

        // generate String array of fruits
        String[] Fruits = {"banana", "apple", "orange", "strawberry"};
        // print unique value pairs of Fruits array
        main.printStringPairs(Fruits);
        // prints value pairs:
        // banana, apple
        // banana, orange
        // banana, strawberry
        // apple, orange
        // apple, strawberry
        // orange, strawberry

        // Time Complexity:
        // O(n^2)
        // (n * (n-1)) / 2
        // (4 * (3)) / 2 = 6

        // Space Complexity:
        // O(1)


        //For checking duplicate values
        int[] checkArray = {1, 2, 2, 2, 2, 3, 4};
        main.printNoDuplicatePairs(checkArray);
    }

    void printPairs ( int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                System.out.println(array[i] + ", " + array[j]);
            }
        }
    }
    // String representation of printPairs
    void printStringPairs ( String[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                System.out.println(array[i] + ", " + array[j]);
            }
        }
    }
    // HashSet with no duplicate values
    void printNoDuplicatePairs(int[] array) {
        HashSet<String> printedPairs = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                String pair = array[i] + ", " + array[j];
                // check hash for duplicate values
                if (!printedPairs.contains(pair)) {
                    System.out.println(pair);
                    printedPairs.add(pair);
                }
            }
        }
    }
}