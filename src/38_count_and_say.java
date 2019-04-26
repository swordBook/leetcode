// The count-and-say sequence is the sequence of integers with the first five terms as following:
//
// 1.     1
// 2.     11
// 3.     21
// 4.     1211
// 5.     111221
// 1 is read off as "one 1" or 11.
// 11 is read off as "two 1s" or 21.
// 21 is read off as "one 2, then one 1" or 1211.
//
// Given an integer n where 1 ≤ n ≤ 30, generate the nth term of the count-and-say sequence.

class Solution {
    public String countAndSay(int n) {

        if (n < 1) {
            return "";
        }

        Map<Integer, String> resultMap = new HashMap<Integer, String>();

        resultMap.put(new Integer(1), "1");

        for (int i = 1; i < n; i++) {

            String lastItem = resultMap.get(i);

            StringBuilder newItem = new StringBuilder();

            char value;

            for (int j = 0; j < lastItem.length(); j++) {

                value = lastItem.charAt(j);

                int m = j;

                while ((m < lastItem.length()) && (lastItem.charAt(m) == value)) {
                    m++;
                }

                newItem.append((m - j)).append(value);

                j = m - 1;
            }

            resultMap.put(new Integer(i + 1), newItem.toString());
        }

        return resultMap.get(n);
    }
}
