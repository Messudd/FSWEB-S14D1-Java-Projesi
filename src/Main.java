public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3.75);
        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());
        System.out.println("*****************************************");
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());
        Cuboid cuboid = new Cuboid(5,10,5);
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());
        System.out.println("**************************************");
        System.out.println("**************************************");
        JuniorDeveloper juniorMesud = new JuniorDeveloper(1000,"Mesud",25000);
        JuniorDeveloper juniorFurkan = new JuniorDeveloper(1050,"Furkan",25000);
        MidDeveloper midOnur = new MidDeveloper(1200,"Onur",30000);
        SeniorDeveloper seniorOguz = new SeniorDeveloper(1500,"Oguz",45000);
        HRManager hrManager = new HRManager(2000,"Arif",50000,5);

        hrManager.addEmployee(juniorMesud,4);
        hrManager.addEmployee(juniorFurkan,0);
        hrManager.addEmployee(seniorOguz,2);
        hrManager.addEmployee(midOnur,1);
        System.out.println(hrManager);


    }

}