package InhiritancePOJO.PersonHospitalPOJO.Personmodel;

import InhiritancePOJO.PersonHospitalPOJO.Personservices.Personmain;

public class Surgeon extends Personmain {
    String SurgeonName;
    String SurgeonType;

    public void setSurgeonName(String SurgeonName) {
        this.SurgeonName = SurgeonName;
    }

    public String getSurgeonName() {
        return SurgeonName;
    }

    public void setSurgeonType(String SurgeonType) {
        this.SurgeonType = SurgeonType;
    }

    public String getSurgeonType() {
        return SurgeonType;
    }
}