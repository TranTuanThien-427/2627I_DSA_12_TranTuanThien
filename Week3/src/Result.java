import java.util.Scanner;

public class Result {

    public static String isBalanced(String s) {
        char[] stack = new char[s.length()];
        int top = -1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                top++;
                stack[top] = c;
            } else {
                if (top == -1) {
                    return "NO";
                }
                char open = stack[top];
                top--;
                if ((c == ')' && open != '(') ||
                        (c == ']' && open != '[') ||
                        (c == '}' && open != '{')) {
                    return "NO";
                }
            }
        }
        return top == -1 ? "YES" : "NO";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int t = scanner.nextInt();
            scanner.nextLine();
            for (int i = 0; i < t; i++) {
                String s = scanner.nextLine();
                System.out.println(isBalanced(s));
            }
        }
        scanner.close();
    }
}