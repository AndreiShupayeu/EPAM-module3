package by.epam.module3.chararray;
//Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
//Крайние пробелы в строке удалить.

public class Task5 {
    public static void main(String[] args) {
        String string = new String("  I  want       to become  a  programmer  ");

        System.out.println("Stroka do obrabotki: " + "\n" + string + "\n" +
                "Stroka posle obrabotki: " + "\n" + removeRedundantSpaces(string));
    }

    private static String removeRedundantSpaces(String input) {

        char[] inputChars = input.toCharArray();

        char[] result = new char[input.length()];
        int resultIndex = 0;
        for (char currentChar : inputChars) {

            if (currentChar == ' ' && (resultIndex == 0 || result[resultIndex - 1] == ' ')) {
                continue;
            }
            result[resultIndex++] = currentChar;
        }

        if (resultIndex > 0 && result[resultIndex - 1] == ' ') {
            resultIndex -= 1;
        }

        return new String(result, 0, resultIndex);
    }
}

//    Решение задачи с помощью встроенной функции:
//
//    private static String removeExtraSpaces(String string) {
//        while (string.contains("  ")) {
//            string = string.replace("  ", " ");
//        }
//        string = string.trim();
//        return string;
//    }
