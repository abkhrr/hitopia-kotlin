package com.abkhrr.gitstest

fun logic(s: String, queries: List<Int>): List<String> {
    val alphabetWeights = ('a'..'z').associateWith { it - 'a' + 1 }
    val weightSet = mutableSetOf<Int>()

    var i = 0
    while (i < s.length) {
        val currentChar = s[i]
        var weight = alphabetWeights[currentChar] ?: 0
        var j = i

        while (j < s.length && s[j] == currentChar) {
            weightSet.add(weight) // Add the current weight
            j++
            weight += alphabetWeights[currentChar] ?: 0
        }
        i = j
    }

    return queries.map { if (it in weightSet) "Yes" else "No" }
}

fun main() {
    val s = "abbcccd"
    val queries = listOf(1, 3, 9, 8)
    val result = logic(s, queries)

    println(result)
}