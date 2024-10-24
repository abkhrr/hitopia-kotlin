package com.abkhrr.gitstest

fun isBalanced(s: String): String {
    val stack = mutableListOf<Char>()
    val bracketMap = mapOf('(' to ')', '{' to '}', '[' to ']')

    for (char in s) {
        if (char.isWhitespace()) continue

        if (bracketMap.keys.contains(char)) {
            stack.add(char)
        } else if (bracketMap.values.contains(char)) {
            if (stack.isEmpty() || bracketMap[stack.removeAt(stack.size - 1)] != char) {
                return "NO"
            }
        }
    }

    return if (stack.isEmpty()) "YES" else "NO"
}

fun main() {
    // With Whitespace
    println(isBalanced("{ [ ( ) ] }")) // Output: YES
    println(isBalanced("{ [ ( ] ) }")) // Output: NO
    println(isBalanced("{ ( ( [ ] ) [ ] ) [ ] }")) // Output: YES

    // Without Whitespace
    println(isBalanced("{[()]}")) // Output: YES
    println(isBalanced("{[(])}")) // Output: NO
    println(isBalanced("{(([])[])[]}")) // Output: YES
}
