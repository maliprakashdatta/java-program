package Inheritance;
class employee
{
    float salary=4000;
}
class student1 extends employee
{
    int bonus=1000;
}

public class singleinheritancepc
{
    public static void main(String[] args) {
        student1 s1=new student1();
        System.out.println("Salary of employ:"+s1.salary);
        System.out.println("bouns of student:"+s1.bonus);
    }
}
