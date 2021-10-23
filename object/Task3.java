package by.epam.module3.object;

//Проверить, является ли заданное слово палиндромом.

public class Task3 {
    public static void main(String[] args) {
        String s = "madam";

        if (isWordPalindrome(s)) {
            System.out.println("Slovo: " + s + " - poliandrom.");
        } else {
            System.out.println("Slovo: " + s + " - ne poliandrom.");
        }
    }

    private static boolean isWordPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (end > start) {
            if (s.charAt(start++) != s.charAt(end--)) {
                return false;
            }
        }
        return true;
    }
}
