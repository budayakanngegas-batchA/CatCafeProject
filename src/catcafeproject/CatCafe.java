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
        Date dt = new Date();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Menu:");
        System.out.println("1.Add Cat");
        System.out.println("2.Edit Cat");
        System.out.println("3.Remove Cat");
        System.out.println("4.View Cat Data");
    }
    
}
