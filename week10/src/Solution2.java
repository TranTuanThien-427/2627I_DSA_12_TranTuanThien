import java.util.*;

public class Solution2 {
    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
        Collections.sort(arr);
        Collections.sort(brr);

        Set<Integer> missing = new LinkedHashSet<>();
        int i = 0, j = 0;

        while (j < brr.size()) {
            if (i < arr.size() && arr.get(i).equals(brr.get(j))) {
                i++;
                j++;
            } else {
                missing.add(brr.get(j));
                j++;
            }
        }

        return new ArrayList<>(missing);
    }
}
