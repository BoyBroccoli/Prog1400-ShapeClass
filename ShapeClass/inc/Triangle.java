package inc;

public class Triangle extends Shape{
    private int base;
    private int height;

    public Triangle(int height, int base,String name){
        super(name);
        this.height = height;
        this.base = base;
    }


    @Override
    public String getName(){
        return name;
    }

    @Override
    public void setName(String name){
        this.name=name;
    }

    public int getHeight(){
        return this.height;
    }

    public void setHeight(int height){
        this.height=height;
    }

    public int getBase(){
        return this.base;
    }
    public void setBase(int base){
        this.base=base;
    }

    @Override
    public String getArea(){
        int area = (this.base * this.height)/2;
        return "The area is: " + area;
    }
}
