package InhiritancePOJO.PersonHospitalPOJO.Personmodel;

import InhiritancePOJO.PersonHospitalPOJO.Personservices.Personmain;

public class Doctor extends Personmain {

    String DoctorName;
    String HospitalName;
    public void setDoctorName(String DoctorName)
    {
        this.DoctorName = DoctorName;
    }

    public String getDoctorName()
    {
        return DoctorName;
    }
    public void setHospitalName(String HospitalName)
    {
        this.HospitalName = HospitalName;
    }

    public String getHospitalName()
    {
        return HospitalName;
    }


}
