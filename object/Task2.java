package by.epam.module3.object;
//В строке вставить после каждого символа 'a' символ 'b'.

public class Task2 {
    public static void main(String[] args) {
        String s = "a a a b b b c c c aa  aa  aa  aa ab ab ab";

        System.out.println("Stroka do obrabotki: " + "\n" + s);
        System.out.println("Stroka posle obrabotki: " + "\n" + addBAfterA(s));
    }

    private static String addBAfterA(String s) {
        StringBuilder builder = new StringBuilder(s);
        for (int i = 0; i < builder.length(); i++) {
            if (builder.charAt(i) == 'a') {
                builder.insert(i + 1, 'b');
            }
        }
        return builder.toString();
    }
}
