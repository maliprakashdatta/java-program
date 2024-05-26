package InhiritancePOJO.Vehiclemodel;

public class Bike extends Truck {
    private String Bikename;
    private int Bikeprice;

    public void setBikename(String Bikename)
    {
        this.Bikename = Bikename;
    }

    public String getBikename()
    {
        return Bikename;
    }

    public int getBikeprice() {
        return Bikeprice;
    }

    public void setBikeprice(int Bikeprice)
    {
        this.Bikeprice = Bikeprice;
    }
}
