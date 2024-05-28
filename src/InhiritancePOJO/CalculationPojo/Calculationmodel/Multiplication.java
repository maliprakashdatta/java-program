package InhiritancePOJO.CalculationPojo.Calculationmodel;

import InhiritancePOJO.CalculationPojo.Calculationservices.CalculationMain;

public class Multiplication extends CalculationMain {
    int Multivalue1;
    int Multivalue2;
    public void setMultivalue1(int Multivalue1)
    {
        this.Multivalue1 = Multivalue1;
    }

    public int getMultivalue1()
    {
        return Multivalue1;
    }
    public void setMultivalue2(int Multivalue2)
    {
        this.Multivalue2= Multivalue2;
    }

    public int getMultivalue2()
    {
        return Multivalue2;
    }

}
