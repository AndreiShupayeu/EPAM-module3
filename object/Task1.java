package by.epam.module3.object;

//Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.

public class Task1 {
    public static void main(String[] args) {
        String s = "   I   want to become       a  programmer              ";

        System.out.println(s + "\n" + "V stroke maksimalnoe chislo probelov podryd: " + countMaxSpaces(s));
    }

    private static int countMaxSpaces(String s) {
        int countSpaces = 0;
        int countMaxSpaces = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isSpaceChar(s.charAt(i))) {
                countSpaces++;
            } else {
                countSpaces = 0;
            }
            if (countSpaces > countMaxSpaces) {
                countMaxSpaces = countSpaces;
            }
        }
        return countMaxSpaces;
    }
}
