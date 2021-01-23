import java.util.LinkedList;

/**
 * @since 1.0
 */
public class So394DecodeString {

    // 递归简单，先解决内层，再解决外层
    public String decodeString(String s) {
        if (s.length() == 0)
            return "";
        char[] chars = s.toCharArray();
        return invoke(chars, 0);
    }

    private static int numIndex = 0;

    public String invoke(char[] s, int index) {
        StringBuilder sb = new StringBuilder();
        StringBuilder num = new StringBuilder();
        for (int i = index; i < s.length; i++) {
            if ((s[i] >= 'a' && s[i] <= 'z') || (s[i] >= 'A' && s[i] <= 'Z')) {
                sb.append(s[i]);
            } else if (s[i] >= '0' && s[i] <= '9') {
                num.append(s[i]);
            } else if (s[i] == '[') {
                String invoke = invoke(s, i + 1);
                for (int j = 0; j < Integer.parseInt(num.toString()); j++) {
                    sb.append(invoke);
                }
                num.setLength(0);
                i = numIndex;
            } else if (s[i] == ']') {
                numIndex = i;
                return sb.toString();
            }
        }
        return sb.toString();
    }
}
