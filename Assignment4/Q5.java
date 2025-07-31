package Assignment4;

class Shape {
    void display(){
            System.out.println("This is a shape");
        }
}

class Polygon extends Shape{
    void display(){
            System.out.println("Polygon is a shape");
        }
}

class Rectangle extends Shape{
    void display(){
            System.out.println("Rectangle is a Polygon");
        }
}

class Triangle extends Shape{
    void display(){
            System.out.println("Triangle is a Polygon");
        }
}

class Square extends Shape{
    void display(){
            System.out.println("Square is a rectangle");
        }
}

public class Q5 {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Polygon polygon = new Polygon();
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();
        Square square = new Square();

        shape.display();;
        polygon.display();
        rectangle.display();
        triangle.display();
        square.display();

    }
}
