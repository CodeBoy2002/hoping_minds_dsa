import java.util.*;
public class removeDuplicates {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        int[] arr = {0, 0, 1, 1, 2, 2, 2, 3};
        for(int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        System.out.println(set);
    }
}