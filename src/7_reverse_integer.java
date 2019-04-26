// Given a 32-bit signed integer, reverse digits of an integer.
//
// Example 1:
//
// Input: 123
// Output: 321
// Example 2:
//
// Input: -123
// Output: -321
// Example 3:
//
// Input: 120
// Output: 21
// Note:
// Assume we are dealing with an environment which could only store integers
// within the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of
// this problem, assume that your function returns 0 when the reversed integer overflows.

class Solution {
    public int reverse(int x) {

        return ((x < 0) ? reverseAbs(Math.abs(x)) * (-1) :reverseAbs(Math.abs(x)));
    }

    public int reverseAbs(int x) {
        StringBuilder output = new StringBuilder(Integer.toString(x));

        int outputNum;

        try {
            outputNum = Integer.parseInt(output.reverse().toString());
        } catch (Exception e) {
            outputNum = 0;
        }

        return outputNum;
    }
}
