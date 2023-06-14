import java.util.Stack;

public class adjString {
    public static void main(String[] args) {
        String s = "abbaca";
        String result = removeDup(s);
        System.out.println(result);
    }

    public static String removeDup(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch: s.toCharArray()) {
            if(!stack.isEmpty() && stack.peek() == ch) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(char ch: stack) {
            sb.append(ch);
        }

        return sb.toString();
    }
}
