package com.steven.algorithms.math;

import com.steven.algorithms.math.PalindromeNumber;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumberTest {

    private final PalindromeNumber solution = new PalindromeNumber();

    @Test
    void testPositivePalindrome() {
        assertTrue(solution.isPalindrome(121));
    }

    @Test
    void testPositiveNonPalindrome() {
        assertFalse(solution.isPalindrome(123));
    }

    @Test
    void testNegativeNumber() {
        assertFalse(solution.isPalindrome(-121));
    }

    @Test
    void testNumberEndingInZero() {
        assertFalse(solution.isPalindrome(10));
    }

    @Test
    void testZero() {
        assertTrue(solution.isPalindrome(0));
    }

    @Test
    void testSingleDigitPalindrome() {
        assertTrue(solution.isPalindrome(7));
    }

    @Test
    void testPalindromeOfDifferentLengths() {
        assertTrue(solution.isPalindrome(1221));
        assertTrue(solution.isPalindrome(12321));
        assertTrue(solution.isPalindrome(123454321));
    }

    @Test
    void testNonPalindromeOfDifferentLengths() {
        assertFalse(solution.isPalindrome(1234));
        assertFalse(solution.isPalindrome(12331));
        assertFalse(solution.isPalindrome(123456789));
    }
}
