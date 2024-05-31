package InhiritancePOJO.MachinePojo.Machinemodel;

import InhiritancePOJO.MachinePojo.Machineservices.MachineMain;

public class WashingMachine extends MachineMain {

    int MachineWeight;
    String MachineColor;
    public void setMachineWeight(int MachineWeight)
    {

        this. MachineWeight = MachineWeight();
    }

    private int MachineWeight() {
        return 0;
    }

    private int getMachineWeight()
    {
        return MachineWeight;
    }
    public void setMachineColor(String machineColor)
    {
        this.MachineColor=MachineColor;
    }
    public String getMachineColor()
    {
        return MachineColor;
    }


}
