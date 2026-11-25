import java.util.*;

public class Solution3 {
    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
        int minVal = Integer.MAX_VALUE;
        for (int num : brr) {
            if (num < minVal) {
                minVal = num;
            }
        }
        int[] freq = new int[101];
        for (int num : brr) {
            freq[num - minVal]++;
        }
        for (int num : arr) {
            freq[num - minVal]--;
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
            if (freq[i] > 0) {
                result.add(i + minVal);
            }
        }

        return result;
    }
}
