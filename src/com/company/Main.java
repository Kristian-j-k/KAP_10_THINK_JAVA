package com.company;
import java.awt.Point;
import java.awt.Rectangle;



public class Main {

    public static void main(String[] args) {

    //EXERCISE 3
        // STACKDIAGRAM
        //centeret af firkanten vil hele tiden være det samme
        //box1 (2,4,7,9)
        //p1 findCenter(box1) 2+7/2=5.5 4+9/2=8.5  (5.5,8.5)
        //box1.grow 2-1 , 4-1 , 7+1*2 , 9+1*2  (1,3,9,11)
        //p2 finCenter(box1) 1+9/2=5.5 3+11/2=8.5 (5.5,8.5)
        // OUTPUT
        //(5,8) mon den afrunder
        //(5,8) mon den afrunder
        Rectangle box1 = new Rectangle(2, 4, 7, 9);
        Point p1 = findCenter(box1);
        printPoint(p1);

        box1.grow(1, 1);
        Point p2 = findCenter(box1);
        printPoint(p2);
    //EXERCISE 3 END

	//EXERCISE 2
    /* //STACKDIAGRAM
        // blank(5,8)
        // rect(0,2,4,4)
        // center 0+4/2 og 2+4/2 = (2,4) fra findCenter
        // dist x 2-5=-3 y 4-8=-4 -3*-3+-4*-4=25 sqr(25^)=5 fra distance
        //OUTPUT 5.0
        Point blank = new Point(5, 8);

        Rectangle rect = new Rectangle(0, 2, 4, 4);
        Point center = findCenter(rect);

        double dist = distance(center, blank);
        System.out.println(dist);
        EXERCISE 2 END     */
    }

    public static Point findCenter(Rectangle box) { //afrunder tilsyneladende ned
        int x = box.x + box.width / 2;
        int y = box.y + box.height / 2;
        return new Point(x, y);
    }
    public static double distance(Point p1, Point p2) {
        int dx = p2.x - p1.x;
        int dy = p2.y - p1.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
    public static void printPoint(Point p) {
        System.out.println("(" + p.x + ", " + p.y + ")");
    }
}

