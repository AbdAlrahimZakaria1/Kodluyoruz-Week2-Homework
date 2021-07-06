package Week2_Homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class StationeryDB {

    /*
    * This is the items database for our stationery
    * @author Abd Alrahim Zakaria - 05.07.2021
    */
    HashMap<String, Integer> stationeryItemsFrequency = new HashMap<>();
    HashSet<String> stationeryItems = new HashSet<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        StationeryDB object = new StationeryDB();
        while (true) {

            System.out.println("Welcome to the Database of a stationery! " + "\nPlease choose an action:" +
                    "\n1. Add an item to the database" + "\n2. Get the amount of an item in the stationery"
                    + "\n3. Get the number of items in the stationery" + "\nType the number of the operation to proceed");
            int operation = scanner.nextInt();
            if (operation == 1)
                object.addItem();
            else if (operation == 2)
                System.out.print(object.getFrequencyOfItem() + " of said item\n");
            else if (operation == 3)
                System.out.print(object.numOfItems() + "\n");
            else
                System.out.println("Please enter the number of the operation!");

            System.out.println("Do you wish to continue? Yes/No");
            if (scanner.next().equals("No")) {
                System.out.println("Bye-bye!");
                break;
            } else continue;
        }
    }

    /*
    * This method returns the frequency of the requested item
    */
    public int getFrequencyOfItem() {
        System.out.println("Enter the name of the item");
        String item = scanner.next();
        System.out.print("We have ");
        return stationeryItemsFrequency.get(item);
    }

    /*
    * This method adds an extra item to the database
    */
    public void addItem() {
        System.out.println("Welcome to the adding items section");
        System.out.println("Type \"Exit\" to exit");
        String item = scanner.next();
        while (!(item.equals("Exit"))) {


            if (!(stationeryItemsFrequency.containsKey(item))) {
                stationeryItemsFrequency.put(item, 1);
                stationeryItems.add(item);
            } else {
                Integer frequency = stationeryItemsFrequency.get(item);
                stationeryItemsFrequency.put(item, ++frequency);
            }
            item = scanner.next();
        }
    }

    /*
    * This method returns the number of item types in the stationery
    */
    public int numOfItems() {
        System.out.print("Number of items is: ");
        return stationeryItems.size();
    }
}

