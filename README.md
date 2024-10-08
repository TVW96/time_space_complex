# Assignment: Analyzing Time and Space Complexity
## Code Analysis: 
### **Time complexity = O(n^2)**
The outer loop *i* runs *n* times and inner loop *j* runs from (i+1) to (n-1), dependent on current value of *i*. **Total iterations = (n-1) + (n-2) + ... + 1 + 0 = n(n-1)/2**
### **Space complexity = O(1)**
The output uses a fixed amount of space provided to loop variables i and j. Each pair is not counted in space complexity because it does not grow with input size, in terms of storage.

### Reducing complexity
For the specific use case of printing all unique pairs within an array O(n^2) is inherent because we need to consider every combination. **consider possiblities of duplicate numbers in array. In this case a hash set would be needed.**

## Objective:
Develop your ability to analyze and determine the time and space complexity of algorithms implemented in Python or Java by performing code analysis. 

## Instructions:
Below are several code snippets in your chosen language (Python or Java). 
          
  For each snippet, perform the following tasks:
- [ ] **Resubmit using a hashsets instead of arrays**
- [x] Determine the time complexity, explaining your reasoning step by step.
- [x] Determine the space complexity, providing a rationale for your analysis.
- [x] Suggest any possible improvements to reduce the complexity, if applicable.
- [x] Submission: Submit a document containing your analysis and explanations. Include any code modifications you propose to improve the algorithm's efficiency.  

  

## Code Snippets for Analysis:
1. 
**Python**:
```
def find_max(numbers):
    max_num = numbers[0]
    for num in numbers:  
        if num > max_num:
            max_num = num
    return max_num
```
2. 
**Java**:
```
void printPairs(int[] array) {
    for (int i = 0; i < array.length; i++) {
        for (int j = i + 1; j < array.length; j++) {
            System.out.println(array[i] + ", " + array[j]);
        }
    }
}
```
## Evaluation Criteria:
**Accuracy:** 
Correct identification and explanation of time and space complexities.

**Explanation:** 
Clarity and depth of the analysis and explanations.

**Improvement Suggestions:** 
Practicality and creativity of any proposed optimizations
Rubric.
