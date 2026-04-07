import java.util.Scanner;
import java.util.LinkedList;
public class PalindromeCheckerApp {
    public static boolean checkPalindrome(String input) {
        LinkedList<Character> list = new LinkedList<>();
        for (char c : input.toCharArray()) {
            list.add(c);
        }
        while (list.size() > 1) {
            if (!list.removeFirst().equals(list.removeLast())) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        String input = sc.nextLine();
        boolean result = checkPalindrome(input);
        System.out.println("Is Palindrome?: " + result);
    }
}