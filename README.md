# Assignment: Analyzing Time and Space Complexity
environment: Java
## Code Analysis: 
```
    void printPairs ( int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                System.out.println(array[i] + ", " + array[j]);
            }
        }
    }
```
#### This function is often referred to as a **pairwise iteration** or **pairwise combination** generator. 

This is because the function will print or return all possible two element combinations of the given array. This particular function returns no value but accepts an interger array as it's argument printing all of it's pair combinations. 

Due to the nested loops **i** and **j** indexing values: 
```(int i = 0; i < array.length; i++)```
& 
```(int j = i + 1; j < array.length; j++)```
this is a quadratic function with time complexity: 
### O(n^2)
#### simplified version = (n *(n-1)) / 2
... meaning that the number of operations or steps it takes to perform this function will grow equal to that of the square of the size of the input array. 

The function uses few variable values i & j that are constant space usage, taking up **O(1)** space. The nested loops of this function do not require any extra memory space, the function takes integer array as input which does not count towards space complexity, does not use recursive programming methods, and outputs printed pairs to the console using ``System.out.println()`` but this does not count towards space complexity. So space complexity for this snippet is:
### O(1)

### Reducing complexity
For the case of printing unique pairs within an array **O(n^2)** is inherent the best solution. Considering for possiblities of duplicate numbers in array, we can consider implementing a hashset analysis.
