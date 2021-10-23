package by.epam.module3.regex;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Дана строка, содержащая следующий текст (xml-документ):
//<notes>
//<note id = "1">
//<to>Вася</to>
//<from>Света</from>
//<heading>Напоминание</heading>
//<body>Позвони мне завтра!</body>
//</note>
//<note id = "2">
//<to>Петя</to>
//<from>Маша</from>
//<heading>Важное напоминание</heading>
//<body/>
//</note>
//</notes>
//Напишите анализатор, позволяющий последовательно возвращать содержимое узлов xml-документа и его тип (открывающий
//тег, закрывающий тег, содержимое тега, тег без тела). Пользоваться готовыми парсерами XML для решения данной задачи
//нельзя.

public class Task2 {
    public static void main(String[] args) throws IOException {
        String text = new String(Files.readAllBytes(Paths.get("Text")), StandardCharsets.UTF_8);
        Matcher m = Pattern.compile("(<(/)?.*?(/)?>)|([À-ß]{1}[à-ÿ\\s]*)").matcher(text);
        ArrayList<String> nodes = new ArrayList<String>();
        while (m.find()) {
            nodes.add(String.format("%s %s", m.group(4) != null ? "ñîäåðæèìîå" : m.group(2) != null ? "çàêðûâàþùèé òåã" : m.group(3) != null ? "çàêðûâàþùèé òåã" : "îòêðûâàþùèé òåã", m.group()));
        }
        Iterator<String> it = nodes.iterator();
        Scanner in = new Scanner(System.in);
        System.out.println("äëÿ èòåðàöèè ïî óçëàì íàæèìàéòå îäèí 1, ÷òîáû çàâåðøèòü èòåðàöèþ, íàæìèòå 2");
        while1:
        while ( in.hasNext() ) {
            switch ( in.nextByte() ) {
                case 1 :
                    System.out.println(iter(it, nodes));
                    break;
                case 2 :
                    break while1;
            }
        }
        in.close();
    }

    public static String iter(Iterator<String> it, ArrayList<String> nodes) {

        if ( it.hasNext() ) {
            return it.next();
        }
        else {
            return "êîíåö äîêóìåíòà!";
        }
    }
}