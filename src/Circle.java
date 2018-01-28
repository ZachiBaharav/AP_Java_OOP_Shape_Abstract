


class Circle extends Shape {
     
    int radius;
     
    //constructor
    Circle(int radius, String name) {
        super(name);
        this.radius = radius;
    }
     
    @Override
    public void draw(){
         
        System.out.println("Circle has been drawn "); 
    }
     
    @Override
    public double area()     {
        return (double)((Math.PI * radius*radius)/2);
    }
}