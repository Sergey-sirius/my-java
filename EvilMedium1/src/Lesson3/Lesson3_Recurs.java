package Lesson3;

public class Lesson3_Recurs {
    public static void main(String[] args) {
        // 1
        System.out.println("=======================================");
        System.out.println(factor(4));
    }

    // recursion
    public static long factor(long n){
        //
        System.out.println(n);
        if(n<=1) {
            System.out.println("=======================================");
            return 1;
        }
        else {
            return  n * (factor(n-1));
        }

    }
}

