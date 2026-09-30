import java.util.Scanner;

public class QueueusingTwoStacks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int q = scanner.nextInt();

            int[] stackIn = new int[q];
            int topIn = -1;

            int[] stackOut = new int[q];
            int topOut = -1;

            for (int i = 0; i < q; i++) {
                int type = scanner.nextInt();

                if (type == 1) {
                    int x = scanner.nextInt();
                    topIn++;
                    stackIn[topIn] = x;
                } else {
                    if (topOut == -1) {
                        while (topIn > -1) {
                            topOut++;
                            stackOut[topOut] = stackIn[topIn];
                            topIn--;
                        }
                    }

                    if (type == 2) {
                        if (topOut > -1) {
                            topOut--;
                        }
                    } else if (type == 3) {
                        if (topOut > -1) {
                            System.out.println(stackOut[topOut]);
                        }
                    }
                }
            }
        }
        scanner.close();
    }
}
