import java.io.*;
import java.util.*;

public class Solution {
    public static int pairs(int k, List<Integer> arr) {
        Set<Long> set = new HashSet<>();
        for (int num : arr) {
            set.add((long) num);
        }
        int count = 0;
        for (int num : arr) {
            long target = (long) num + k;
            if (set.contains(target)) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            List<Integer> arr = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                arr.add(sc.nextInt());
            }
            System.out.println(pairs(k, arr));
        }
        sc.close();
    }
}