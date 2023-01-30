import Shape.circle;
import Shape.rectangle;
import Shape.square;
import Shape.triangle;

public class Main {
    public static void main(String[] args) {
        circle circle = new circle();
        circle.radius=5;
        System.out.println(circle.area());
        rectangle rectangle = new rectangle();
        rectangle.height=2;
        rectangle.width=3;
        System.out.println(rectangle.area());
        triangle triangle = new triangle();
        triangle.base=4;
        triangle.height=6;
        System.out.println(triangle.area());
        square square = new square();
        square.side=7;
        System.out.println(square.area());
    }
}