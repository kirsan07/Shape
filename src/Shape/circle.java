package Shape;

public class circle extends shape{

   public double radius;

    @Override
    public double area(){

        double PI=Math.PI;
        return PI * Math.pow(radius,2);
    }
}
