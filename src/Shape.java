
// abstract class
// Methods and classes in Java can be declared abstract. 
// An abstract method has no implementation, 
// and an abstract class cannot be made into an object.
// Read more: https://www.java-made-easy.com/java-inheritance.html

public abstract class Shape {

    // declare fields
    String objectName = " ";

    Shape(String name) {
        this.objectName = name;
    }

    // declare non-abstract methods
    // it has default implementation
    public void moveTo(int x, int y) {
        System.out.println(this.objectName + " " + "has been moved to"
                + " x = " + x + " and y = " + y);
    }

    // abstract methods which will be
    // implemented by its subclass(es)
    abstract public double area();
    abstract public void draw();
}
