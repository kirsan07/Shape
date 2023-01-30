package Shape;

public class triangle extends shape{
    public double height;
    public double base;
@Override
    public double area(){
    return base * height/2;
}
}
