package String;

public class InsertMethodString {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Prakash Mali");

        System.out.println("Orignal String is:-"+sb);
        sb.insert(7," Dattatray ");
        System.out.println("inserted to String:-"+sb);
        System.out.println("-------------------------------------");
        //Insert to the prakash string to K
        StringBuffer str=new StringBuffer("Praash");
        System.out.println("Orignal String is:-"+str);
        str.insert(3,"k");
        System.out.println("inserted to  String:-"+str);

    }
}
