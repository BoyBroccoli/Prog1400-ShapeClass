package inc;

public class Square extends Shape {
    private int height;
    private int width;

    public Square(int height, int width, String name){
        super(name);
        this.height=height;
        this.width=width;
    }


    @Override
    public String getName(){
        return name;
    }

    @Override
    public void setName(String name){
        this.name=name;
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
        return "The area is: " + area;
    }
}
