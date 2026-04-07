import java.util.Scanner;
import java.util.LinkedList;
import java.util.Deque;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        System.out.println("Palindrome Checker App");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Input text: ");
        String text = sc.nextLine();
        Deque<Character> deque = new LinkedList<>();
        for (char c : text.toCharArray()) {
            deque.add(c);
        }
        boolean isPalindrome = true;
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}