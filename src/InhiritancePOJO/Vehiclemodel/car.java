package InhiritancePOJO.Vehiclemodel;
public class car extends Bike{
    private String carname;
    private int carmodel;

    public void setCarname(String carname)
    {
        this.carname = carname;
    }

    public String getCarname()
    {
        return carname;
    }

    public int getCarmodel() {
        return carmodel;
    }

    public void setCarmodel(int carmodel)
    {
        this.carmodel = carmodel;
    }
}
