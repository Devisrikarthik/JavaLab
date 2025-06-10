/*Create a class Shape with a method area(). Derive Circle and Rectangle classes from Shape and override the area() method.
In the main function, use a Shape reference to point to Circle and Rectangle objects and call the area() method.
Demonstrate how dynamic binding works by observing which area() method gets called at runtime.*/

class Shape{
    double area(){
        return 0;
    }
}
class Circle extends Shape{
    double r;
    Circle(double r){
        this.r = r;
    }
    double area(){
        return 3.14*r*r;
    }
}
class Rectangle extends Shape{
    double l,b;
    Rectangle(double l,double b){
        this.l = l;
        this.b = b;
    }
    double area(){
        return l*b;
    }
}
public class Dynamic{
    public static void main(String[] args){
        Shape s;
        s = new Circle(5);
        System.out.println("Circle Area: "+s.area());
        s = new Rectangle(4,5);
        System.out.println("Rectangle Area: "+s.area());
    }
}
