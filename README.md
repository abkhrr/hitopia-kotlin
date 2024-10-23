# Hitopia Test - Mobile Developer Kotlin

This repository containing code test for 3 problem solving case:

### 1. Weighted Strings

![weighted-strings-screen-shoot](https://github.com/user-attachments/assets/ea3241bc-b564-4fc0-89c1-3bfa68bebe34)
   
### 2. Balanced Brackets

![brackets-screen-shoot](https://github.com/user-attachments/assets/24b3e02d-2c9a-492c-a93d-787abb76118d)
   
### 3. Highest Palindrom

![palindrome-screen-shoot](https://github.com/user-attachments/assets/1bc703c2-1093-43d6-9729-26cdc8e62402)

## Complexity Analysis for Balanced Brackets Code

1. Time Complexity: O(n)

   * The function iterates through each character of the input string s exactly once.
   * For each character, the operations performed—such as checking if it’s whitespace, pushing to the stack, or popping from the stack—take constant time, O(1).
   * Therefore, if n is the length of the input string, the overall time complexity is O(n).

2. Space Complexity: O(n)

   * The space complexity arises from the use of a stack to store the opening brackets.
   * In the worst-case scenario, where all characters in the string are opening brackets, we may need to store all of them in the stack.
   * As a result, the space usage is proportional to the number of brackets in the input string, leading to a space complexity of O(n) in the worst case.

**Summary**
* Time Complexity: O(n)
* Space Complexity: O(n)


All Test is following rules of case. Thank You.
