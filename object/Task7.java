package by.epam.module3.object;
//Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено "abc cde
//def", то должно быть выведено "abcdef".

public class Task7 {
    public static void main(String[] args) {
        String s = "I want to become a programmer";
        System.out.println(DeleteRepeatSymbolsAndSpaces(s));
    }

    private static String DeleteRepeatSymbolsAndSpaces(String s) {
        char[] chars = s.toCharArray();
        StringBuilder builder = new StringBuilder();
        int[] countArray = new int[255];
        for (int i = 0; i < s.length(); i++) {
            char c = chars[i];
            if (countArray[c] == 0 && (int) c != 32) {
                countArray[c] = 1;
                builder.append(c);
            }
        }
        return new String(builder);
    }
}
//         ЗАДАЧА МОГЛА БЫТЬ РЕШЕНА ДРУГИМ СПОСОБОМ:

//    private static String deleteRepeatSymbols(String s) {
//        char[] chars = s.toCharArray();
//        for (int i = 0; i < s.length(); i++) {
//            for (int j = i + 1; j < s.length(); j++) {
//                if (chars[i] == chars[j]) {
//                    chars[j] = ' ';
//                }
//            }
//        }
//        return new String(chars);
//    }
//
//    private static String deleteSpaces(String s) {
//        StringBuilder builder = new StringBuilder();
//        for (int i = 0; i < s.length(); i++) {
//            if (!Character.isSpaceChar(s.charAt(i))) {
//                builder.append(s.charAt(i));
//            }
//        }
//        return new String(builder);
//    }

//       ЗАДАЧА МОГЛА БЫТЬ РЕШЕНА ТРЕТЬИМ СПОСОБОМ:

//    private static String toDeleteRepeatSymbolsAndSpaces(String s) {
//        StringBuilder sb = new StringBuilder();
//        int index;
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            index = s.indexOf(c, i + 1);
//            if (index == -1) {
//                sb.append(c);
//            }
//        }
//        s = new String(sb);
//        s = s.replaceAll(" ", "");
//        return s;
//    }

