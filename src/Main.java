
/**
 *
 * This example is taken almost verbatim from:
 *   https://www.geeksforgeeks.org/difference-between-abstract-class-and-interface-in-java/
 *
 */

/* 
  abstract class as compared to Interface:

The main point: Abstract class also tells you about the commonality,
and what you need to implement yourself.
Interface is just a contract about what YOU should implement. Nothing is given to you already.

Abstract class unlike regular class: Some abstract methods!

*/

public class Main {

    public static void main(String[] args) {

        // creating the Object of Rectangle class
        // and using shape class reference.
        Shape rect = new Rectangle(2, 3, "Rectangle");
        System.out.println("Area of rectangle: " + rect.area());
        rect.moveTo(1, 2);

        System.out.println(" ");

        // creating the Objects of circle class
        Shape circle = new Circle(2, "Cicle");
        System.out.println("Area of circle: " + circle.area());
        circle.moveTo(2, 4);

    }

}
