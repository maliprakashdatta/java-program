//Please implement the below POJO classes with the help of inheritance:
//- Vehicle, Car, Bike, Truck, Rickshwa
package InhiritancePOJO.vehicalProgram;
public class Vehicle {
    String fuelType;
  boolean isAutomatic;
   int transmission;
    public void setfuelType(String fuelType)
    {
        this.fuelType = fuelType;
    }

    public String getfuelType()
    {
        return fuelType;
    }
    public void setisAutomatic(boolean isAutomatic)
    {
        this.isAutomatic = isAutomatic;
    }

    public boolean getisAutomatic()
    {
        return isAutomatic;
    }

    public void settransmission(int transmission)
    {
        this.transmission = transmission;
    }

    public int gettransmission()
    {
        return transmission;
    }
    public static void main(String[] args)
    {
        Vehicle v1=new Vehicle();
        v1.setfuelType("Petrol");
        v1.setisAutomatic(v1.isAutomatic);
        v1.settransmission(34);
        System.out.println("----------------------------------------------");
        System.out.println("fuelType:-"+v1.fuelType);
        System.out.println("transmission:-"+v1.transmission);
        System.out.println("---------------------------------------------");
        car c1=new car();
        c1.setisSunroof(c1.isSunroof);
        System.out.println(" car is Sunroof:-"+c1.isSunroof);
        System.out.println("---------------------------------------------");
        Bike b1=new Bike();
        b1.setsittingCapacity(2);
        System.out.println("Bike sitting Capacity is:-"+b1.sittingCapacity);
        System.out.println("----------------------------------------------");
        Riksha r1=new Riksha();
        r1.setRikshaSpeed(60);
        System.out.println("To check the Riksha Speed:-"+r1.RikshaSpeed);
    }

}
