package String;

public class capacityOfString {
    public static void main(String[] args) {
        StringBuffer str=new StringBuffer("Prakash ");
        System.out.println("To check the default capacity String:-"+str.capacity());
        System.out.println("----------------------------");
        //To use the append()
        str.append("Hello");
        System.out.println("Now Check the String:-"+str.capacity());
        System.out.println("----------------------------");
        //To add multi char is string
        str.append(" Hello, StepUp Learn");
        System.out.println("Now Check the String:-"+str.capacity());
        //To check the ensureCapacity() string
        System.out.println("-----------------------------");
        //To add a all belo string
        str.ensureCapacity(10);
        System.out.println("To check ensureCapacity string:" +str);

    }
}
