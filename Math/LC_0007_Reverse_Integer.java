package Math;

/*
Problem: Reverse Integer
LeetCode: 7
Difficulty: Medium

Approach:
- Extract the last digit using modulo (% 10).
- Build the reversed integer digit by digit.
- Check for overflow before updating the reversed number.

Time Complexity: O(log10 n)
Space Complexity: O(1)
*/

class Solution {

    public int reverse(int x) {

        int rev = 0;

        while (x != 0) {

            int digit = x % 10;
            x /= 10;

            // Check for positive overflow
            if (rev > Integer.MAX_VALUE / 10 ||
                (rev == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }

            // Check for negative overflow
            if (rev < Integer.MIN_VALUE / 10 ||
                (rev == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }

            rev = rev * 10 + digit;
        }

        return rev;
    }
}