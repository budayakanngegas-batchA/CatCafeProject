/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catcafeproject;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Crestfall
 */
public class CatCafe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // initializations //
        String time;
        Date date = new Date();
        time = date.toString();

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
        Scanner scanner = new Scanner(System.in);
        String command = "help";

        // Commands
        while (true) {
            switch (command) {
                // wrong command output //
                default:
                    System.out.println("Unknown command.");
                    System.out.println("Refer to 'help' for list of commands.");
                    break;
                // shows all commands //   
                case "help":
                    System.out.println("help: Show all commands.");
                    System.out.println("credits: Show credits.");
                    System.out.println("1. Add Cat");
                    System.out.println("2. Edit Cat");
                    System.out.println("3. Remove Cat");
                    System.out.println("4. View Cat Data");
                    break;
                // maybe i should credit stack overflow too //
                case "credits":
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
