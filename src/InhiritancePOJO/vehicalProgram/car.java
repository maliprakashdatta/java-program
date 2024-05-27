package InhiritancePOJO.vehicalProgram;

public class car extends Vehicle{

        // car attributes
        boolean isSunroof;
        //boolean isAdasEnabled;
        public void setisSunroof(boolean  isSunroof)
        {
            this.isSunroof = isSunroof;
        }

        public boolean getisSunroof()
        {
            return isSunroof;
        }

    }

