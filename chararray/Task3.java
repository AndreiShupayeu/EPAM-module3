package by.epam.module3.chararray;
//В строке найти количество цифр.

public class Task3 {
    public static void main(String[] args) {
        String string = "Mne 39 i cherez 1 god mne budet 40";
        System.out.println(string + "\n" + "V stroke tsifr: " + countDigits(string));
    }

    private static int countDigits(String string) {
        int countDigits = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isDigit(string.charAt(i))) {
                countDigits++;
            }
        }
        return countDigits;
    }
}

//Перерешал спустя несколько месяцев усердных занятий.
class Task3add {
    public static void main(String[] args) {
        String string = "I am 39 years old and next year i will be 40.";
        System.out.println(string + "\n" + "Amount of digits in string: " + countDigits(string));
    }

    private static int countDigits(String string) {
        if (string == null) {
            return 0;
        }
        int countDigits = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isDigit(string.charAt(i))) {
                countDigits++;
            }
        }
        return countDigits;
    }
}