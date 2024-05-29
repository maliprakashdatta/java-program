//Machine, Washing Machine, Dish Washer, Car Washing Machine
 package InhiritancePOJO.MachinePojo.Machinemodel;
import InhiritancePOJO.MachinePojo.Machineservices.MachineMain;

public class JCBMachine extends MachineMain
{
    String jcbtype;
    int jcbworkingspeed;

    public void setJcbtype(String jcbtype)
    {

        this.jcbtype=jcbtype;
    }
    public String getjcbCompany()
    {
        return jcbtype;
    }
    public void setjcbworkingspeed(int jcbworkingspeed)
    {

        this.jcbworkingspeed=jcbworkingspeed;
    }
    public int getjcbworkingspeed()
    {
        return jcbworkingspeed;
    }

}
