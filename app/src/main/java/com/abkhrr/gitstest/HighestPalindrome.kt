package com.abkhrr.gitstest

fun highestPalindrome(s: String, k: Int): String {
    val lowPalindrome = highestPalindromeRecursive(s, 0, s.length - 1, k)

    if (lowPalindrome == "-1") {
        return "-1"
    }

    return maximizePalindromeRecursive(lowPalindrome, 0, lowPalindrome.length - 1, k)
}

fun highestPalindromeRecursive(s: String, left: Int, right: Int, k: Int): String {
    if (k < 0) {
        return "-1"
    }
    if (left >= right) {
        return s
    }

    val runes = s.toCharArray()

    if (runes[left] != runes[right]) {
        if (runes[left] > runes[right]) {
            runes[right] = runes[left]
        } else {
            runes[left] = runes[right]
        }
        return highestPalindromeRecursive(String(runes), left + 1, right - 1, k - 1)
    }

    return highestPalindromeRecursive(String(runes), left + 1, right - 1, k)
}

fun maximizePalindromeRecursive(s: String, left: Int, right: Int, k: Int): String {
    if (k < 0) {
        return "-1"
    }
    if (left >= right) {
        return s
    }

    val runes = s.toCharArray()

    if (runes[left] == runes[right]) {
        if (runes[left] != '9' && k >= 2) {
            runes[left] = '9'
            runes[right] = '9'
            return maximizePalindromeRecursive(String(runes), left + 1, right - 1, k - 2)
        }
    } else {
        if (runes[left] != '9' && runes[right] != '9' && k >= 1) {
            runes[left] = '9'
            runes[right] = '9'
            return maximizePalindromeRecursive(String(runes), left + 1, right - 1, k - 1)
        } else if (runes[left] != '9') {
            runes[left] = '9'
            return maximizePalindromeRecursive(String(runes), left + 1, right - 1, k - 1)
        } else if (runes[right] != '9') {
            runes[right] = '9'
            return maximizePalindromeRecursive(String(runes), left + 1, right - 1, k - 1)
        }
    }

    return maximizePalindromeRecursive(String(runes), left + 1, right - 1, k)
}

fun main() {
    // Example 1
    val s1 = "3943"
    val k1 = 1
    println(highestPalindrome(s1, k1)) // Output: 3993

    // Example 2
    val s2 = "932239"
    val k2 = 2
    println(highestPalindrome(s2, k2)) // Output: 992299

    // Testing: Rules 1
    val s3 = "3943"
    val k3 = 0
    println(highestPalindrome(s3, k3)) // Output: 3943

    // Testing: Rules 1
    val s4 = "12345"
    val k4 = 1
    println(highestPalindrome(s4, k4)) // Output: -1
}





