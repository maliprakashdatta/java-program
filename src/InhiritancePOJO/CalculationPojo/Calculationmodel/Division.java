package InhiritancePOJO.CalculationPojo.Calculationmodel;

import InhiritancePOJO.CalculationPojo.Calculationservices.CalculationMain;

public class Division extends CalculationMain {
    int Divisionvalue1;
    int Divisionvalue2;
    public void setDivisionvalue1(int Divisionvalue1)
    {
        this.Divisionvalue1 = Divisionvalue1;
    }

    public int getDivisionvalue1()
    {
        return Divisionvalue1;
    }
    public void setDivisionvalue2(int Divisionvalue2)
    {
        this.Divisionvalue2= Divisionvalue2;
    }

    public int getDivisionvalue2()
    {
        return Divisionvalue2;
    }

}
