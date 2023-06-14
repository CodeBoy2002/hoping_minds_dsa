import java.util.*;
public class hayStackStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hayStack = sc.next();
        String needle = sc.next();
        int number = hayStack.indexOf(needle);
        System.out.println(number);
    }
}
