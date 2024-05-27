package InhiritancePOJO.vehicalProgram;

public class Truck extends Vehicle{

        // truck specific attributes
        int loadCarryingCapacity;
        boolean isCovered;
        public void setloadCarryingCapacity(int loadCarryingCapacity)
        {
            this.loadCarryingCapacity = loadCarryingCapacity;
        }

        public int getloadCarryingCapacity()
        {
            return loadCarryingCapacity;
        }

    public void setisCoveredy(  boolean isCovered)
    {
        this.isCovered = isCovered;
    }

    public boolean getisCovered()
    {
        return isCovered;
    }

    }

