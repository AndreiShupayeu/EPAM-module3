package by.epam.module3.chararray;
//Замените в строке все вхождения 'word' на 'letter'.

public class Task2 {
    public static void main(String[] args) {
        String word = "word";
        String letter = "letter";

        String sentence = "word can kill, word can save," +
                " with a word you can lead the troops behind you." +
                " with a word you can sell, and betray, and buy, " +
                "word can be melted into blasting lead.";

        System.out.println("Stroka s word: " + "\n" + sentence);
        String strings = replacementWords(sentence, letter, word);
        System.out.println("Stroka s letter: " + "\n" + strings);


//        Решение задачи с помощью встроенной функции:

//        System.out.println("Stroka s word: " + "\n" + sentence);
//        sentence = sentence.replace("word", "letter");
//        System.out.println("Stroka s letter: " + "\n" + sentence);
    }

    private static int differenceBetweenWords(String letter, String word) {
        return letter.length() - word.length();
    }

    private static int countWords(String word) {

        int counter = 0;

        char[] wordChars = word.toCharArray();

        int charToFindIndex = 0;
        char[] charsToFind = {'w', 'o', 'r', 'd'};

        for (int i = 0; i < wordChars.length; ++i) {
            char nextChar = wordChars[i];

            if (nextChar == charsToFind[charToFindIndex]) {
                charToFindIndex++;
            } else {
                if (charToFindIndex > 0) {
                    i--;
                }
                charToFindIndex = 0;
            }

            if (charToFindIndex == charsToFind.length) {
                counter++;
                charToFindIndex = 0;
            }
        }
        return counter;
    }

    private static String replacementWords(String sentence, String letter, String word) {
        char[] sentenceChars = sentence.toCharArray();
        char[] charsToFind = {'w', 'o', 'r', 'd'};
        char[] newChar = new char[sentenceChars.length + differenceBetweenWords(letter, word) * countWords(sentence)];

        int charToFindIndex = 0;

        for (int i = 0, j = 0; j < newChar.length; i++, j++) {
            newChar[j] = sentenceChars[i];
            if (sentenceChars[i] == charsToFind[charToFindIndex]) {
                charToFindIndex++;
            } else {
                if (charToFindIndex > 0) {
                    i--;
                    j--;
                    charToFindIndex = 0;
                }
            }
            if (charToFindIndex == charsToFind.length) {
                newChar[j-3]='l';
                newChar[j-2]='e';
                newChar[j-1]='t';
                newChar[j]='t';
                j++;
                newChar[j]='e';
                j++;
                newChar[j]='r';
                charToFindIndex = 0;
            }
        }
        return new String(newChar);
    }
}
