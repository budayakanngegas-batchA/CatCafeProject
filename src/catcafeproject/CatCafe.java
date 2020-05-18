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

    // initialize ArrayList to contain cats and dietaries //
    private static final ArrayList<Cat> catList = new ArrayList();
    private static final ArrayList<Dietary> dietList = new ArrayList();

    // main class methods //
    public static void selectCat(int i) {
        System.out.format("%3d%20s%20s%20s\n", i, catList.get(i).getCatName(), catList.get(i).getCatSpecies(), catList.get(i).getLastTimeFed());
    }

    public static void addCat(String name, String species, String lastTimeFeed) {
        Cat cat = new Cat(name, species, lastTimeFeed);
        catList.add(cat);
        selectCat(catList.size() - 1);
    }

    public static void listCat() {
        System.out.format("%3s%20s%20s%20s\n", "id", "name", "species", "lasttimefed");
        for (int i = 0; i < catList.size(); i++) {
            selectCat(i);
        }
    }

    public static void main(String[] args) {

        // initializations //
        // for some reason, i can't put it outside main //
        // it has to be from a static context //
        // funny, time is non static in the first place //
        Date date = new Date();
        Timestamp timestamp = new Timestamp(date.getTime());
        String time = timestamp.toString();

        // placeholder //
        Dietary f1 = new Dietary("whiskas", "10:00");
        Dietary f2 = new Dietary("catnip", "17:00");
        Dietary f3 = new Dietary("catviera", "21:00");

        Cat c1 = new Cat("C1T3R", "Nigga", time);
        c1.setCatDiet(f1);
        c1.setCatDiet(f2);
        c1.setCatDiet(f3);

        System.out.println(c1.toString());
        // c1.printFeedingSchedule();

        // CMD Bootleg 1.0 by Davey //
        // Initial Creation //
        Scanner scanner = new Scanner(System.in);
        String command = "5";
        String catName, catSpecies;

        // Commands //
        // you can label a while, so just break the while instead //
        // of using a new boolean //
        program:
        while (true) {
            switch (command) {
                //Command Input
                case "1":
                    System.out.println("Enter the cat's name.");
                    System.out.print("Name: ");
                    catName = scanner.nextLine();

                    System.out.println("Enter the cat's species.");
                    System.out.print("Species: ");
                    catSpecies = scanner.nextLine();

                    System.out.println(date.toString());

                    time = date.toString();
                    Cat c2 = new Cat(catName, catSpecies, time);
                    catList.add(c2);
                    break;
                case "2":
                case "3":
                case "4":

                // shows all commands //   
                case "5":
                    System.out.println("Menu:");
                    System.out.println("1.Add Cat");
                    System.out.println("2.Edit Cat");
                    System.out.println("3.Remove Cat");
                    System.out.println("4.List of Cats");
                    System.out.println("5.Help");
                    System.out.println("6.Credits");
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
