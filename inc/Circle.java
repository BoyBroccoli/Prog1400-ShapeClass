package inc;
import java.lang.Math.*;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius, String name, String color){
        super(name, color);
        this.radius=radius;
    }


    public double getRadius(){
        return this.radius;
    }
    public void setColor(float radius){
        this.radius=radius;
    }

    @Override
    public String getArea(){
        double area = Math.PI*(this.radius * this.radius);

        return " "+ area;
    }

    @Override
    public String getStringDisplay(){
        return "I am a " + super.getColor() + " circle named " + super.getName() + " my radius is " + this.getRadius() + 
        " and my area is " + this.getArea();
    }
}
