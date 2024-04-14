package Array;

import java.util.Scanner;

public class subjectmarks {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Pl enter the Student Marks:");
        int subjectmarks[]=new int[5];
        subjectmarks[0]=scanner.nextInt();
        subjectmarks[1]=scanner.nextInt();
        subjectmarks[2]=scanner.nextInt();
        subjectmarks[3]=scanner.nextInt();
        subjectmarks[4]=scanner.nextInt();
        System.out.println("Marks for student are:");
        int position=0;
        while (position <= 4)
        {
            System.out.println("Marks fornSubject" +position+ "=" +subjectmarks[position]);
            position++;
        }
    }
}
