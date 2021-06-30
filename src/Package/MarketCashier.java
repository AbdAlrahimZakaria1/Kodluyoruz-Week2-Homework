package Package;

import java.util.Scanner;

public class ManavHomework {
    public static void main(String[] args) {
        double pears = 2.14;
        double apples = 3.67;
        double tomatoes = 1.11;
        double banana = 0.95;
        double eggplant = 5.00;
        double sum=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many KG of pears do you want? ");
        sum += scanner.nextInt()*pears;
        System.out.println("How many KG of apples do you want? ");
        sum += scanner.nextInt()*apples;
        System.out.println("How many KG of tomatoes do you want? ");
        sum += scanner.nextInt()*tomatoes;
        System.out.println("How many KG of banana do you want? ");
        sum += scanner.nextInt()*banana;
        System.out.println("How many KG of eggplant do you want? ");
        sum += scanner.nextInt()*eggplant;

        System.out.println(sum);
    }
}
