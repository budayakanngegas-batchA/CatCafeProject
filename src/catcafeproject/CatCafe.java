/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catcafeproject;

import java.util.Date;
/**
 *
 * @author Crestfall
 */
public class CatCafe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     String time;
     Date date = new Date();
     time = date.toString();
     
     Dietary f1 = new Dietary("whiskas","10:00");
     Dietary f2 = new Dietary("catnip","17:00");
     Dietary f3 = new Dietary("catviera","21:00");
     
     Cat c1 = new Cat("C1T3R","Nigga",time);
     c1.setCatDiet(f1);
     c1.setCatDiet(f2);
     c1.setCatDiet(f3);
     
     System.out.println(c1.toString());
     c1.printFeedingSchedule();
    }
    
}
