package inc;

public abstract class Shape {
    protected String name;

    public Shape(String name){
        this.name = name;
    }

    // Getter and Setter for name
    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name=name;
    }

    // abstract method for area
    public abstract String getArea();


}
