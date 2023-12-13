public class Cuboid extends Rectangle {
    private  double height;

    public Cuboid(double w , double l , double height){
        super(w,l);
        this.height = height < 0 ? 0 : height;
    }
    public double getHeight() {
        return  height;
    }
    public double getVolume() {
        return  getArea() * height;
    }

    @Override
    public String toString() {
        return super.toString() + "Cuboid{" +
                "height=" + height +
                "Volume=" + getVolume()+
                '}';
    }
}
