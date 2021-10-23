package by.epam.module3.object;
//С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.

public class Task4 {
    public static void main(String[] args) {
        String s= "информатика";
        String s1 = s.substring(7,8);
        s1 +=s.substring(3,5);
        s1+=s.substring(7,8);
        System.out.println("Slovo, poluchennoe kopirovaniem i konkatenatsiey: " + s1);

    }
}
