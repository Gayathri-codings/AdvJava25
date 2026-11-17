package lab.no1;

import java.util.function.Function;

public class ex1 {

    static int square(int n){
        return n*n;
    }
    static void main() {
        System.out.println(ex1.square(10));
       // System.out.println(ex1.getSquare(5));

        Function <Integer, Integer> square= (Integer a) -> a*a;

    }
}
