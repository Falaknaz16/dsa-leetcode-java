/*
=========================================================
Problem      : Check if Array Is Sorted and Rotated
LeetCode ID  : 1752
Difficulty   : Easy
Topic        : Arrays

Approach
--------
1. Count the number of places where the order decreases.
2. For a sorted and rotated array, there can be at most
   one such decrease point.
3. Use modulo (%) to compare the last element with the
   first element.
4. If count <= 1, the array is sorted and rotated.

Time Complexity  : O(n)
Space Complexity : O(1)
=========================================================
*/

class Solution {

    public boolean check(int[] nums) {

        int count = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {

            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
        }

        return count <= 1;
    }
}