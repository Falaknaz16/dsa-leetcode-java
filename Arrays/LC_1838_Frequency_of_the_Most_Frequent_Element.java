/*
=========================================================
Problem      : Frequency of the Most Frequent Element
LeetCode ID  : 1838
Difficulty   : Medium
Topic        : Arrays, Sorting, Sliding Window

Approach
--------
1. Sort the array.
2. Maintain a sliding window [left, right].
3. Keep track of the sum of elements inside the window.
4. Calculate the operations needed to make all elements
   equal to nums[right].
5. If operations exceed k, shrink the window.
6. Track the maximum valid window size.

Time Complexity  : O(n log n)
Space Complexity : O(1)
=========================================================
*/

import java.util.Arrays;

class Solution {

    public int maxFrequency(int[] nums, int k) {

        Arrays.sort(nums);

        int left = 0;
        long sum = 0;
        int ans = 0;

        for (int right = 0; right < nums.length; right++) {

            sum += nums[right];

            while ((long) nums[right] * (right - left + 1) - sum > k) {
                sum -= nums[left];
                left++;
            }

            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }
}