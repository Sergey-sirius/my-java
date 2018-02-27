package Lesson3;

public class Lesson3_Recurs {
    public static void main(String[] args) {
        // 1
        System.out.println("=======================================");
        System.out.println(factor(1));
    }

    // recursion
    public static long factor(long n){
        //
        if(n<=1) return 1;
        else {
            return  n * (factor(n-1));
        }

    }
}

