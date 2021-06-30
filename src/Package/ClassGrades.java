package Package;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ClassGrades {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int grade = scan.nextInt();
        if (grade >= 70 && grade <= 100)
            System.out.println("AA");
        else if (grade >= 50 && grade < 70)
            System.out.println("BB");
        else if (grade >= 35 && grade < 50)
            System.out.println("CC");
        else
            System.out.println("FF");
    }
}

