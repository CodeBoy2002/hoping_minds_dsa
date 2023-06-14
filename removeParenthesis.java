import java.util.*;

public class removeParenthesis {
    public static void main(String[] args) {
        String str = "(()())(())";
        String result = removeOuterParenthesis(str);
        System.out.println("Final: " + result);
    }

    public static String removeOuterParenthesis(String s) {
        Stack<Character> stk = new Stack<>();
        StringBuilder newString = new StringBuilder();
        char[] newStr = s.toCharArray();
        for(char c: newStr) {
            if(c == '(') {
                if(!stk.isEmpty()) {
                    newString.append(c);
                }
                stk.push(c);
            }
            if(c == ')') {
                stk.pop();
                if(!stk.isEmpty()) {
                    newString.append(c);
                }
            }
        }

        return newString.toString();
    }
}
