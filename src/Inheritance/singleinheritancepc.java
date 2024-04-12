package Inheritance;
class employee
{
    float salary=4000;
}
class student extends employee
{
    int bonus=1000;
}

public class singleinheritancepc
{
    public static void main(String[] args) {
        student s1=new student();
        System.out.println("Salary of employ:"+s1.salary);
        System.out.println("bouns of student:"+s1.bonus);
    }
}
