package com.demo;

import java.util.function.Consumer;

//_ is used to define the unused vauables so it is called unnamed variables.
//errorCode is not used in Failure case block so declared with "_"
public class unnamedDemo {
    sealed interface Result permits Success , Failure{};
    record Success(String message)implements Result{};
    record Failure(String errorCode, String message)implements Result{};
    static void main() {
        Result r = new Failure("500","service unavailable");
        switch(r){
            case Success(String message)-> System.out.println("Success Message"+message);
            case Failure(_, String message)-> System.out.println("Failure Message"+message);

        }

        //Consuemer helps to print the messages.here variables are not used then can be declared as unnamed variables.
        Consumer<String> printMsg = _ ->IO.println("hello");
        printMsg.accept("");

        try{
            IO.println(10/0);
        }catch (ArithmeticException _){
            IO.println("divded by zero error");
        }
    }
}
