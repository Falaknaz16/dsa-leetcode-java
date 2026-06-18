/*
=========================================================
Problem      : Contains Duplicate
LeetCode ID  : 217
Difficulty   : Easy
Topic        : Hashing, HashSet

Approach
--------
1. Create a HashSet to store unique elements.
2. Traverse the array.
3. If the current element already exists in the set,
   a duplicate is found.
4. Otherwise, add the element to the set.
5. If traversal completes, no duplicates exist.

Time Complexity  : O(n)
Space Complexity : O(n)
=========================================================
*/

import java.util.HashSet;

class Solution {

    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {

            if (set.contains(num)) {
                return true;
            }

            set.add(num);
        }

        return false;
    }
}