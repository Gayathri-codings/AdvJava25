package com.demo.primitive.types.in.patterns;

public class Demo {
    void main(){
        int x=22;
        String s = switch(x){
            case 10 -> "it is < 20";
            case 20 ->  "it is = 20";
            case  int y when y>20 ->" it is > 20";
            default -> "not a valid number";

        };
        IO.println( s);
    }
   }
