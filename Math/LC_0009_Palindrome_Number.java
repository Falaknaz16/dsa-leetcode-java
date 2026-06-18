/*
=========================================================
Problem      : Palindrome Number
LeetCode ID  : 9
Difficulty   : Easy
Topic        : Math

Approach
--------
1. Reject negative numbers.
2. Reverse the given number.
3. Compare the reversed number with the original number.

Time Complexity  : O(log n)
Space Complexity : O(1)
=========================================================
*/

class Solution {

    public boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        int original = x;
        int reversed = 0;

        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x = x / 10;
        }

        return original == reversed;
    }
}