package by.epam.module3.object;
//Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. Учитывать только английские
//буквы.

public class Task9 {
    public static void main(String[] args) {
        String s = "I want to become a programmer. Я хочу быть программистом.";
        System.out.println(s);
        System.out.println("Kolichestvo strochnih angliyskih bukv: " + countLettersInRange(s,'a','z'));
        System.out.println("Kolichestvo propisnih angliyskih bukv: " + countLettersInRange(s, 'A','Z'));
    }

    private static int countLettersInRange(String s, char start, char end) {
        int countLetters = 0;
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if ((aChar >= start) && (aChar <= end)) {
                countLetters++;
            }
        }
        return countLetters;
    }
}
