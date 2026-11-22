# 0001. Two Sum

**Platform:** LeetCode  
**Difficulty:** Easy  
**Language:** Java  
**Topic:** Arrays, Brute Force  
**Status:** Solved

[View problem on LeetCode](https://leetcode.com/problems/two-sum/)

## Problem Description

Given an array of integers `nums` and an integer `target`, return the indices of two different elements whose sum equals `target`.

The problem guarantees exactly one valid solution.

### Example

**Input:**
```text
nums = [2, 7, 11, 15]
target = 9
```

**Output:**
```text
[0, 1]
```

**Explanation:** `nums[0] + nums[1] = 2 + 7 = 9`.

## My Approach

I implemented a brute-force solution using two nested loops.

The first loop selects an element, while the second loop compares it with the remaining elements. If their sum equals the target, the algorithm returns their indices.

The second loop starts at `i + 1` to avoid using the same element twice and repeating comparisons.

I also added basic validation to return an empty array when the input is `null` or no solution is found.

## Complexity Analysis

- **Time Complexity:** O(n²) — Two nested loops compare pairs of elements.
- **Space Complexity:** O(1) — The algorithm only uses a fixed-size result array and loop variables.

## Unit Tests

The solution is tested using **JUnit 5**.

The tests cover:

- Standard LeetCode examples.
- Duplicate values.
- Negative numbers.
- Zero values.
- Minimum array size.
- Cases without a valid solution.
- Null input.

Run the tests from the project root:

```bash
mvn -Dtest=TwoSumTest test
```

## Project Files

**Solution:** `src/main/java/com/steven/algorithms/arrays/TwoSum.java`

**Tests:** `src/test/java/com/steven/algorithms/arrays/TwoSumTest.java`

## Future Improvements

Explore a more efficient approach using a HashMap to reduce the average time complexity from O(n²) to O(n).

---

**Solution implemented manually as part of my Java problem-solving practice.**
