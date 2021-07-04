package Week2_Homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CinemaDiscountedTickets {


    public static void main(String[] args) {
        System.out.println("Your ticket discount is : "+DiscountValue() +"%\nHave a lovely day! ");

    }

    public static int DiscountValue(){

        List<String> moviesTypes = new ArrayList<>();
        moviesTypes.add("Horror");
        moviesTypes.add("Romance");
        moviesTypes.add("Comedy");
        moviesTypes.add("Action");

        int age=0;
        int ticketDiscount = 0;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Welcome to the Cinema! " + "\n" +"Please enter your age: ");
        age = scanner.nextInt();
        if(age>18 && age <25)
            ticketDiscount+=5;
        if(age<=18)
            ticketDiscount+=10;

        System.out.println("Please enter the movie type you want to watch: " +
                "\nThese are the types of the movies we have : \n Horror, Romance, Comedy, Action");
        String movieType = scanner.next();
        if(moviesTypes.get(0).equals(movieType))
            ticketDiscount+=10;

        return ticketDiscount;
    }
}
