# Hitopia Test - Mobile Developer Kotlin

This repository containing code test for 3 problem solving case:

1. Weighted Strings
2. Balanced Brackets
3. Highest Palindrome

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