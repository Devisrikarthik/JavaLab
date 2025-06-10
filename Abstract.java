/*Create an abstract class Shape with a method area(). Derive Circle and Rectangle from it and override the method. Write a main function to compute the area of both.*/

abstract class Shape{
    abstract double area();
}
class Circle extends Shape{
    double radius;
    Circle(double radius){
        this.radius = radius;
    }
    double area() {
        return 3.14*radius*radius;
    }
}
class Rectangle extends Shape{
    double l,b;
    Rectangle(double l, double b){
        this.l = l;
        this.b = b;
    }
    double area(){
        return l*b;
    }
}
public class Abstract {
    public static void main(String[] args){
        Shape c = new Circle(5);
        Shape r = new Rectangle(36.5,2);
        
        System.out.println("Area of Circle is "+c.area());
        System.out.println("Area of Rectangle is "+r.area());
    }
}
