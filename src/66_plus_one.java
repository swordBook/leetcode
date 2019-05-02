class Solution {
    public int[] plusOne(int[] digits) {

        digits[digits.length - 1] += 1;

        for (int j = digits.length; j > 1; j--) {
           if (digits[j - 1] == 10) {

               digits[j - 2 ] += 1;

               digits[j - 1] = 0;
           }
        }

        if (digits[0] == 10) {

            int[] newDigits = new int[digits.length + 1];

            newDigits[0] = 1;

            return newDigits;
        }

        return digits;
    }
}
