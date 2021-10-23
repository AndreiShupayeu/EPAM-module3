package by.epam.module3.object;
//Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительным
//знаком. Определить количество предложений в строке X.

public class Task10 {
    public static void main(String[] args) {
        String s = "Я хочу быть программистом? I want to become a programmer. I'll do my best to achieve my goal!";
        System.out.println(s);
        System.out.println("V stroke kolichestvo predlozeniy: "+countSymbolsInString(s));
    }
    private static int countSymbolsInString(String s){
        int countSymbols = 0;
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)=='.'||s.charAt(i)=='!'||s.charAt(i)=='?'){
                countSymbols++;
            }
        }
        return countSymbols;
    }
}
