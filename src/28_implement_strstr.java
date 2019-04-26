// Implement strStr().
//
// Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
//
// Example 1:
//
// Input: haystack = "hello", needle = "ll"
// Output: 2
// Example 2:
//
// Input: haystack = "aaaaa", needle = "bba"
// Output: -1


class Solution {
    public int strStr(String haystack, String needle) {

        int m = haystack.length();

        int n = needle.length();

        int i,j;

        if(m < n) {
           return -1;
        }

        for(i = 0; i < m - n + 1; i++){

            for(j = 0; j < n; j++)

                if(haystack.charAt(i + j) != needle.charAt(j))
                    break;

            if(j == n) {
                return i;
            }
        }

        return -1;
    }
}
