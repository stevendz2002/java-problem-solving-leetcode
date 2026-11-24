# 0009. Palindrome Number

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java
**Topic:** Math, Strings
**Status:** Solved

[View problem on LeetCode](https://leetcode.com/problems/palindrome-number/)

## Problem Description

Given an integer `x`, return `true` if `x` is a palindrome, and `false` otherwise.

An integer is a palindrome when it reads the same backward as forward.

### Example

**Input:**
```text
x = 121
```

**Output:**
```text
true
```

**Explanation:** `121` reads the same from left to right and from right to left.

## My Approach

I converted the integer to a string and created a character array with the same length.

I traversed the string from right to left while filling the character array from left to right. Then I compared the original string with the resulting string to determine whether the number is a palindrome.

## Complexity Analysis

- **Time Complexity:** O(n) — The algorithm traverses every character in the string representation of the number.
- **Space Complexity:** O(n) — The algorithm stores the characters in an additional array.

## Unit Tests

The solution is tested using **JUnit 5**.

The tests cover:

- Positive palindromes.
- Positive non-palindromes.
- Negative numbers.
- Numbers ending in zero.
- Zero.
- Single-digit numbers.
- Palindromes of different lengths.
- Non-palindromes of different lengths.

Run the tests from the project root:

```bash
mvn -Dtest=PalindromeNumberTest test
```

## Project Files

**Solution:** `src/main/java/com/steven/algorithms/math/PalindromeNumber.java`

**Tests:** `src/test/java/com/steven/algorithms/math/PalindromeNumberTest.java`

---

**Solution implemented manually as part of my Java problem-solving practice.**
