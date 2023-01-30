package Shape;

public class square extends shape{
    public  double side;
    @Override
    public double area(){
        return Math.pow(side,2);
    }
}
