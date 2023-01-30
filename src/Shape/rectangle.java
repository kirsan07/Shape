package Shape;

public class rectangle extends shape{
    public double width;
    public double height;
    @Override
    public double area(){
        return width * height;
    }
}
