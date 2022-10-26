package inc;
import java.lang.Math.*;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius, String name){
        super(name);
        this.radius=radius;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public void setName(String name){
        this.name=name;
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

        return "The area is: "+ area;
    }
}
