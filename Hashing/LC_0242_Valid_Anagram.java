/*
=========================================================
Problem      : Valid Anagram
LeetCode ID  : 242
Difficulty   : Easy
Topic        : Hashing, HashMap

Approach
--------
1. If lengths are different, they cannot be anagrams.
2. Count the frequency of each character in string s.
3. Traverse string t and decrease frequencies.
4. Remove characters whose frequency becomes zero.
5. If the map becomes empty, both strings are anagrams.

Time Complexity  : O(n)
Space Complexity : O(n)
=========================================================
*/

import java.util.HashMap;

class Solution {

    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        // Count characters of s
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Remove characters using t
        for (char ch : t.toCharArray()) {

            if (!map.containsKey(ch)) {
                return false;
            }

            map.put(ch, map.get(ch) - 1);

            if (map.get(ch) == 0) {
                map.remove(ch);
            }
        }

        return map.isEmpty();
    }
}