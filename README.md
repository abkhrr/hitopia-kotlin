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

   * The given function scans through every character of the string s exactly once.
   * For every character, actions such as seeing whether it is space, pushing, and popping receive constant time, O(1).
   * Therefore, if n represents the input string length, the overall time complexity can be written as O(n).

2. Space Complexity: O(n)

   * A space complexity is resulted from the necessity of a stack to keep the entire opening brackets.
   * In the worst case scenario all characters of the string are opening brackets; such all will have to be kept in the stack.
   * Thus, the space used is dependent on the number of brackets present in the input string giving it a space complexity of O(n) in the extreme case.

**Summary**
* Time Complexity: O(n)
* Space Complexity: O(n)


All Test is following rules of case. Thank You.
