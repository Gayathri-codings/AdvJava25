package com.demo;

public class FigureMain {
    public static void main(String[] args) {
        Triangle t = new Triangle(10,20);
        Rectangle r =  new Rectangle(10,10);

        System.out.println("Direct Object");
        Figure figure = t;
        double result1 = figure.area();
        System.out.println(result1);

        figure = r;
        double result2 = figure.area();
        System.out.println(result2);

        System.out.println("Via Method");
        showArea(t);
        showArea(r);
    }
    static void showArea(Figure figure){
        System.out.println("The output:"+figure.area());
    }

}
