class Solution {
    public boolean isValid(String s) {

        char[] charList = s.toCharArray();

        LinkedList<Character> bracketList = new LinkedList<Character>();

        for ( char current : charList) {
            Character top = bracketList.peekFirst();

            switch (current) {
                    case ')':
                        if ((top != null) && (top.charValue() == '(')) {
                            bracketList.pop();
                        } else {
                            return false;
                        }
                        break;

                    case '}':
                        if ((top != null) && (top.charValue() == '{')) {
                            bracketList.pop();
                        } else {
                            return false;
                        }
                        break;
                    case ']':
                       if ((top != null) && (top.charValue() == '[')) {
                            bracketList.pop();
                        } else {
                            return false;
                        }
                        break;
                    case '(':
                    case '{':
                    case '[':
                        bracketList.push(new Character(current));
                        break;
                    default : break;
            }
        }

        return (bracketList.size() == 0) ? true : false;
    }
}
