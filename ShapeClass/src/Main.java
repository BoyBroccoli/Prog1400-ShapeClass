import inc.*;

public class Main{
    public static void main(String[] args){

        Shape shpae1 = new Circle(25, "hank");
        System.out.println(shpae1.getArea());
        System.out.println(shpae1.getName());

        Shape shape2 = new Square(10, 20, "square");
        System.out.println(shape2.getArea());
        System.out.println(shape2.getName());

        Shape shape3 = new Triangle(25, 15, "triangle");
        System.out.println(shape3.getArea());
        System.out.println(shape3.getName());

    }
}