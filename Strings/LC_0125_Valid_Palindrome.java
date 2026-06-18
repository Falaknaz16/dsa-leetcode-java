/*
=========================================================
Problem      : Valid Palindrome
LeetCode ID  : 125
Difficulty   : Easy
Topic        : Strings

Approach
--------
1. Create a cleaned string containing only
   alphanumeric characters.
2. Convert all characters to lowercase.
3. Create the reverse of the cleaned string.
4. Compare both strings.

Time Complexity  : O(n)
Space Complexity : O(n)
=========================================================
*/

class Solution {

    public boolean isPalindrome(String s) {

        String str = "";

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                str += Character.toLowerCase(ch);
            }
        }

        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        return str.equals(reverse);
    }
}