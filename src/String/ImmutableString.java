package String;

public class ImmutableString {
    public static void main(String[] args) {
        //To using by single string obj
        String s1="Hello String";
        System.out.println("Printed String:-"+s1);
        //To use Multi String object
        System.out.println("-------------------------------------------");
        String s2="First String";
        String s3="Second String";
        System.out.println("Printed String:-"+s2);
        System.out.println("Printed String:-"+s3);
        //To use the By equal() methods
        String s4="First String";
        String s5="Second String";
        String s6=new String("Prakash");
        String s7="First String";
        System.out.println("Printed String:-"+(s4.equals(s5)));
        System.out.println("Printed String:-"+(s4.equals(s6)));
        System.out.println("Printed String:-"+(s4.equals(s7)));
        System.out.println("-------------------------------------------");
        //To use the By==Operators() methods
        String s8="Prakash";
        String s9="Prakash";
        String s10=new String("Prakash");
        String s11="First String";
        System.out.println("Printed String:-"+(s8==s9));
        System.out.println("Printed String:-"+(s8==s10));
        System.out.println("Printed String:-"+(s8==s11));
        System.out.println("-------------------------------------------");
        // //To use the By ComaperTO() methods
        String s12="Prakash";
        String s13="Prakash";
        String s14=new String("Prakash");
        String s15="First String";
        System.out.println("Printed String:-"+(s12.compareTo(s13)));
        System.out.println("Printed String:-"+(s12.compareTo(s14)));
        System.out.println("Printed String:-"+(s12.compareTo(s15)));


    }
}
