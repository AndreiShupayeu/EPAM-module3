package by.epam.module3.object;
//Из заданной строки получить новую, повторив каждый символ дважды.

public class Task6 {
    public static void main(String[] args) {
        String s = "I want to become a programmer";
        System.out.println("Stroka s zadvoennimi simvolami: " + redoubleCharsInString(s));
    }

    private static String redoubleCharsInString(String s) {
        StringBuilder builder = new StringBuilder(s);
        for (int i = 0; i < builder.length(); i = i + 2) {
            builder.insert(i + 1, builder.charAt(i));
        }
        s = new String(builder);
        return s;
    }
}
