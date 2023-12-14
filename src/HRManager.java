import java.util.Arrays;

public class HRManager  extends  Employee{
    private  JuniorDeveloper[] juniors;
    private  MidDeveloper[] mids;
    private  SeniorDeveloper[] seniors;
    public HRManager(long id, String name, double salary ,int arrayLength) {
        super(id, name, salary);
        juniors = new JuniorDeveloper[arrayLength];
        mids = new MidDeveloper[arrayLength];
        seniors = new SeniorDeveloper[arrayLength];
    }

    public void addEmployee(JuniorDeveloper junior,int index){
        try {
            if(juniors[index] != null){
                System.out.println("The index value is full :" + index);
            }
            else juniors[index] = junior;
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public void addEmployee(MidDeveloper mid,int index){
      try {
          if(mids[index] != null){
              System.out.println("The index value is full :" + index);
          }
          else mids[index] = mid;
      }
      catch (ArrayIndexOutOfBoundsException ex) {
          System.out.println(ex.getMessage());
      }
    }
    public void addEmployee(SeniorDeveloper senior,int index){
        try {
            if(seniors[index] != null){
                System.out.println("The index value is full :" + index);
            }
            else seniors[index] = senior;
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex.getMessage());
        }
    }
    @Override
    public String toString() {
        return super.toString() + " HRManager {" +
                " juniors=" + Arrays.toString(juniors) +
                ", mids=" + Arrays.toString(mids) +
                ", seniors=" + Arrays.toString(seniors) + " "+
                '}';
    }
}
