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

    // main class methods //
    public static void selectCat(int i) {
        System.out.format("%3d%20s%20s%40s\n", i, catList.get(i).getCatName(), catList.get(i).getCatSpecies(), catList.get(i).getLastTimeFed());
    }

    public static void addCat(String name, String species, String lastTimeFeed) {
        Cat cat = new Cat(name, species, lastTimeFeed);
        catList.add(cat);
        selectCat(catList.size() - 1);
    }

    public static void listCat() {
        System.out.format("%3s%20s%20s%40s\n", "id", "name", "species", "lasttimefed");
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

                    addCat(catName, catSpecies, time);
                    break;
                case "2":
                    listCat();
                    
                    break;
                case "3":
                    break;
                case "4":
                    listCat();
                    break;
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
                    System.out.println("BIS 2023");
                    break;
            }
            System.out.println("");
            System.out.print("Command: ");
            command = scanner.nextLine();
        }
    }
}
