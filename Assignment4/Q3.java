package Assignment4;

import java.lang.Throwable;
import java.util.Scanner;

class Point{
    private int x;
    private int y;

    public Point(){
        x=0;
        y=0;
    } 

    void setPoint(int x,int y){
        this.x =x;
        this.y = y;
    } 
    int getX(){
        return x;
    }
    int getY(){
        return y;
    }
    void printPoint(){
        System.out.print("(" + x + "," + y + ")");
    } 

}

class Circle extends Point {
    private double radius;
    double area;

    public Circle() {
        radius = 1;
    }

    void setRadius(double radius){
        if (radius > 0) {
            this.radius = radius;
        } else {
            this.radius = 1;
        }
    }

    double getRadius(){
        return radius;
    }

    double calArea(){
        area = radius * radius * 3.14;
        return area;

    }
    public void printCircle() {
        System.out.print("Circle center is ");
        printPoint();
        System.out.println("\nRadius is " + radius);
        System.out.println("Area is " + calArea());
    }

}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c = new Circle();

        System.out.print("Enter x: ");
        int x = sc.nextInt();
        System.out.print("Enter y: ");
        int y = sc.nextInt();
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        c.setPoint(x, y);
        c.setRadius(r);
        c.printCircle();
    }
}
