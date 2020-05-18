/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catcafeproject;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Crestfall
 */
public class CatCafe {
    
    int a;

    // initialize ArrayList to contain cats and dietaries //
    private static final ArrayList<Cat> catList = new ArrayList();
    private static final ArrayList<Dietary> dietList = new ArrayList();

    public static void main(String[] args) {

        // initializations //
        
        // for some reason, i can't put it outside main //
        // it has to be from a static context //
        // funny, time is non static in the first place //
        Date date = new Date();
        Timestamp timestamp = new Timestamp(date.getTime());
        String time = timestamp.toString();

        Dietary f1 = new Dietary("whiskas", "10:00");
        Dietary f2 = new Dietary("catnip", "17:00");
        Dietary f3 = new Dietary("catviera", "21:00");

        Cat c1 = new Cat("C1T3R", "Nigga", time);
        c1.setCatDiet(f1);
        c1.setCatDiet(f2);
        c1.setCatDiet(f3);

        System.out.println(c1.toString());
        c1.printFeedingSchedule();

        // CMD Bootleg 1.0 by Davey //
        // Initial Creation //
        System.out.println("Menu:");
        System.out.println("1.Add Cat");
        System.out.println("2.Edit Cat");
        System.out.println("3.Remove Cat");
        System.out.println("4.List of Cats");
        System.out.println("5.Help");
        System.out.println("6.Credits");
        
        
        Scanner scanner = new Scanner(System.in);
        String command = "help";
        boolean finish = false;
        String catName,catSpecies;

        // Commands
        
        while (!finish) {
            switch (command) {
                //Command Input
                case "1":
                    System.out.println("Enter the Name !");
                    catName=scanner.nextLine();
                    System.out.println("Enter the Plate ! ");
                    catSpecies=scanner.nextLine();
                    System.out.println(date.toString());
                    time = date.toString();
                    Cat c2 = new Cat(catName,catSpecies,time);
                    catList.add(c2);
                    break;
                case "2":
                case "3":
                case "4":
                    
                // shows all commands //   
                case "5":
                    System.out.println("help: Show all commands.");
                    System.out.println("credits: Show credits.");
                    System.out.println("cat_add: Add a new cat.");
                    System.out.println("cat_edit: Edit a cat's data.");
                    System.out.println("cat_del: Delete a cat.");
                    System.out.println("cat_list: Show a cat's data.");
                    break;
                // maybe i should credit stack overflow too //
                case "6":
                    System.out.println("Cat Cafe");
                    System.out.println("by: Davey, Ray, Hanwin, Rex, Wira");
                    break;
            }
            System.out.println("");
            System.out.print("Command: ");
            command = scanner.nextLine();
        }
    }
}
