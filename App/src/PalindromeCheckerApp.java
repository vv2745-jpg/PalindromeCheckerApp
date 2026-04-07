import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;
public class PalindroneCheckerApp {
    public static void main(String[] args) {
        System.out.println("Palindrome Checker App");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Input text: ");
        String text = sc.nextLine();
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();
        for (char c : text.toCharArray()) {
            queue.add(c);
            stack.push(c);
        }
        boolean isPalindrome = true;
        while (!queue.isEmpty()) {
            if (!queue.remove().equals(stack.pop())) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}