// implement the below POJO classes with the help of inheritance:
//- Vehicle, Car, Bike, Truck, Rickshwa
package InhiritancePOJO.Vehicleservices;
import InhiritancePOJO.Vehiclemodel.Truck;
import InhiritancePOJO.Vehiclemodel.car;

public class mainVehical {
    public static void main(String[] args)
    {
      car carobj=new car();
      carobj.setCarname("TATA-Zest");
      carobj.setCarmodel(2015);
        System.out.println("-------------CarDetails------------------------");
        System.out.println("carName:-"+carobj.getCarname());
        System.out.println("carModel:-"+carobj.getCarmodel());
        System.out.println("--------------BikeDetails----------------------");
        //To stand the car object in Bike
        carobj.setBikename("Shine");
        carobj.setBikeprice(2017);
        System.out.println("Bikename:-"+carobj.getBikename());
        System.out.println("Bikeprice:-"+carobj.getBikeprice());
        System.out.println("---------------TRUCKDetails---------------------");
        Truck truckobj=new Truck();
        truckobj.setTruckname("Tank truck.");
        System.out.println("Truck Details:"+truckobj.getTruckname());
        System.out.println("---------------RikshaDetails---------------------");
        //to stand the truck object in riksha
        truckobj.setRikshaname("Auto");
        System.out.println("Rikshaname Details:"+truckobj.getRikshaname());



//        System.out.println("Enter the car Name:");
//        Scanner scanner=new Scanner(System.in);
//        String carname=scanner.nextLine();
//
//        System.out.println("Enter the car Model:");
//        String carmodel=scanner.nextLine();



    }
}
