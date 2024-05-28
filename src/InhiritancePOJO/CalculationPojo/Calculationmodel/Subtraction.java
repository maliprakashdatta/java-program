package InhiritancePOJO.CalculationPojo.Calculationmodel;

import InhiritancePOJO.CalculationPojo.Calculationservices.CalculationMain;

public class Subtraction extends CalculationMain {
    int Subvalue1;
    int Subvalue2;
    public void setSubvalue1(int Subvalue1)
    {
        this.Subvalue1 = Subvalue1;
    }

    public int getSubvalue1()
    {
        return Subvalue1;
    }
    public void setSubvalue2(int Subvalue2)
    {
        this.Subvalue2= Subvalue2;
    }

    public int getSubvalue2()
    {
        return Subvalue2;
    }


}
