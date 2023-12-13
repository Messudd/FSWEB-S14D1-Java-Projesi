public class Cylinder extends Circle{

    private  double height;
    public Cylinder(double rad) {
        super(rad);
    }
    public Cylinder(double rad , double height){
        super(rad);
        this.height = height < 0 ? 0 : height;
    }
    public  double getHeight(){
        return  height;
    }
    public  double getVolume() {
        return  super.getArea()*height;
    }
}
