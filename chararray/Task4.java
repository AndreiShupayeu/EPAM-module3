package by.epam.module3.chararray;
//В строке найти количество чисел.

public class Task4 {
    public static void main(String[] args) {
        String string = " Mne 39 i cherez 1 god mne budet 40      ";
        System.out.println(countNumbers(string));
    }

    private static int countNumbers(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int countNumbers = 0;
        int countDigits = 0;

        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i)) && i == 0 || Character.isDigit(s.charAt(i)) && Character.isSpaceChar(s.charAt(i - 1))) {
                countDigits++;
            }
            if (countDigits > 0) {
                if (Character.isSpaceChar(s.charAt(i))) {
                    countNumbers++;
                    countDigits = 0;
                }
                if (!Character.isDigit(s.charAt(i))) {
                    countDigits = 0;
                }
            }
        }
        if (countDigits > 0 && Character.isDigit(s.charAt(s.length() - 1))) {
            countNumbers++;
        }
        return countNumbers;
    }
}
//Перерешал через месяц

class Task4Add {
    public static void main(String[] args) {

		String s = "I am 39 years old and next year I will be 40.";

        System.out.println(countNumbers(s));
    }

    public static int countNumbers(String s) {
        if (s == null) {
            return 0;
        }
        int countNumbers = 0;
        int countDigits = 0;

        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i)) && (i == 0 || Character.isSpaceChar(s.charAt(i - 1)))) {
                countDigits++;
            }
            if (countDigits != 0 && Character.isLetter(s.charAt(i))) {
                countDigits = 0;
            }
            if ((!Character.isDigit(s.charAt(i)) || i == s.length() - 1) && countDigits != 0) {
                countDigits = 0;
                countNumbers++;
            }
        }
        return countNumbers;
    }
}