package by.epam.module3.object;
//Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. Случай, когда самых
//длинных слов может быть несколько, не обрабатывать.

public class Task8 {
    public static void main(String[] args) {
        String s = "I want to become a programmer";
        System.out.println(s + "\n" + "Samoe dlinnoe slovo: " + findLargestWord(s));
    }

    private static String findLargestWord(String s) {
        int index = 0;
        int countLetter = 0;
        int maxCount = countLetter;

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i))) {
                countLetter++;
            } else {
                countLetter = 0;
            }
            if (countLetter > maxCount) {
                maxCount = countLetter;
                index = i;
            }
        }
        return s.substring(index + 1 - maxCount, index + 1);
    }
}

// Задача могла быть решена с помощью метода split, но применение этого метода затрачивает больше памяти.
//
//    private static String findLargestWord(String s) {
//        String[] array = s.split(" ");
//        int max = array[0].length();
//        String s1 = " ";
//        for (int i = 1; i < array.length; i++) {
//            if (max < array[i].length()) {
//                max = array[i].length();
//                s1 = array[i];
//            }
//        }
//        return s1;
//    }
//}
