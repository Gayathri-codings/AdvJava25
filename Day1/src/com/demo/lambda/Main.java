package com.demo.lambda;

public class Main {
    static void main() {
        Greet greet = new GoodMorning();
        System.out.println(greet.getGreet());

        //below code is for ananymous inner class implementation
        Greet greet2 = new Greet(){
            @Override
            public String getGreet() {
                return "Good day";
            }
        };
            System.out.println(greet2.getGreet());

//Above code is rewritten like below.
            Greet greet3 =() -> "Have a nice day";
        System.out.println(greet3.getGreet());


    }
}
