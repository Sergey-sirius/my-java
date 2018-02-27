package Lesson2;

public class Lesson2_Strings {
    public static void main(String[] args) {
        String s="азадеревомдеревоазадеревомлес";

        // печатаем
        System.out.println("=======================================");
        System.out.println(s.indexOf("д"));
        System.out.println(s.indexOf("дер"));
        System.out.println(s.indexOf("дер",14));
        System.out.println("=======================================");


        String a="Енот еще тот ";
        String b="полоскун";
        System.out.println(a+b);
        System.out.println(a.concat(b));
        System.out.println(a.replace("т","Д"));
        System.out.println(b.toUpperCase());
        System.out.println("=======================================");

        String c="     Енот еще тот 2   ";
        System.out.println(c);
        System.out.println(c.trim());


        System.out.println("=======================================");

    }
}
