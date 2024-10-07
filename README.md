# Assignment: Analyzing Time and Space Complexity

### Objective:
Develop your ability to analyze and determine the time and space complexity of algorithms implemented in Python or Java

## Instructions:
### Code Analysis: 
Below are several code snippets in your chosen language (Python or Java). 
          
  For each snippet, perform the following tasks:

- [ ] Determine the time complexity, explaining your reasoning step by step.
- [ ] Determine the space complexity, providing a rationale for your analysis.
- [ ] Suggest any possible improvements to reduce the complexity, if applicable.
- [ ] Submission: Submit a document containing your analysis and explanations. Include any code modifications you propose to improve the algorithm's efficiency.  

  

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
