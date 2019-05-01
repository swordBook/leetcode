class Solution {
    public int lengthOfLastWord(String s) {

        String trimedString = s.trim();

        int stringLen = trimedString.length();

        if (stringLen == 0) {
            return 0;
        }

        char[] charList = trimedString.toCharArray();

        int lengthOfLastWord = stringLen;

        for (int i = stringLen; i > 0; i-- ) {
            if (charList[i - 1] == ' ') {
                lengthOfLastWord = stringLen - i;
                break;
            }
        }

        return lengthOfLastWord;
    }
}
