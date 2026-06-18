/*
=========================================================
Problem      : Fibonacci Number
LeetCode ID  : 509
Difficulty   : Easy
Topic        : Recursion, Dynamic Programming

Approach
--------
1. Handle base cases (0 and 1).
2. Use two variables to store previous Fibonacci numbers.
3. Iteratively build the sequence up to n.
4. Return the nth Fibonacci number.

Time Complexity  : O(n)
Space Complexity : O(1)
=========================================================
*/

class Solution {

    public int fib(int n) {

        if (n <= 1)
            return n;

        int prev2 = 0;
        int prev1 = 1;

        for (int i = 2; i <= n; i++) {

            int current = prev1 + prev2;

            prev2 = prev1;
            prev1 = current;
        }

        return prev1;
    }
}