package Leesons1;

public class Lesson1_Strings {
    public static void main(String[] args) {
        String[] food={"фенхель","пармезан","лапша","банан","патока"};

        // печатаем
        for (String s : food)
            System.out.println(s);
        System.out.println("=======================================");

        // по условию начало строки
        for (String s : food) {
            if (s.startsWith("па"))
                System.out.println(s);
        }
        System.out.println("=======================================");

        // по условию конец строки
        for (String s : food) {
            if (s.endsWith("ан"))
                System.out.println(s);
        }
        System.out.println("=======================================");


    }
}
