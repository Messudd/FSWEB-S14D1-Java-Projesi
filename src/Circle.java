public class Circle {
    private  double radius;
    private static final double  PI = Math.PI;

    public Circle(double rad){
        this.radius = rad < 0 ? 0 : rad;
    }

    public double getRadius() {
        return  radius;
    }
    public double getArea() {
        return  Math.sqrt(radius)* PI;
    }

}
