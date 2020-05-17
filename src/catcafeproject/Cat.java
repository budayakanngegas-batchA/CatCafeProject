/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catcafeproject;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author raygh
 */
public class Cat {
    private String catName;
    private String catSpecies;
    private ArrayList catDiet;
    private Date lastTimeFeed;
    
    //Get
    public String getCatName(){
        return catName;
    }
    
    public String getCatSpecies(){
        return catSpecies;
    }
    
    public ArrayList getCatDiet(){
        return catDiet;
    }
    
    public Date getLastTimeFed(){
        return lastTimeFeed;
    }
    //Set
    public void setCatName(String theCatName){
        this.catName = theCatName;
    }
    
    public void setCatspecies(String theCatSpecies){
        this.catSpecies = theCatSpecies;
    }
    
    public void setCatDiet(ArrayList theCatDiet){
        this.catDiet = theCatDiet;
    }
    
    //Constructor
    public Cat(){
    }

    public Cat(String a , String b , ArrayList c , Date d){
        this.catName = a;
        this.catSpecies = b;
        this.catDiet = c;
        this.lastTimeFeed = d;
    }
    
   
    
    
    
   
}
