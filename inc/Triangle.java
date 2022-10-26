package inc;

public class Triangle extends Shape{
    private int base;
    private int height;

    public Triangle(int height, int base,String name, String color){
        super(name, color);
        this.height = height;
        this.base = base;
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
        return " " + area;
    }

    @Override
    public String getStringDisplay(){
        return "I am a " + super.getColor() + " triangle named " + super.getName() + " my base is " + this.getBase() + " and my height is " + this.getHeight() + " my area is " + this.getArea();
    }
}
