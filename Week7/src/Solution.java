
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        Queue<Integer> maxPQ =
                new PriorityQueue<>(N / 2 + 1, Collections.reverseOrder());

        Queue<Integer> minPQ =
                new PriorityQueue<>(N / 2 + 1);

        for (int i = 0; i < N; i++) {
            int x = scanner.nextInt();

            // Thêm x vào hàng đợi phù hợp
            if (maxPQ.isEmpty() || x <= maxPQ.peek()) {
                maxPQ.add(x);
            } else {
                minPQ.add(x);
            }
            if (maxPQ.size() > minPQ.size() + 1) {
                minPQ.add(maxPQ.poll());
            } else if (minPQ.size() > maxPQ.size() + 1) {
                maxPQ.add(minPQ.poll());
            }
            if (maxPQ.size() == minPQ.size()) {
                double median =
                        ((double) maxPQ.peek() + minPQ.peek()) / 2.0;
                System.out.printf("%.1f%n", median);
            } else if (maxPQ.size() > minPQ.size()) {
                System.out.printf("%.1f%n", (double) maxPQ.peek());
            } else {
                System.out.printf("%.1f%n", (double) minPQ.peek());
            }
        }

        scanner.close();
    }
}

