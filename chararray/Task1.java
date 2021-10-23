package by.epam.module3.chararray;
//Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        String[] strings = {"straightAngle", "increasingSequence", "evenNumber", "equilateralTriangle"};
        System.out.println("Massiv in camelCase: " + "\n" + Arrays.toString(strings) + "\n");
        String[] strings1 = converseCamelCaseToSnakeCase(strings);
        System.out.println("Massiv in snake_case: " + "\n" + Arrays.toString(strings1));
    }

    private static String[] converseCamelCaseToSnakeCase(String[] strings) {
        String[] strings1 = new String[strings.length];
        for (int i = 0; i < strings.length; i++) {
            strings1[i] = convertCamelCaseToSnakeCase(strings[i]);
        }
        return strings1;
    }

    private static int countUpperCase(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    private static String convertCamelCaseToSnakeCase(String s) {
        char[] chars1 = s.toCharArray();
        char[] chars2 = new char[chars1.length + countUpperCase(s)];
        for (int i = 0, j = 0; j < chars2.length; i++, j++) {
            chars2[j] = chars1[i];
            if (Character.isUpperCase(chars1[i])) {
                chars2[j] = '_';
                j++;
                chars2[j] = Character.toLowerCase(chars1[i]);
            }
        }
        return new String(chars2);
    }
}


