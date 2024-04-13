package Inheritance;

class fan
{
    void display()
    {
        System.out.println("fan is running...");
    }
}
class animal extends fan
{
    void show()
    {
        System.out.println("welcome animal class...");
    }
}
public class singleinheritance
{
    public static void main(String[] args) {
        animal a1=new animal();
        a1.show();
        a1.display();
    }
}
