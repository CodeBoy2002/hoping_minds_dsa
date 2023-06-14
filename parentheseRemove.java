import java.util.Stack;

public class parentheseRemove {
    public static void main(String[] args) {
        String input = "((((()))))";
        String output = optimizedParenthesis(input);
        System.out.println(output);
    }

    public static String optimizedParenthesis(String seq) {
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < sb.length(); i++) {
            if(sb.charAt(i) == '(') {
                stack.push(i);
            } else if(sb.charAt(i) == ')') {
                if(!stack.isEmpty()) {
                    stack.pop();
                } else {
                    sb.setCharAt(i, ' ');
                }
            }
        }

        while(!stack.isEmpty()) {
            sb.setCharAt(stack.pop(), ' ');
        }

        for(int i = sb.length() - 1; i >= 0; i--) {
            if(sb.charAt(i) == ' ') {
                sb.deleteCharAt(i);
            }
        }

        return sb.toString();
    } 
}
