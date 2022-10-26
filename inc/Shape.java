package inc;

public abstract class Shape {
    protected String name;
    protected String color;
    public static int shapeCount = 0;

    public Shape(String name, String color){
        this.name = name;
        this.color = color;
        shapeCount++;
    }

    // Getter and Setter for name
    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color=color;
    }

    // abstract method for area
    public abstract String getArea();

    public abstract String getStringDisplay();


}
