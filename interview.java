import java.util.*;
public class interview {
    public static void main(String[] args) {
        int n = 5;
        int k = 2;
        int[] scores = {5, 3, 2, 1, 4};
    
        int selected = findSelected(n, k, scores);
        System.out.println(selected);
    }

    public static int findSelected(int n, int k, int[] scores) {
        Arrays.sort(scores);
        int cutOff = scores[n - k];
        int candidate_selected = 0;
        for(int i = 0; i < n; i++) {
            if(scores[i] >= cutOff) {
                candidate_selected++;
            }
        }

        return candidate_selected;
    }
}
