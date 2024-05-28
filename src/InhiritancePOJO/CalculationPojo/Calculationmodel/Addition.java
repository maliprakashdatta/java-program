package InhiritancePOJO.CalculationPojo.Calculationmodel;

import InhiritancePOJO.CalculationPojo.Calculationservices.CalculationMain;

public class Addition extends CalculationMain {

    int addvalue1;
    int addvalue2;
    public void setaddvalue1(int addvalue1)
    {
        this.addvalue1 = addvalue1;
    }

    public int getaddvalue1()
    {
        return addvalue1;
    }
    public void setaddvalue2(int addvalue2)
    {
        this.addvalue2 = addvalue2;
    }

    public int getaddvalue2()
    {
        return addvalue2;
    }


}

