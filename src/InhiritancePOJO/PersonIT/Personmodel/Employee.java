package InhiritancePOJO.PersonIT.Personmodel;

import InhiritancePOJO.PersonIT.Personservices.PersonITmain;

public class Employee extends PersonITmain {
    String empName;
    String empAddress;
    int empAge;
    public void setempName(String empName)
    {
        this.empName = empName;
    }

    public String getempName()
    {
        return empName;
    }
    public void setempAddress(String empAddress)
    {
        this.empAddress = empAddress;
    }

    public String getempAddress()
    {
        return empAddress;
    }
    public void setempAge(int empAge)
    {
        this.empAge = empAge;
    }

    public int getempAge()
    {
        return empAge;
    }

}
