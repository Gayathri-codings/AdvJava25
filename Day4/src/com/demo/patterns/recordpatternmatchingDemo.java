package com.demo.patterns;

import com.demo.patterns.records.Point;
import com.demo.patterns.records.ColoredPoint;

public class recordpatternmatchingDemo {
    static void main() {
        Point p =new Point(10,20);
        if(p instanceof Point(int x, int y)){
            System.out.println("X:"+x +"" +"y:"+y);
        }
        ColoredPoint cp = new ColoredPoint(new Point(20,30), "red");
        if(cp instanceof ColoredPoint(Point(int x, int y),String color)){
            System.out.println("X:"+x +"" +"y:"+y+"colored "+color);
        }
    }
}
