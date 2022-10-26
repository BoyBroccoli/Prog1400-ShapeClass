package inc;

public class Square extends Shape {
    private int height;
    private int width;

    public Square(int height, int width, String name, String color){
        super(name, color);
        this.height=height;
        this.width=width;
    }



    public int setHeight(int height){
        return this.height;
    }
    public int setWidth(int width){
        return this.width;
    }

    public int getWidth(){
        return this.width;
    }
    public int getHeight(){
        return this.height;
    }

    @Override
    public String getArea(){
        int area = height * width;
        return " " + area;
    }

    @Override
    public String getStringDisplay(){
        return "I am a " + super.getColor() + " square named " + super.getName() + " my width is " + this.getWidth() + 
        " and my height is " + this.getHeight() + " my area is " + this.getArea();
    }
}
