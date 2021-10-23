package by.epam.module3.object;
//Подсчитать, сколько раз среди символов заданной строки встречается буква "a".

public class Task5 {
    public static void main(String[] args) {
        String s = "МАма мыла раму";
        System.out.println(countAInSentence(s));
    }

    private static int countAInSentence(String s) {
        int countA = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'а'||s.charAt(i) == 'A') {
                countA++;
            }
        }
        return countA;
    }
}
