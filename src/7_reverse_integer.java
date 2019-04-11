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
